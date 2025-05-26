public class BinaryBits {
    public static void main(String[] args) {
        int n = -5; // Example number
        String binaryString = Integer.toBinaryString(n);
        System.out.println("Binary representation of " + n + " is: " + binaryString);
        
        int count = countBits(binaryString);
        System.out.println("Number of bits in binary representation: " + count);
    }

    // Method to count the number of bits in the binary string
   public static int countBits(String binaryString) {
        return binaryString.length();
    }    
}
