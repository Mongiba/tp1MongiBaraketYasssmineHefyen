class Tape extends DomainObject {
	public String get_serialNumber() {
		return _serialNumber;
	}

	public void set_serialNumber(String _serialNumber) {
		this._serialNumber = _serialNumber;
	}

	public Movie get_movie() {
		return _movie;
	}

	public void set_movie(Movie _movie) {
		this._movie = _movie;
	}

	public Movie movie() {
		return _movie;
	}

	public Tape(String serialNumber, Movie movie) {
		_serialNumber = serialNumber;
		_movie = movie;
	}

	private String _serialNumber;
	private Movie _movie;
	public static double getTape(int a) {
		try {
			return Movie.priceMovie(a);
		} catch (InvalidPriceCodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Double.NaN;
		}
		
	}
	public static int isitnew() {
		return Movie.priceMovie();
	}
	public static String getname() {
		return Movie.name();
	}
}