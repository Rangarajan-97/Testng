package CommonFile;

public class Runner extends LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		LoginPage object = new LoginPage();
		
		
		
		
		object.Open_Browser();
		object.Login_page();
		object. Setting_Page();
		object.CreateNewCalendar();
		//object.quit();

     
	}

}
