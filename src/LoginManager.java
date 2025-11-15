package LoginConsole;

import java.util.Scanner;

public class LoginManager {
	private UserService userService;
	private CaptchaService captchaService;
	
	private OtpService otpService;
      // constructor parameterized
	public LoginManager(UserService userService, CaptchaService captchaService, OtpService otpService) {
		super();
		this.userService = userService;
		this.captchaService = captchaService;
		this.otpService = otpService;
	}
	
	
	public void  startLogin() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Email_ID: ");
		String email=sc.nextLine();
		System.out.println("Enter Your Password: ");
		String password=sc.nextLine();
		
		if(! userService.verifyCredentials(email, password)) {
		     	System.out.println("❌ Invalid Email Or Password!..");
		     	return ;
		}
	     System.out.println("✅ Credentials Verified....");
	     
	     
	     String captcha=captchaService.generateCaptcha();
	     System.out.println("\nCaptcha: "+captcha);
	     String capInput=sc.nextLine();
			
		if(!captchaService.verifyCaptcha(capInput)) {
			System.out.println("❌ Captcha Incorrect!..");
			return;
		}
		System.out.println("Captcha Verified ✅");
		
		int otp=otpService.generateOTP();
		System.out.println("Generated OTP: "+otp);
		System.out.println("\n Enter OTP: ");
		int oTP=sc.nextInt();
		
		if(!otpService.verifyOTP(oTP)) {
			System.out.println("❌ OTP Incorrect!..");
			return;
		}
		System.out.println("Login Successful 🥳");
		
		
	}
	

}
