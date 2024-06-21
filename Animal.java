public class Animal {
    public void eat(){
        System.out.println("i am eating");
    }
    public static void main(String[] args){
        System.out.println("1");

        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();

        Animal coco = new Animal();
        coco.eat();
        coco.run();
//        coco.fly();
// will not work, not in Animal class
// can be used through inheritance

        Birds sparow = new Birds();
        sparow.fly();
    }
    public void run(){
        System.out.println("i am running");
    }
}

class Birds{
    void fly(){
        System.out.println("i am flying");
    }
}