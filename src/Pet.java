public class Pet {

    private int legs;
    private boolean tail;
    private String name;

    public Pet(int legs, boolean tail, String name) {
        this.legs = legs;
        this.tail = tail;
        this.name = name;
    }

    public void sayName()
    {
        System.out.println("Your pet is called "+name+".");
    }

}
