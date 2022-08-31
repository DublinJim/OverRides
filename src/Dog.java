public class Dog extends Pet{
private String name;

    public Dog(int legs, boolean tail, String name, String name1) {
        super(legs, tail, name);
        this.name = name1;
    }

    public Dog(int legs, boolean tail, String name) {
        super(legs, tail, name);
    }
    public void sayName()
    {
        System.out.println("Your Dog is called "+name+ ".");
    }
}
