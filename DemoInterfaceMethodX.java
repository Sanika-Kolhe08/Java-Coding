interface Circle
{
    // Characteristics      (public static final)
    float PI = 3.14f;       

    // Behaviours           (public abstract)
    float Area(float Radius);

    float Circum(float Radius);
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return Circle.PI * Radius * Radius;
    }

    public float Circum(float Radius)
    {
        return 2 * Circle.PI * Radius;
    }
}

class DemoInterfaceMethodX
{
    public static void main(String A[]) 
    {
        // Circle cobj = new Circle();      not allowed

        Marvellous mobj = new Marvellous();
        float Ret = 0.0f;

        Ret = mobj.Area(10.5f);
        System.out.println("Area is : " + Ret);

        Ret = mobj.Circum(10.5f);
        System.out.println("Circumference is : " + Ret);
    }
}
