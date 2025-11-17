package Insurance_Calculator;

public class CarInsurance extends InsurancePolicy{
	        int carageInYears;
	        boolean hadAccidentInLastYear;
	        double carValue;
	        
	        
	        
	        
			
			public CarInsurance() {
				super();
				this.carageInYears = 5;
				this.hadAccidentInLastYear = false;
				this.carValue = 500000;
				
			}
			public CarInsurance(String policyHolderName, double basePremium,int carageInYears, boolean hadAccidentInLastYear, double carValue) {
				super(policyHolderName,basePremium);
				this.carageInYears = carageInYears;
				this.hadAccidentInLastYear = hadAccidentInLastYear;
				this.carValue = carValue;
			}
			public int getCarageInYears() {
				return carageInYears;
			}
			public void setCarageInYears(int carageInYears) {
				this.carageInYears = carageInYears;
			}
			public boolean isHadAccidentInLastYear() {
				return hadAccidentInLastYear;
			}
			public void setHadAccidentInLastYear(boolean hadAccidentInLastYear) {
				this.hadAccidentInLastYear = hadAccidentInLastYear;
			}
			public double getCarValue() {
				return carValue;
			}
			public void setCarValue(double carValue) {
				this.carValue = carValue;
			}
			
			double calculatePremium() {
				
				double premium=0;
				if( carageInYears <=3) {
					premium= basePremium * 0.10;
				}
				else if (carageInYears <=7) {
					premium= basePremium * 0.20;
					
				}
				else
				{
					premium= basePremium * 0.30;
				}
				//add basePremium or premium 
				premium +=basePremium;
				
				if(hadAccidentInLastYear) {
					
					premium += premium * 0.25; // loading
				}
				else
				{
		            premium -= premium * 0.10; // discount

				}
				
				
				if(carValue > 1000000) {
					  premium += 2000;
				}
				
				return premium;
			}
	        
	        
	        

}//class carInsurenace ends here
