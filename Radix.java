import java.util.Scanner;
public class Radix {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String n= sc.next();
        if (n.matches("[0-9]+")) {
            System.out.println("The number is in decimal format.");
        } if (n.matches("[0-1]+")) {
            System.out.println("The number is in binary format.");
        }  if (n.matches("[0-7]+")) {
            System.out.println("The number is in octal format.");
        } if (n.matches("[0-9a-fA-F]+")) {
            System.out.println("The number is in hexadecimal format.");
        } else {
            System.out.println("The number is in an unknown format.");
        }
        sc.close();

    }
    
}
