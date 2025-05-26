
   
import java.util.*;

public class AreaOfTriangle 
   {
    public static void main(String[] args) 
    {
      Scanner sc =new Scanner (System.in);
      double a,b,c;
      System.out.println("Enter the value of the three sides of the triangle respectively");
      a=sc.nextDouble();
      b=sc.nextDouble();
      c=sc.nextDouble();
      if(a+b>c && a+c>b && b+c>a)
      {
          System.out.println("The triangle is valid");
          double s=(a+b+c)/2;
          double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
          System.out.println("The area of the triangle is "+area);
      }
      else
      {
          System.out.println("The triangle is not valid");
      }
      
      
    }
    
    
}