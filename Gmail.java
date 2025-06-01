import java.util.Scanner;
public class Gmail {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your email address:");
        String email =sc.next();
        email=email.trim();
        String username=email.substring(0,email.indexOf('@')),
        domain =email.substring(email.indexOf('@')+1);
        if(domain.matches("gmail..*"))
        {
            System.out.println("This is a Gmail address.");
        }
        else
        {
            System.out.println("This is not a Gmail address.");
        }
        

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
        
        sc.close();
    }

}
