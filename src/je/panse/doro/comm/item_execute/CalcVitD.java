package je.panse.doro.comm.item_execute;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;
														
public class CalcVitD {
	public void main(String skeys) throws Exception { 
		double vitamin_D;
		String  VitDresult;

    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("========= Input 25-OH-Vitamin-D : ");
	        vitamin_D = input.nextDouble();
	        //      input.close();
	        VitDresult = ("    25-OH-Vitamin-D    [ " + vitamin_D +  " ] ng/mL" );
	        File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", VitDresult);
			       if (skeys == "Itemcategorykey") {
						fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
						Itemcategory.main(null);
					}
					else {
						fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/7LAB_List");
						New7LAB nc1 = new New7LAB();
						nc1.main(null);
					}
			
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
//---------------------------------------------------		
}