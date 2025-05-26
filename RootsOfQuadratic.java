import java.util.Scanner;

public class RootsOfQuadratic {
    public static void main(String args[])
    {
        double a, b, c, d, r1, r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients a, b and c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = (b * b) - (4 * a * c);
        if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } else if (d == 0) {
            r1 = r2 = -b / (2 * a);
            System.out.println("Roots are real and same");
            System.out.println("Root 1 = Root 2 = " + r1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex and different");
            System.out.println("Root 1 = " + realPart + "+" + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + "-" + imaginaryPart + "i");
        }
        sc.close();
    }
}
