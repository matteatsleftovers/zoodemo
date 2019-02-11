public class ZooDemo {

    public static void main(String[] args) {
        Pen lions = new Pen("lions");
        Animal lion = new Animal("lion", "large", "female");
        lions.addAnimalToPen(lion);
        lions.addBabyAnimalToPen(new BabyAnimal("lion", "small", "male", 1));
        lions.showAllAnimals();

        Zoo zoo = new Zoo();
        zoo.addPen(lions);
        zoo.printAllPens();
        zoo.removePen("lions");
        zoo.printAllPens();
    }
}
