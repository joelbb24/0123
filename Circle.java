


public class Circle
{
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }


    public void calcCirc(double radius)
    {
        System.out.println("The circumeference is: "+ (2*(3.14)*radius));
        System.out.println("Diameter: "+ (2*radius));

    }

}
