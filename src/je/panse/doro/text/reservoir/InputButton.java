package je.panse.doro.text.reservoir;

import java.io.IOException;

import je.panse.doro.hito.StartForm;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class InputButton {
	public static void commentsButton(String cobu) throws IOException{
	
	}
	
	public static void quitButton(String cobu) throws Exception {
		StartForm.main(null);
	}

	public static void quitsaveButton(String cobu) throws Exception{
		Enter.main(null);
	}
//
//   	
//		  try {
//			ManageFile.deletefiler(Enter.wtf + "/3CC");
//			ManageFile.checkfiler(Enter.wtf + "/3CC");
//			ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
//			ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
//			ReadWriteToChartPlate.writeFile(Enter.wtf + "/3CC", chartline);
//			ReadWriteToChartPlate.writeFile(Enter.wtf + "/3CC", chartline1);
//			
//			PlatePrepUpdate.main(args);
//			NewPatientInput.main(null);
//		  } catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		  }
// --------------------------------------------
}