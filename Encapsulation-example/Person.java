public class Person{
  private String name;
  private int age;

  //public constructor to init the fields;
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  //Pbulic getter method for 'name'
  public String getName(){
    return name;
  }

  //Public setter method for 'name'
  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    if(age > 0){
      this.age = age;
    }else{
      System.out.println("Age must be possitive!");
    }
  }

  public static void main(String[] args){
    Person person = new Person("John Doe", 30);

    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());


    person.setName("Jane Doe");
    person.setAge(25);


    System.out.println("Updated Name: " + person.getName());
    System.out.println("Updated Age: " + person.getAge());
  }


}
