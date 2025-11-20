package Zoo.Animals;

public class Mammal extends Zoo.Animal {
    private boolean isNocturnal;

    public Mammal(String name, int age, String species, boolean isNocturnal) {
        super(name, age, species);
        this.isNocturnal = isNocturnal;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }

    @Override
    public String toString() {
        return super.toString() + ", is nocturnal: " + isNocturnal;
    }
}
