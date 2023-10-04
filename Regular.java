
public class Regular extends Movie {
	
	 
	
	private Regular(String name, int priceCode) {
		super(name, priceCode);
		// TODO Auto-generated constructor stub
	}

	protected static double Price(int a) {
		 
		double  m = 2;

			if (a > 2)

				m += cal(a);
			return m;
	 }
	 private static double cal(int a) {
   	  return (a-2)*1.5;
     }

}
