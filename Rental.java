class Rental extends DomainObject {
	public int daysRented() {
		return _daysRented;
	}

	public Tape tape() {
		return _tape;
	}

	private Tape _tape;

	public Rental(Tape tape, int daysRented) {
		_tape = tape;
		_daysRented = daysRented;
	}
     public double getAmount(){
    	 int dr = daysRented();
    	 return Tape.getTape(dr);
     }
     public String nom() {
    	 return Tape.getname();
     }
     public int tonew(){
    	 int dr = daysRented();
    	 if(dr<=1)
    	 {
    		 return 0;
    	 }
    	 else 
    		 return Tape.isitnew();
     }
     
	public Tape get_tape() {
		return _tape;
	}

	public void set_tape(Tape _tape) {
		this._tape = _tape;
	}

	public int get_daysRented() {
		return _daysRented;
	}

	public void set_daysRented(int _daysRented) {
		this._daysRented = _daysRented;
	}

	private int _daysRented;
}