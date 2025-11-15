package LoginConsole;

public class UserService {
	 
	  private String fixedEmail="admin@gmail.com";
	  private String fixedPassword="Admin@123";
	  
	  
	  public boolean verifyCredentials(String email,String password) {
		  
		        return email.equals(fixedEmail) && password.equals(fixedPassword);
	  }

}
