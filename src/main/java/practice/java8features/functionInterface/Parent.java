package practice.java8features.functionInterface;

@FunctionalInterface
public interface Parent
{
    public void parentMethod();

    default void defaultMethod() {
        System.out.println("THis is default method");
    }
}
