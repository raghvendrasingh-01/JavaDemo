import java.util.Scanner;
public class Pattern { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int n= sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("\s\s");
            }
            
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
