public class packages
{
    private double weight;
    private double length;
    private double height;
    private double width;
    private double dim1;
    private double dim2;
    private double dim3;
    
    public packages(double howHeavy, double a, double b, double c)
    {
        weight = howHeavy;
        dim1 = a;
        dim2 = b;
        dim3 = c;
        length = 0;
        width = 0;
        height = 0;
    }
    public void determineLength()
    {
        if(dim1 >= dim2 && dim1 >= dim3)
        {
            length = dim1;
            width = dim2;
            height = dim3;
        }
        if(dim2 >= dim1 && dim2 >= dim3)
        {
            length = dim2;
            width = dim3;
            height = dim1;
        }
        if(dim3 >= dim1 && dim3 >= dim2)
        {
            length = dim3;
            width  = dim1;
            height = dim2;
        }
    }
    public double sumOfGirthLength()
    {
        return (width * 2) + (height * 2) + length;
    }
    public double getWeight()
    {
        return weight;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
}
