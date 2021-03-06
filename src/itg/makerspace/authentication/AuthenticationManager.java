package itg.makerspace.authentication;

import itg.makerspace.MainFrame;

public class AuthenticationManager {
	
	//public static String IP_ADRESS = "http://192.168.1.111:9292";
	//public static String IP_ADRESS = "http://192.168.194.196:9292";
	public static String IP_ADRESS = "https://itgmaker.space";
	public static boolean debug = true;
	
	public void login(MainFrame main, String email, String password) {
		LoginThread loginThread = new LoginThread(main, email, password);
		loginThread.start();
	}
	
	public void sendNewLoan(MainFrame main, int user_id, String auth_key, String items) {
		NewLoanThread loginThread = new NewLoanThread(main, user_id, auth_key, items);
		loginThread.start();
	}
}