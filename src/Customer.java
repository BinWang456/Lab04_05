import java.util.ArrayList;
import java.util.List;

public class Customer {
	
    private String name;
    private List<Rental> rentals;
    
    public Customer (String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }
	
	public void addRental(Rental rental) {
		rentals.add(rental);
	}
	
	public String getName (){
		return name;
	}
	
	public String statement() {
		
		String result = "Rental Record for " + getName() + "\n";
		
		for (Rental r: rentals) {
			//show figures for this rental
			result += "\t" + r.getMovie().getTitle() + "\t" + 	String.valueOf(r.getCharge()) + "\n";
		}
		
		/* Initial code for implemented the new requirement - frequent renter points
		 * Apply a series of refactoring techniques to improve the design
		 */

		// add frequent renter points
		int frequentRenterPoints = 0;
		for (Rental r: rentals) {
			  frequentRenterPoints += r.getFrequentRenterPoints();
		}			
		
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) +	"\n";
		// add footer line for frequent-renter points
		result += "You earned " + String.valueOf(frequentRenterPoints) 	+ " frequent renter points";
		return result;
	}


	public String htmlStatement() {
		String result = "";
		return result;
	}
	

	// Two options: Sometimes leave the old method to delegate to the old method.  This is useful if it is a public
	// method 
	
	private double getCharge(Rental r) {
		return r.getCharge();
	}
	
	private double getTotalCharge() {
		double result = 0;
		for (Rental r: rentals) {
			result += r.getCharge();
		}
		return result;
	}

}
