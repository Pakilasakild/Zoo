package Zoo.Animals;

public class Reptile extends Zoo.Animal {
    private boolean isVenomous;

    public Reptile(String name, int age, String species, boolean isVenomous) {
        super(name, age, species);
        this.isVenomous = isVenomous;
    }

    @Override
    public void makeSound() {
        System.out.println("Reptile sounds");
    }

    @Override
    public String toString() {
        return super.toString() + ", is venomous: " + isVenomous;
    }
}
