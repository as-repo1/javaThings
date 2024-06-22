public class SUV extends Vehicle {
    boolean fourWheelDrive;
    double cargoSpace;
    SUV(String brand, String model, int year, double price, boolean fourWheelDrive, double cargoSpace){
        super(brand, model, year, price);
        this.fourWheelDrive = fourWheelDrive;
        this.cargoSpace = cargoSpace;
    }

    void displaySUVInfo(){
        displayInfo();
        System.out.println("Four-Wheel Drive: " + fourWheelDrive + ", Cargo Space: " + cargoSpace + " cubic meters");
    }
//    public static void main(String[] args){
//        SUV car3 = new SUV("Ford", "Explorer", 2020, 35000, true, 2.5);
//        //Car car1 = new Car("Toyota", "Camry", 2021, 25000, null, null);
//    }
}