package je.panse.doro.hito.newsub;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_execute.CalcChol;
import je.panse.doro.comm.item_execute.CalcHbA1c;
import je.panse.doro.comm.item_execute.CalcTFT;
import je.panse.doro.comm.item_execute.CalcVitD;
import je.panse.doro.main.Enter;

public class New7LAB {
	public static void main(String args) throws Exception { 
		File_cdrw_proc nl1 = new File_cdrw_proc(); 
    	nl1.readfiler(Enter.wt + "/singlebeam/subnewmenu/7LAB_List");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
				switch (select_code) {
			  	case 1 : CalcHbA1c  nl2 = new CalcHbA1c(); 	nl2.main(null);break;
				case 2 : CalcTFT  nl3 = new CalcTFT(); 		nl3.main(null);break;
				case 3 : CalcChol nl4 = new CalcChol();		nl4.main(null);break;
				case 4 : CalcVitD nl5 = new CalcVitD();		nl5.main(null);break;

		   		
		   		case 9 : case 99 : case 999 :
		   			Key_Iwbb st999 = new Key_Iwbb();
		   			st999.Key_Iwbb_Page(select_code); break;
				default :System.out.println(" uncertain ... please check  !!");
				}
			}
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}	
// ----------
}
