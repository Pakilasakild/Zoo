package Zoo;

public class ZooKeeper {
    private String name;
    private String speciality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public ZooKeeper(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }
    public void feedAnimal(Animal animal){
        System.out.println(animal.getName() + " who is a " + animal.getSpecies() + " has been fed.");
    }
}
