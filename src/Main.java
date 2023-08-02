public class Main {
    /*A method is a block of code which runs only when it is called
     * You can pass data, known as parameters, into a method
     * methods are used to perform certain actions, and they are also known as functions*/
    //Creating and calling a method
    // it must be declared within a class, it is defined with the name of the method followesd by parenthesis.
    static void myMethod() {
        System.out.println("I am happy");
    }
    public static void main(String[] args) {
        myMethod(); //calling a method, it outputs I am happy
        //it can also be called many times:
        myMethod();
        myMethod();
        myMethod();




    }
}