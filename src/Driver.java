public class Driver{
    public static void main(String args[]){
        Customer c1 = new Customer("Justin");
        Regular regular = new Regular();
        Movie  m = new Movie("Gone with the wind", regular);
        Rental r = new Rental(m, 3);
        c1.addRental(r);

        Child child = new Child();
        m = new Movie("Finding Nemo", child);
        r = new Rental(m, 7);
        c1.addRental(r);

        Classic classic = new Classic();
        m = new Movie("Schindler's List", classic);
        r = new Rental(m, 7);
        c1.addRental(r);


        System.out.println(c1.statement());

    }
}