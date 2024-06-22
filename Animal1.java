public class Animal1 {
    //instance variable
    String color;
    int age;

    //by using methods
    void initObj(String c, int a){
        color = c;
        age = a;
    }
    void display(){
        System.out.println("color is: " + color + " & age is: " + age);
    }

    public static void main(String[] args){
        Animal1 buzo = new Animal1();

        //using reference variable
        buzo.color="blue";
        buzo.age=3;

        buzo.initObj("black", 5);
        buzo.display();
    }
}
