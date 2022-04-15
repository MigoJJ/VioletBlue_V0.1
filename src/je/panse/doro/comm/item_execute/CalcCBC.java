package je.panse.doro.comm.item_execute;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcCBC {

	public void main(String skeys) throws Exception {
		double Hb;
		int WBC;
		int Plt;
		
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.print("========= Hb    WBC   Platelet : ");
    		Hb = input.nextDouble();
    		WBC = input.nextInt();
    		Plt = input.nextInt();
				
			String Hb1 = String.format("%.1f", Hb);
//	        input.close();
			String rHb  = (".   Hb  [ " + Hb1 + " ] g/dL");
			String rWBC  = (".   WBC [ " + WBC + " ] cells/L");
			String rPlt  = (".   Plt [ " + Plt + " ] billon/L");

			if (WBC == 0 | Plt == 0) {
				cbchb(rHb);
			}else {
				cbchb(rHb,rWBC,rPlt);
			}
        
		if (skeys == "Itemcategorykey") {
   		File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
			Itemcategory.main(null);
		}
		else {
			File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/7LAB_List");
			New7LAB nc1 = new New7LAB();
			nc1.main(null);
		}
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
    
	static void cbchb(String rHb) throws Exception {	
		File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writeliner(Enter.wts + "/7LAB", rHb);
	}
	static void cbchb(String rHb,String rWBC,String rPlt) throws Exception {			
		File_cdrw_proc fcp1 = new File_cdrw_proc();
		fcp1.writeliner(Enter.wts + "/7LAB", rHb);
		fcp1.writeliner(Enter.wts + "/7LAB", rWBC);
		fcp1.writeliner(Enter.wts + "/7LAB", rPlt);
		}
// ----------	
}