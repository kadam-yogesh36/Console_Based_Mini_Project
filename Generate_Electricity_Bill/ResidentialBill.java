package Electricity_Bill;

class ResidentialBill extends ElectricityBill{
    
	
	
	
		public ResidentialBill(int units,String name) {
		super(units,name);
	}

		double calculateBill() {
			double amount=0;
			
			if( units<=100) {
				amount=units  * 2.5;
				
			}
			else if (units <=300) {
				amount= 100 * 2.5 + (units -100) * 3.5;
				
			}
			else {
				amount=100 * 2.5 + 200 * 3.5 + (units-300) * 5;
			}
			
			if(units >500) {
				amount+=150;
			}
			
			return amount;
			
		}
 
}//residentialBill class ends here
