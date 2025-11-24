package Zoo;

import java.util.ArrayList;

public class Enclosure {
    private String name;
    private String habitatType;
    private ArrayList<Animal> animals = new ArrayList<>();

    public Enclosure(String habitatType, String name) {
        this.habitatType = habitatType;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(String habitatType) {
        this.habitatType = habitatType;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }
    public void listAnimals(){
        for (int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }
    }
    public String toString(){
        return "Enclosure: " + getName() + ", habitat: " + habitatType + ", there are " + animals.size() + " animals in this enclosure.";
    }
}
