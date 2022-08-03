public class Mammal implements IMammal{

    public Mammal() {
        System.out.println("Inside Mammal Constructor");
    }

    @Override
    public void move() {
        System.out.println("Inside Mammal move");
    }
}
