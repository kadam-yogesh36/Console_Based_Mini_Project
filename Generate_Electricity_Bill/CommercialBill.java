package Electricity_Bill;

class CommercialBill extends ElectricityBill{
	
    
	public CommercialBill(int units,String name) {
		super(units,name);
	}

	double calculateBill() {
            
		double amount = units * 6.5;
		
		if (units < 200 ) {
			amount = 1500;
			
		}
		
		if( units > 1000) {
			
		amount += amount*0.8;
		
		}
		return amount;
		
}
	
}//CommercialBill class Ends here
