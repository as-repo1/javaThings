public class Vehicle {
    String brand;
    String model;
    int year;
    double price;

    //constructor
    Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand + ", Model: " + year + ", Price: $" + price);
    }

//    public static void main(String[] args) {
//        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2021, 25000);
//        vehicle1.displayInfo();
//    }
}