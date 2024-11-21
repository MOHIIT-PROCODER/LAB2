 
import java.util.Scanner;
 class HWQ3
{
    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the coordinate of first point x1,y1");
        double x1 = s1.nextDouble();
        double y1 = s1.nextDouble();

        System.out.println("Enter the coordinate of first point x2,y2");
        double x2 = s1.nextDouble();
        double y2 = s1.nextDouble();

        System.out.println("Enter the coordinate of first point x3,y3");
        double x3 = s1.nextDouble();
        double y3 = s1.nextDouble();

        double area=(Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
System.out.println("The area of triangle is:"+area);
    }
}