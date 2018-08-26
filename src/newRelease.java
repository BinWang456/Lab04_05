public class newRelease implements MovieType{
	@Override
	public double getCharge(int _daysRented){
		double thisAmount = 0;
		thisAmount += _daysRented * 3;
		return thisAmount;
	}

	@Override
	public double getFrequentRenterPoints(int _daysRented){
		return 0;
	}
}