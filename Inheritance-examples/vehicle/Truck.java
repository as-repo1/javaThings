public class Truck extends Vehicle {
    double payloadCapacity;
    int numAxles;
    Truck(String brand, String model, int year, double price, int payloadCapacity, int numAxles){
        super(brand, model, year, price);
        this.payloadCapacity = payloadCapacity;
        this.numAxles = numAxles;
    }

    void displayTruckInfo(){
        displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity + ", Number of Axles: " + numAxles);
    }
//    public static void main(String[] args){
//        Truck car4 = new Truck("Volvo", "VNL 300", 2019, 100000, 40, 2);
//        //Car car1 = new Car("Toyota", "Camry", 2021, 25000, null, null);
//    }
}