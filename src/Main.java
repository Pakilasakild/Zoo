import Zoo.*;
import Zoo.Animals.Specifics.*;

public class Main {

    public static void main(String[] args) {

        // 1. Create the zoo
        Zoo myZoo = new Zoo("City Zoo");

        // 2. Create enclosures
        Enclosure savannah = new Enclosure("Savannah Habitat", "Grassland");
        Enclosure reptileHouse = new Enclosure("Reptile House", "Desert");
        Enclosure penguinPool = new Enclosure("Penguin Pool", "Aquatic");

        myZoo.addEnclosure(savannah);
        myZoo.addEnclosure(reptileHouse);
        myZoo.addEnclosure(penguinPool);

        // 3. Create Animals (with species)
        Animal lion1 = new Lion("Simba", 5, "Lion", false);
        Animal lion2 = new Lion("Nala", 4, "Lion", false);

        Animal snake1 = new Snake("Kaa", 7, "Python", true);
        Animal snake2 = new Snake("Nagini", 3, "Cobra", true);

        Animal penguin1 = new Penguin("Skipper", 6, "Emperor Penguin", 0.5);
        Animal penguin2 = new Penguin("Kowalski", 4, "Emperor Penguin", 0.45);

        // 4. Add animals to enclosures
        savannah.addAnimal(lion1);
        savannah.addAnimal(lion2);

        reptileHouse.addAnimal(snake1);
        reptileHouse.addAnimal(snake2);

        penguinPool.addAnimal(penguin1);
        penguinPool.addAnimal(penguin2);

        // 5. Zookeepers
        ZooKeeper mammalKeeper = new ZooKeeper("Alice", "Mammals");
        ZooKeeper reptileKeeper = new ZooKeeper("Bob", "Reptiles");
        ZooKeeper birdKeeper   = new ZooKeeper("Charlie", "Birds");

        myZoo.addKeeper(mammalKeeper);
        myZoo.addKeeper(reptileKeeper);
        myZoo.addKeeper(birdKeeper);

        System.out.println("--------------------------------------------------");
        System.out.println(" Zoo initialized with enclosures and keepers ");
        System.out.println("--------------------------------------------------\n");

        // 6. Test makeSound()
        System.out.println("Animals making sounds:");
        lion1.makeSound();
        snake1.makeSound();
        penguin1.makeSound();
        System.out.println();

        // 7. Zookeepers feed animals
        System.out.println("Zookeepers feeding animals:");
        mammalKeeper.feedAnimal(lion1);
        reptileKeeper.feedAnimal(snake1);
        birdKeeper.feedAnimal(penguin1);
        System.out.println();

        // 8. List animals per enclosure (using getInfo())
        System.out.println("Listing animals per enclosure:\n");

        System.out.println("Enclosure: " + savannah.getName());
        savannah.listAnimals();
        System.out.println();

        System.out.println("Enclosure: " + reptileHouse.getName());
        reptileHouse.listAnimals();
        System.out.println();

        System.out.println("Enclosure: " + penguinPool.getName());
        penguinPool.listAnimals();
        System.out.println();

        // 9. List all enclosures
        System.out.println("All enclosures in the zoo:");
        myZoo.listEnclosures();
        System.out.println();

        // 10. List ALL animals in zoo
        System.out.println("All animals in the zoo:");
        myZoo.listAllAnimals();
        System.out.println();
    }
}
