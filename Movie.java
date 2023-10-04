public class Movie extends DomainObject {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private static int _priceCode;

	public Movie(String name, int priceCode) {
		set_name(name);
		_priceCode = priceCode;
	}

	public static int get_priceCode() {
		return _priceCode;
	}
	public static void set_priceCode(int _priceCode) {
		Movie._priceCode = _priceCode;
	}

	public static int getChildrens() {
		return CHILDRENS;
	}

	public static int getRegular() {
		return REGULAR;
	}

	public static int getNewRelease() {
		return NEW_RELEASE;
	}

	public static int priceCode() {
    	  		return _priceCode;
	}
	public static double priceMovie(int a) throws InvalidPriceCodeException  {
	 int b=	priceCode();
	 if(b == CHILDRENS) {
		return Childerns.Price(a); 
	 }
	 else if(b==REGULAR) {
			 return Regular.Price(a);
	 }
	 else if(b==NEW_RELEASE) {
		 return NewRelease.Price(a);
	 		}
	 else
		 throw new InvalidPriceCodeException("Code de prix invalide : " + b);
	 }
	
	public static int priceMovie() { 
		 int b=	priceCode();
		 if(b == NEW_RELEASE)
			 return 1;
		 else return 0;
		 }
}