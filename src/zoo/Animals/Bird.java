package Zoo.Animals;

public class Bird extends Zoo.Animal{
    private double wingSpan;

    public Bird(String name, int age, String species, double wingSpan) {
        super(name, age, species);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sounds");
    }

    @Override
    public String toString() {
        return super.toString() + ", wingspan: " + wingSpan;
    }
}
