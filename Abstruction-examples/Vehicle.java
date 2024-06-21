abstract public class Vehicle {
    abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println("this car starts with keys!! ");
    }
}

class Scooter extends Vehicle{
    void start() {
        System.out.println("this starts with a kick!!");
    }
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle scooter = new Scooter();

        car.start();
        scooter.start();
    }
}