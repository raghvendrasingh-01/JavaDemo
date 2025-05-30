public class StringPractice {
    
    public static void main(String args[])
    {
        String str ="$";
        boolean b=str.matches("\\W");
        System.out.println(b);
    }
}
