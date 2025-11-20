import java.util.ArrayList;

import Zoo.*;

public class Zoo {
    private String name;
    private ArrayList<Enclosure> enclosures = new ArrayList<>();
    private ArrayList<ZooKeeper> keepers = new ArrayList<>();

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void addKeeper(ZooKeeper keeper) {
        keepers.add(keeper);
    }

    public void listEnclosures() {
        for (int i = 0; i < enclosures.size(); i++){
            System.out.println(enclosures.get(i));
        }
    }

    public Zoo(String name) {
        this.name = name;
    }

    public void listAllAnimals() {
        for (int i = 0; i < enclosures.size(); i++) {
            enclosures.get(i).listAnimals();
        }
    }
}
