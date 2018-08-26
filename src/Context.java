public class Context{
    private MovieType MovieType;

    public Context(MovieType MovieType){
        this.MovieType = MovieType;
    }

    public double getCharge(int _daysRented){
        return MovieType.getCharge(_daysRented);
    }

    public double getFrequentRenterPoints(int _daysRented){
        return MovieType.getFrequentRenterPoints(_daysRented);
    }
}