package Zoo.Animals.Specifics;

public class Snake extends Zoo.Animals.Reptile{

    public Snake(String name, int age, String species, boolean isVenomous) {
        super(name, age, species, isVenomous);
    }
    @Override
    public void makeSound(){
        System.out.println("sssssnake ssssounds!");
    }
}
