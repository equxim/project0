/* Justin P - did the if statements in the runner
 * Marco R - created methods in packages class
 * Brandon Wilson - created algorithm for finding longest dimension
 * Mehtab K - created the input statements
 */

import java.util.*;
public class runner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Weight of the package in pounds: ");
        double howHeavy = input.nextDouble();
        System.out.println("Enter three dimensions of the package in inches: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println("");
        
        String reasonInvalid = "error";//initializing
        boolean shipable = false;
        packages newPackage = new packages(howHeavy, a, b, c);
        newPackage.determineLength();
        
        if(70 < newPackage.getWeight())
        {
            reasonInvalid = "Package is too heavy";
        }
        if(100 < newPackage.sumOfGirthLength())//tried an && statement but it didnt work but this ghetto way does
        {
            reasonInvalid = "Package is too large";
            if(70 < newPackage.getWeight())
            {
                reasonInvalid = "Package is too large and too heavy";
            }
        }
        if(newPackage.sumOfGirthLength() <= 100 && newPackage.sumOfGirthLength() > 0 && newPackage.getWeight() <= 70 && newPackage.getWeight() > 0)
        {
            shipable = true;
            reasonInvalid = "Package is acceptable";
        }
        if(a <= 0 || b <= 0 || c <= 0)
        {
            shipable = false;
            reasonInvalid = "Dimensions invalid";
        }
        if(newPackage.getWeight() <= 0)
        {
            reasonInvalid = "Weight invalid";
        }
        System.out.println("Length: " + newPackage.getLength());
        //System.out.println("Weight " + newPackage.getWeight());
        System.out.println("Sum of girth + length " + newPackage.sumOfGirthLength());
        //System.out.println("Width: " + newPackage.getWidth());
        //System.out.println("Height: " + newPackage.getHeight());
        System.out.println("Package shipable: " + shipable);
        System.out.println(reasonInvalid);
        
    }
}
