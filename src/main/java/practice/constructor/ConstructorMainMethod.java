package practice.constructor;

public class ConstructorMainMethod
{
    public static void main(String[] args)
    {
        //this will print constructor with matching param
        ConstructorOverloading constructorOverloading =new ConstructorOverloading("Strong");

        //this will print constructor with matching param
        ConstructorOverloading constructorOverloading1 =new ConstructorOverloading("Strong", 1);

        ConstructorCalling calling  = new ConstructorCalling();

    }
}
