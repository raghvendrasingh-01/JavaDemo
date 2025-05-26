public class MaskingandMerging {
    public static void main (String args[])
    {
        byte a=9,b=12,c=0;
        System.out.println("a = " + a + ", b = " + b);
         System.out.println("Binary representation of a = " + Integer.toBinaryString(a & 0xFF));
        System.out.println("Binary representation of b = " + Integer.toBinaryString(b & 0xFF));
        c=(byte)(c|a);
        b= (byte) ((byte)b<<4);
        c=(byte)(c|b);
        System.out.println("c = " + c);
        System.out.println("Binary representation of c = " + Integer.toBinaryString(c & 0xFF));
       
    }
}
