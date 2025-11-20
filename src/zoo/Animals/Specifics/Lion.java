package Zoo.Animals.Specifics;

public class Lion extends Zoo.Animals.Mammal{

    public Lion(String name, int age, String species, boolean isNocturnal) {
        super(name, age, species, isNocturnal);
    }

    @Override
    public void makeSound(){
        System.out.println("Lion roar!");
    }
}
