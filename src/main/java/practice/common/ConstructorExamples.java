package practice.common;

public class ConstructorExamples
{
    String value = "Strong";
    ConstructorExamples()
    {
        System.out.println("This is Constructor");
    }

    ConstructorExamples(String s)
    {
        this.value = s;
        System.out.println("This is one parameters Constructor");
    }

    ConstructorExamples(String s, int j)
    {
        System.out.println("This is two parameters Constructor");
    }
}
