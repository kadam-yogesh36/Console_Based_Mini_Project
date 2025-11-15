package LoginConsole;

import java.util.Random;

public class OtpService {
	
	private int generatedOTP;
	
	public int generateOTP() {
		
		generatedOTP=100000 + new Random().nextInt(900000);
		
		return generatedOTP;
		
	}
	
	public boolean verifyOTP(int otp) {
		
		return otp==generatedOTP;
		
		
	}
	
	
	
	
	

}
