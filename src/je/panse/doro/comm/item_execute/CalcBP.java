package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcBP {
	int SBP, DBP, PR;
	String BPresult;

	public static void main(String skeys) throws Exception {
		Key_Iwbb bb1 = new Key_Iwbb();
		CalcBP bp1 = new CalcBP();
		File_cdrw_proc fcp1 = new File_cdrw_proc(); 
		if (skeys == "Itemcategorykey") {
		}
		else {
			fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");
		}
    		try (Scanner input = new Scanner(System.in)) {
	        System.out.print("***** Input SBP   mmHg : ");
	        	bp1.SBP = input.nextInt();
	        System.out.print("***** Input DBP   mmHg : ");
	        	bp1.DBP = input.nextInt();
	        System.out.print("***** Input pulse rate / minute : ");
	        	bp1.PR = input.nextInt();
//        input.close();
	        	bp1.BPresult = ("    BP    [ " + bp1.SBP +  " / " 
	        	+ bp1.DBP + " ]mmHg" 
	        	+ "   PR [ " + bp1.PR + " ]/minute" + "  Regular LSP");
	       fcp1.writeliner(Enter.wts + "/6OBJ", bp1.BPresult);
			bb1.returnkeylist(skeys);
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
//---------------------------------------------------		
}