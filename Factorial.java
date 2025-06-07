public class Factorial {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the Number whose factorial is to be calculated");
        int n=sc.nextInt();
        int fact=1;
        while(n!=0)
        {
            fact=fact*n--;
        }
        System.out.println("Facatorial of the Number is "+fact);
        sc.close();
    }
    
}
