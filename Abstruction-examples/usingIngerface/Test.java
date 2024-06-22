interface Inter1{
  void show();
  int a  =10;  // by default pulic static final;                                       
  default void display(){ 
    //we can use the default keyword in the default interface;
  }
}

interface Inter2{
  void display();
}

class Test implements Inter1{
  public void show(){
    System.out.println("from Test in the implements");
  }

  public void display(){System.out.println("from Inter2!!");}

  public static void main(String[] args){
    //Interr i = new Inter1();
    Test t = new Test();
    t.show();
    t.display();
  }
   
}
