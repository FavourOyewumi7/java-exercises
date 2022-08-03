public class Dog extends Mammal implements IMammal{
    @Override
    public void move() {
        System.out.println("Inside Dog move");
    }
}
