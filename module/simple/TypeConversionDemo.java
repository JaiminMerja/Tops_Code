public class TypeConversionDemo {
    public static void main(String[] args) {
        int i = 100;
        long l;
        l=i;
        System.out.println("Implicit..."+l);
        int x;
        x=(int)l;
        System.out.println("Explicit..."+x);
        int a = 128;
        byte b;
        b=(byte)a;
        System.out.println("Byte..."+b);
    }
}
