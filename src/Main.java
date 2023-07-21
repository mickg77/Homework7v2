// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //create instance of Sedan class, which is a subclass of the Car Object with a Chevrolet
        Car Chevrolet = new Sedan("Chevrolet", "Camara", 10000, 3000, 4);
        //create instance of Coupe Class, which is a subclass of the Car Object with a Corolla
        Car Corolla = new Coupe("Toyota", "Corolla", 15000, 23999, 2);

        //run the forSale method for the Chevrolet
        Chevrolet.forSale(3999);
        //run the forSale method for the Corolla
        Corolla.forSale(2044);
        //drive the corolla for 54 miles
        Corolla.drive(54);
        //run the forsale method again after it has been driven, we can revalue the car at this point.
        Corolla.forSale(2022);

    }
}