class A{
    int i=10;
}

// this REFERS TO THE CURRENT CLASS INSTANCE VARIABLE
//super MUST HAVE A CONCEPT OF INHERITANCE

class B extends A{
    int i=20;
    void show(int i){
        System.out.println("Local i: " + i); //local var i
        System.out.println("Instance i in B: " + this.i); // Instance var i in B
        System.out.println("Instance i in A: " + super.i); // Instance var i in A

    }

    public static void main(String[] args){
        B ob = new B();
        ob.show(30);
    }
}