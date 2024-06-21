import java.net.ProxySelector;

public class Test {
    void show() {
        System.out.println("1");
    }
}

class Xyz extends Test{
    void show(){
        super.show();
        // now it will show the parent class, it's the only way
        // static method can not be override
        System.out.println("2");
    }

    /*public static void main(String[] args){
        Xyz obj = new Xyz();
        obj.show();
    }*/
}

class Abc extends Test{
    void show(){
        super.show();
        System.out.println("this extends from Xyz");
    }
    public static void main(String[] args){
        Abc objabc = new Abc();
        Xyz objxyz = new Xyz();
        objabc.show();
        objxyz.show();
    }
}
