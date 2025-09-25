public class DefaultStaticDemo {
    public static void main(String[] args) {
        NewClass newClass = new NewClass();
        newClass.defaultMethod();
        MyInterface.staticMethod();
    }
}

interface MyInterface{
    default void defaultMethod(){
        System.out.println("In Default Method!");
    }

    static void staticMethod(){
        System.out.println("In Static Method!");
    }
}

class NewClass implements MyInterface{

}
