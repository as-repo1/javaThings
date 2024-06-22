public class ThisNote {
    private int instanceVariable;

    // 1. this keyword can be used to refer to the current instance variable
    public void setInstanceVariable(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // 2. this keyword can be used to invoke the current class method
    public void display() {
        this.print();
    }

    public void print() {
        System.out.println("Instance Variable: " + this.instanceVariable);
    }

    // 3. this() can be used to invoke the current class constructor
    public ThisNote() {
        this(5); // invoking parameterized constructor
    }

    public ThisNote(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // 4. this can be used to pass as an argument in the method call
    public void passAsArgument() {
        this.someMethod(this);
    }

    public void someMethod(ThisNote thisNote) {
        System.out.println("Method called with instance: " + thisNote);
    }

    // 5. this can be used to pass as an argument in the constructor call
    public void createAnotherInstance() {
        AnotherClass anotherClass = new AnotherClass(this);
    }

    // 6. this can be used to return the current class instance from the method
    public ThisNote getInstance() {
        return this;
    }

    public static void main(String[] args) {
        ThisNote thisNote = new ThisNote();

        // 1. Setting and displaying instance variable
        thisNote.setInstanceVariable(10);
        thisNote.display(); // Output: Instance Variable: 10

        // 3. Using parameterized constructor
        ThisNote thisNote2 = new ThisNote(20);
        thisNote2.display(); // Output: Instance Variable: 20

        // 4. Passing as argument to method
        thisNote.passAsArgument();

        // 5. Passing as argument to constructor
        thisNote.createAnotherInstance();

        // 6. Returning current instance
        ThisNote returnedThisNote = thisNote.getInstance();
        returnedThisNote.display(); // Output: Instance Variable: 10
    }
}

class AnotherClass {
    public AnotherClass(ThisNote thisNote) {
        System.out.println("AnotherClass created with instance: " + thisNote);
    }
}