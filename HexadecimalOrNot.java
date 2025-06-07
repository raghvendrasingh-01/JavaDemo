public class HexadecimalOrNot {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number:");
        String input = sc.nextLine();
        
        // Check if the input is a valid hexadecimal number
        boolean isHexadecimal = input.matches("0[xX][0-9a-fA-F]+");
        
        if (isHexadecimal) {
            System.out.println("The number is a hexadecimal number.");
        } else {
            System.out.println("The number is not a hexadecimal number.");
        }
        
        sc.close();
    }
    
}
