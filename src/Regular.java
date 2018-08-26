public class Regular implements MovieType{
    @Override
    public double getCharge(int _daysRented){
        double thisAmount = 0;
        thisAmount += 2;
        if (_daysRented > 2)
            thisAmount += (_daysRented - 2) * 1.5;
        return thisAmount;
    }

    @Override
    public double getFrequentRenterPoints(int _daysRented){
        if (_daysRented > 1)
            return 2;
        else
            return 1;
    }
}