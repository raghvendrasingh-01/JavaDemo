public class CorrectDateOrNot {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a date in the format dd/mm/yyyy:");
        String input = sc.nextLine();
        
        // Check if the input is a valid date
        boolean isValidDate = input.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}");
        
        if (isValidDate) {
            System.out.println("The date is valid.");
        } else {
            System.out.println("The date is not valid.");
        }
        
        sc.close();
    }
    
}
