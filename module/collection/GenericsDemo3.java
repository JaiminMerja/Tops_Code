package module.collection;

class Box<T>
{
    private T value;

    public void setValue(T value)
    {
        this.value=value;
    }
    public T getvalue()
    {
        return value;
    }
}
public class GenericsDemo3 
{
    public static void main(String[] args) 
    {
        Box<Integer> b = new Box<>();
        b.setValue(10);
        System.out.println(b.getvalue());

        Box<String> b1 = new Box<>();
        b1.setValue("Mango");
        System.out.println(b1.getvalue());
    }
}
