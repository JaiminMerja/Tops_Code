package module.collection;

import java.util.Stack;

public class StackDemo 
{
    public static void main(String[] args) 
    {
        Stack s1 = new Stack();
        System.out.println("Default Size is:"+s1.size());
        System.out.println("Default Value is:"+s1);
        s1.push(143);
        s1.push("Jimmy");
        s1.push(59.90f);
        System.out.println("New Size is:"+s1.size());
        System.out.println("New Value is:"+s1);
        s1.pop();
        System.out.println("New Size is:"+s1.size());
        System.out.println("New Value is:"+s1);
        s1.peek();
        System.out.println("New Size is:"+s1.size());
        System.out.println("New Value is:"+s1);
    }
}
