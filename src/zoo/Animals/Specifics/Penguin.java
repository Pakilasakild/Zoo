package Zoo.Animals.Specifics;

public class Penguin extends Zoo.Animals.Bird{

    public Penguin(String name, int age, String species, double wingSpan) {
        super(name, age, species, wingSpan);
    }

    @Override
    public void makeSound(){
        System.out.println("Penguin quack!");
    }
}
