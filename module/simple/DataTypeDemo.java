public class DataTypeDemo 
{
    public static void main(String[] args) 
    {
        int i1 = 10;// 4 byte
        long l1 = 12323;// 8 byte
        float f1 = 45.67f;// 4 byte
        double d1 = 728372.283;// 8 byte
        byte b1 = 123;// 1 byte
        char c = 'T';// 2 byte
        boolean b = true;// 1 bit
        System.out.println("Int...."+i1);
        System.out.println("Long..."+l1);
        System.out.println("Float..."+f1);
        System.out.println("Double...."+d1);
        System.out.println("Byte...."+b1);
        System.out.println("Char...."+c);
        System.out.println("Boolean...."+b);
        System.out.println("Integer size.."+Integer.BYTES);
        System.out.println("Float size.."+Float.BYTES);
        System.out.println("Long size.."+Long.BYTES);
        System.out.println("Double size.."+Double.BYTES);
    }    
}
