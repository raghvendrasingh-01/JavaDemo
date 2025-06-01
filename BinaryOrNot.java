import java.util.Scanner;
public class BinaryOrNot {

    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        String b=n+"";
        boolean isBinary=b.matches("[01]+");
        if(isBinary)
        {
            System.out.println("The number is a binary number.");
        }
        else
        {
            System.out.println("The number is not a binary number.");
        }
        sc.close();
    }
}
