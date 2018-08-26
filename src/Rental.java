public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	Movie getMovie() {
		return _movie;
	}

	double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	double getFrequentRenterPoints() {
	    return _movie.getFrequentRenterPoints(_daysRented);
    }

}
