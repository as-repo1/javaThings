public class Car extends Vehicle{
    int seatingCapacity;
    String fuelType;

    Car(String brand, String model, int year, double price, int seatingCapacity, String fuelType){
        super(brand, model, year, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    void displayCarInfo(){
        displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }

//    public static void main(String[] args){
//        Car car2 = new Car("Honda", "Civic", 2022, 20000, 5, "Petrol");
//        //Car car1 = new Car("Toyota", "Camry", 2021, 25000, null, null);
//    }
}