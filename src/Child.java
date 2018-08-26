
public class Child implements MovieType {
    @Override
    public double getCharge(int _daysRented){
        double thisAmount = 0;
        thisAmount += 1.5;
        if (_daysRented > 3)
            thisAmount += (_daysRented - 3) * 1.5;
        return thisAmount;
    }

    @Override
    public double getFrequentRenterPoints(int _daysRented){
        return 0;
    }
}