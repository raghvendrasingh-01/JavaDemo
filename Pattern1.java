import java.util.Scanner;
public class Pattern1 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int n= sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.printf("%02d ",(++count));
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
