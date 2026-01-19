package practice.constructor;

public class ConstructorOverloading
{
    String value = "Strong";
    ConstructorOverloading()
    {
        System.out.println("This is Constructor");
    }

    ConstructorOverloading(String s)
    {
        this.value = s;
        System.out.println("This is one parameters Constructor");
    }

    ConstructorOverloading(String s, int j)
    {
        System.out.println("This is two parameters Constructor");
    }
}
