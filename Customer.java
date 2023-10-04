import java.util.Enumeration;
import java.util.Vector;

class Customer extends DomainObject {
	public Customer(String name) {
		set_name(name);
	}

	private String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + name() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			thisAmount += each.getAmount();
			totalAmount += thisAmount;
// add frequent renter points
			frequentRenterPoints++;
// add bonus for a two day new release rental
			
			if (each.tonew() == 1) {
				frequentRenterPoints++;
			}
//show figures for this rental
			result +=res1(each.nom(),thisAmount); 

		}
//add footer lines
		result +=res2(totalAmount); 
		result +=res3(frequentRenterPoints);
		return result;
	}
    public Vector get_rentals() {
		return _rentals;
	}

	public void set_rentals(Vector _rentals) {
		this._rentals = _rentals;
	}

	private String res1(String s1,double s2) {
    	 return "\t" + s1 + "\t" + String.valueOf(s2) + "\n";
    }
    private String res2(double s1) {
    	return "Amount owed is " + String.valueOf(s1) + "\n";
    }
    private String res3(int s1) {
    	return "You earned " + String.valueOf(s1) + "frequent renter points";
    }
	private void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	private Vector _rentals = new Vector();
}