public class TransportationSystem{
    public static void main(String[] args){
        Car car = new Car("Honda", "Civic", 2022, 20000, 5, "Petrol");
        SUV suv = new SUV("Ford", "Explorer", 2020, 35000, true, 2.5);
        Truck truck = new Truck("Volvo", "VNL 300", 2019, 100000, 40, 2);

        car.displayCarInfo();
        suv.displaySUVInfo();
        truck.displayTruckInfo();
    }
}