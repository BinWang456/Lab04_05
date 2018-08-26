
public class Classic implements MovieType{
    @Override
    public double getCharge(int _daysRented){
        double thisAmount = 0;
        if (_daysRented > 5)
            thisAmount += (_daysRented - 5) * 1;
        return thisAmount;
    }

    @Override
    public double getFrequentRenterPoints(int _daysRented){
        return 3;
    }
}