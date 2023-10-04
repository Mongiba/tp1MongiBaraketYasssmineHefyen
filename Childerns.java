
public class Childerns extends Movie {
	
 
 public Childerns(String name, int priceCode) {
		super(name, priceCode);
		// TODO Auto-generated constructor stub
	}

protected static double Price(int a) {
	double m = 1.5;

		if (a > 3)

			m += cal(a);
		return m;
 }
      private static double cal(int a) {
    	  return (a-3)*1.5;
      }


}
