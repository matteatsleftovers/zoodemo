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
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animal at index " + i);
            animals.get(i).printDetails();
        }
        System.out.println("These are your baby animals:");
        for (int i = 0; i < babyAnimals.size(); i++) {
            System.out.println("Baby animal at index " + i);
            babyAnimals.get(i).printDetails();
        }
    }

    public void removeAnimal(int index) {
        Animal removedAnimal = animals.remove(index);
        System.out.println("You removed this animal: ");
        removedAnimal.printDetails();
    }

    public void removeBabyAnimal(int index) {
        BabyAnimal removedBabyAnimal = babyAnimals.remove(index);
        System.out.println("You removed this baby animal: ");
        removedBabyAnimal.printDetails();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
