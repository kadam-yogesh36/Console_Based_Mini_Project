package LoginConsole;

public class LoginApp {
	public static void main(String[] args) {

	       UserService userService=new UserService();
	       CaptchaService captchaService=new CaptchaService();
	       OtpService otpService=new OtpService();
	       
	       LoginManager login = new LoginManager(userService,captchaService,otpService);
	          login.startLogin();
	}
	}

