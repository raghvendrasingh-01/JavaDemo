public class BinaryToDecimal {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binaryString = sc.nextLine();
        
        // Validate the input to ensure it is a binary number
        if (!binaryString.matches("[01]+")) {
            System.out.println("Invalid binary number.");
            sc.close();
            return;
        }
        
        // Convert binary to decimal
        int decimalValue = Integer.parseInt(binaryString, 2);
        
        System.out.println("The decimal value of the binary number " + binaryString + " is: " + decimalValue);
        
        sc.close();
    }
    
}
