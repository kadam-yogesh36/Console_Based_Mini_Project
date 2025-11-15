package LoginConsole;

import java.util.Random;

public class CaptchaService {
	
	private String generatedCaptcha;
	  
	public String generateCaptcha() {
		
		Random r=new Random();
		int captcha = 1000 + r.nextInt(9000); 
		
		generatedCaptcha=String.valueOf(captcha);
		
		return generatedCaptcha;
		
		
	}
	// check generated captcha or user entered captcha correct or not
	public boolean verifyCaptcha(String captcha) {
		
		return captcha.equals(generatedCaptcha);
	}
	
	     

}
