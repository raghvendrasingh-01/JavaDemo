public class WebsiteType 
{
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a website URL:");
        String url = sc.nextLine().trim();
        
        switch(url.substring(0, url.indexOf(":"))) {
            case "http":
            case "https":
                System.out.println("This is a web address.");
                break;
            case "ftp":
                System.out.println("This is an FTP address.");
                break;
            case "file":
                System.out.println("This is a file address.");
                break;
            default:System.out.println("This is an unknown type of address.");
                
        }
        sc.close();
    }
    
}
// This code checks the type of a website URL based on its protocol (http, https, ftp, file).