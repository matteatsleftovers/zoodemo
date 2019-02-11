import java.util.ArrayList;

public class Pen {

    private String name;
    private ArrayList<Animal> animals;
    private ArrayList<BabyAnimal> babyAnimals;

    public Pen(String name) {
        this.name = name;
        this.animals = new ArrayList<Animal>();
        this.babyAnimals = new ArrayList<BabyAnimal>();
    }

    public void addAnimalToPen(Animal animal) {
        animals.add(animal);
        System.out.println("You have this many animals: " + animals.size());
    }

    public void addBabyAnimalToPen(BabyAnimal babyAnimal) {
        babyAnimals.add(babyAnimal);
        System.out.println("You have this many baby animals: " + babyAnimals.size());
    }

    public void showAllAnimals() {
        System.out.println("In the pen " + name + ",");
        System.out.println("These are your animals:");
        for (Animal animal: animals) {
            animal.printDetails();
        }
        System.out.println("These  are your baby animals:");
        for (BabyAnimal babyAnimal: babyAnimals) {
            babyAnimal.printDetails();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
