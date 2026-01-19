package practice.java8features.functionInterface;

public class InterfaceClass implements MyInterface
{
    @Override
    public void myMethod()
    {
        System.out.println("This is Interface method MyMethod body");
    }

    @Override
    public void myMethod2() {
        System.out.println("This is Interface method MyMethod2 body");
    }

    public static void main(String[] args)
    {
        InterfaceClass interfaceClass = new InterfaceClass();
        interfaceClass.myMethod();
        interfaceClass.myMethod2();
    }
}
