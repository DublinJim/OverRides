public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pet gen = new Pet(3,true,"Fluffy");

        Dog fido = new Dog(4,true,"Fido");

        gen.sayName();
        fido.sayName();
    }
}