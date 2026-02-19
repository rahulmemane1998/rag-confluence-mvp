package practice.java8features.functionInterface;

@FunctionalInterface
public interface SingleAbstractMethod
{
    //one abstract method, this method is by default public abstract
    void abstractMethod();

    //can have multiple default method
    default void defaultMethod1()
    {
    }

    default void defaultMethod2()
    {
        System.out.println("this is abstract method");
    }
}
