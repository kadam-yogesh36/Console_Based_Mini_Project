package Insurance_Calculator;

public abstract class InsurancePolicy {
	              String policyHolderName;
	              double basePremium;
	              
	              
				  public InsurancePolicy() {
					super();
					this.policyHolderName = "Shubham Bhau";
					this.basePremium = 15000;
				
				}
				  public InsurancePolicy(String policyHolderName, double basePremium) {
				
					this.policyHolderName = policyHolderName;
					this.basePremium = basePremium;
				}
				  public String getPolicyHolderName() {
					  return policyHolderName;
				  }
				  public void setPolicyHolderName(String policyHolderName) {
					  this.policyHolderName = policyHolderName;
				  }
				  public double getBasePremium() {
					  return basePremium;
				  }
				  public void setBasePremium(double basePremium) {
					  this.basePremium = basePremium;
				  }
				  
				  //abstract method calculatePremium
				  abstract double calculatePremium();
				  
				  void printPolicyDetails() {
					  System.out.println("\n----- POLICY DETAILS -----");
					  System.out.println("Policy Holder Name :"+this.policyHolderName);
					  System.out.println("Base Premium : RS. "+this.basePremium);
					  System.out.println("Final Premium : RS. "+this.calculatePremium());
					  System.out.println("------------------------------");
				  }
				  
				  
				  
	              
	              

}//InsurancePolicy class ends here


