package Insurance_Calculator;

public class HealthInsurance extends InsurancePolicy {
	            int age;
	            boolean isSmoker;
	            boolean hasPreExistingDiasease;
				
	            
	            
				public HealthInsurance() {
					super();
					this.age = 25;
					this.isSmoker = false;
					this.hasPreExistingDiasease = true;
					
				}

				public HealthInsurance(String policyHolderName, double basePremium,int age, boolean isSmoker, boolean hasPreExistingDiasease) {
					super(policyHolderName,basePremium);
					this.age = age;
					this.isSmoker = isSmoker;
					this.hasPreExistingDiasease = hasPreExistingDiasease;
				}

				public int getAge() {
					return age;
				}

				public void setAge(int age) {
					this.age = age;
				}

				public boolean isSmoker() {
					return isSmoker;
				}

				public void setSmoker(boolean isSmoker) {
					this.isSmoker = isSmoker;
				}

				public boolean isHasPreExistingDiasease() {
					return hasPreExistingDiasease;
				}

				public void setHasPreExistingDiasease(boolean hasPreExistingDiasease) {
					this.hasPreExistingDiasease = hasPreExistingDiasease;
				}
				
				
				double calculatePremium() {
					double premium=basePremium;
					
					if(age <=30) {
						premium+=basePremium *0.10;
						
						
					}
					else if(age<=45) {
						premium += basePremium *0.25;
						
					}
					else
					{
						premium += basePremium * 0.40;
					}
					
					if(isSmoker) {
						premium+=premium * 0.30;
						
						
					}
					else
					{
						premium -=premium * 0.05;
						
					}
					
					if (hasPreExistingDiasease) {
						premium += premium * 0.20;
					}
					
					return premium;
				}
				

}//class HealthInsurenace ends here
