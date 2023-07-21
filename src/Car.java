public class Car {

    //create variables for the Car
    String make;
    String model;
    int miles;
    int price;
    int doors;

    //create the constructor for the car class
    public Car(String make, String model, int miles, int price, int doors) {
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.price = price;
        this.doors = doors;
    }

    //allow the car to be driven an amount of miles that adds to the initial value
    public void drive( int myMiles){
        miles=miles+myMiles;

    }

    //reset the price of the car and output the information.
    public void forSale(int myPrice){
        price = myPrice;
        System.out.println("This is a "+make+" "+model+" that has travelled " +miles+" and has "+doors+ " doors and is available for "+price);
    }
}
