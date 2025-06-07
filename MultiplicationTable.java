public class MultiplicationTable {
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("Enter the number for which table is to be printed");
        int n=sc.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(n+"*"+i+"="+(n*i++));
        }
        sc.close();;
    }
    
}
