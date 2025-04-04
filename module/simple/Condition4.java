public class Condition4 {
    public static void main(String[] args) {
        int a=100,b=100,c=100;
        if(a>=b && a>=c) {
            System.out.println("A is Max...");
        } else if (b>=a && b>=c) {
            System.out.println("B is Max...");
        } else {
            System.out.println("C is Max...");
        }
    }   
}
