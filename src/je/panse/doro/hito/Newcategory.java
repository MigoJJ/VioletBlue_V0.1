package je.panse.doro.hito;

import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_execute.CalcACC;
import je.panse.doro.comm.item_execute.CalcBP;
import je.panse.doro.comm.item_execute.CalcDitto;
import je.panse.doro.comm.item_execute.CalcHbA1c;
import je.panse.doro.hito.newsub.*;
import je.panse.doro.main.Enter;

public class Newcategory {
// --------------------------------------------	
	public void main(String agrs) throws Exception {
		try {	
			File_cw_chart  ob3 = new File_cw_chart(); 
	    	ob3.cleanChartPlate();
	    	switching();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}	
// --------------------------------------------    	
    void switching() throws Exception {
		File_cdrw_proc fcp = new File_cdrw_proc(); 

		try (Scanner new_code = new Scanner(System.in)){
   		while (true) {
		   	System.out.println("Enter selected code number ...   : ");
		   	int select_code = Integer.valueOf(new_code.nextLine().trim());
		   	switch (select_code) {
		   		case 1 : New3CC n31 = new New3CC(); n31.main(null);break;
		   		case 2 : New4PMH.main(null);break;
				case 3 : New5SUJ.main(null, null);break;
		   		case 4 : 
		    		fcp.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");
		   			New6OBJ.main(null);break;
				case 5 : 
		    		fcp.readfiler(Enter.wt + "/singlebeam/subnewmenu/7LAB_List");
					New7LAB.main(null);break;
				case 6 : 
			    	fcp.readfiler(Enter.wt + "/singlebeam/subnewmenu/8ACC_List");
					New8ACC.main(null);break;
				case 7 : 
			    	fcp.readfiler(Enter.wt + "/singlebeam/subnewmenu/9PLAN_List");
					New9PLAN.main(null);break;

				case 42 : CalcBP ob1 = new CalcBP();	 	ob1.main(null);break;
				case 51 : CalcHbA1c ob2 = new CalcHbA1c();ob2.main(null);break;
				case 61 : CalcACC ob3 = new CalcACC();	 	ob3.main(null);break;
				case 71 : CalcDitto ob4 = new CalcDitto();ob4.main(null);break;
				
		   		case 9 : case 99: case 999 :	
		   			Key_Iwbb st999 = new Key_Iwbb(); 
		   			st999.Key_Iwbb_Page(select_code); break;
				default :
					System.out.println(" uncertain ... please check  !!");
		   }
//		new_code.close();
   			}
		}catch (NumberFormatException e) {
		e.printStackTrace();
		}
    }
 // --------------------------------------------
}
