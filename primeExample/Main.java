//abstraction
abstract class Vehicle{
    private String brand;

    //encapsulation with getter and setter
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    //abstract-method
    abstract void start();
}


//inheritance
class Car extends Vehicle{
    private int speed;

    //Constructor
    public Car(String brand, int speed){
        setBrand(brand);
        this.speed = speed;
    }

    //encapsulation
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if(speed > 0) this.speed = speed;
        else System.out.println("Speed must be positive!!!");
    }

    //implementing the abstract method
    @Override
    void start(){
        System.out.println("this car starts with a key!!");
    }
}

class ElectricCar extends Car{
    private int batteryLife;

    //constructor
    public ElectricCar(String brand, int speed, int batteryLife){
        super(brand, speed);
        this.batteryLife = batteryLife;
    }

    //encapsulation
    public int getBatteryLife(){ return batteryLife; }

    public void setBatteryLife(int batteryLife){
        if(batteryLife > 0) this.batteryLife = batteryLife;
        else System.out.println("battery life must be in +ve");
    }

    @Override
    void start() {
        System.out.println("this car starts with a button!!");
    }
}

public class Main{
    public static void main(String[] args){

        //using the Car class
        Car myCar = new Car("Toyota", 120);
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Speed: " + myCar.getSpeed());
        myCar.start();

        //using the ElectricCar
        Vehicle myElectricCar = new ElectricCar("Tesla", 250, 500);
        System.out.println("Brand: " + myElectricCar.getBrand());
        myElectricCar.start();//calls the overridden method in ElectricCar
    }
}