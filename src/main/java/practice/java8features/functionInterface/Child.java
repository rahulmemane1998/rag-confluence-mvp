package practice.java8features.functionInterface;

public class Child implements Parent
{
    @Override
    public void parentMethod() {
        System.out.println("THis is child overriden method");
    }
}
