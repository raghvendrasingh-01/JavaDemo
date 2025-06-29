public class Pattern4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Print spaces
            }
          
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print stars
            }  
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("* "); // Mirror the left side
            } System.out.println(); 
            }
            // Mirror the upper pattern downside
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Print spaces
                }
                for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                }
                for (int j = i - 1; j >= 1; j--) {
                System.out.print("* ");
                }
                System.out.println();
           // Move to the next line
        }
        
        sc.close();
    }
    
}
