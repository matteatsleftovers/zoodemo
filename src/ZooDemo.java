import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        boolean repeat;
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();

        do {
            System.out.println("Welcome to the zoo!");
            System.out.println("What would you like to do?");
            System.out.println("1. Set up pen");
            System.out.println("2. Remove pen");
            System.out.println("3. Add animal to pen");
            System.out.println("4. Remove animal from pen");
            System.out.println("5. Display all animals in a pen");
            System.out.println("6. Display all animals in the zoo");

            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch(userInput) {
                case 1:
                    System.out.println("What's the name of the pen you would like to add?");
                    String penNameToAdd = scanner.nextLine();
                    Pen newPen = new Pen(penNameToAdd);
                    zoo.addPen(newPen);
                    break;
                case 2:
                    System.out.println("What is the name of the pen you would like to remove?");
                    String penNameToRemove = scanner.nextLine();
                    zoo.removePen(penNameToRemove);
                    break;
                case 3:
                    createAnimal(zoo, scanner);
                    break;
                case 4:
                    deleteAnimal(zoo, scanner);
                    break;
                case 5:
                    System.out.println("Which pen would you like to see?");
                    zoo.printPenNames();
                    int penIndex = scanner.nextInt();
                    scanner.nextLine();
                    zoo.getPens().get(penIndex).showAllAnimals();
                    break;
                case 6:
                    zoo.printAllPens();
                    break;
                default:
                    System.out.println("That's not an option.");
                    break;
            }

            System.out.println("\nWould you like to continue? y/N");
            String continueInput = scanner.nextLine();
            repeat = continueInput.equals("y");
        } while(repeat);
    }

    private static void createAnimal(Zoo zoo, Scanner scanner) {
        if (zoo.getPens().isEmpty()) {
            System.out.println("You need to create a pen first!");
        } else {
            System.out.println("Which pen would you like to add to?");
            zoo.printPenNames();
            int penIndex = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Is this animal a baby?");
            String babyInput = scanner.nextLine();
            boolean isABaby = babyInput.equals("y");
            System.out.println("What's the species of the animal?");
            String animalSpecies = scanner.nextLine();
            System.out.println("What's the size of the animal?");
            String animalSize = scanner.nextLine();
            System.out.println("What's the gender of the animal?");
            String animalGender = scanner.nextLine();
            if (isABaby) {
                System.out.println("What's the age of the baby animal?");
                int babyAnimalAge = scanner.nextInt();
                scanner.nextLine();
                BabyAnimal newBabyAnimal = new BabyAnimal(animalSpecies, animalSize, animalGender, babyAnimalAge);
                zoo.getPens().get(penIndex).addBabyAnimalToPen(newBabyAnimal);
            } else {
                Animal newAnimal = new Animal(animalSpecies, animalSize, animalGender);
                zoo.getPens().get(penIndex).addAnimalToPen(newAnimal);
            }
        }
    }

    private static void deleteAnimal(Zoo zoo, Scanner scanner) {
        System.out.println("Which pen would you like to remove an animal from?");
        zoo.printPenNames();
        int penIndex = scanner.nextInt();
        scanner.nextLine();
        zoo.getPens().get(penIndex).showAllAnimals();
        System.out.println("Are you removing an adult or a baby?");
        String adultOrBabyChoice = scanner.nextLine();
        boolean deleteBaby = adultOrBabyChoice.equals("baby");
        if (deleteBaby) {
            if (zoo.getPens().get(penIndex).getBabyAnimals().isEmpty()) {
                System.out.println("There are NO babies.");
            } else {
                System.out.println("What's the number of the baby animal?");
                int babyAnimalIndex = scanner.nextInt();
                scanner.nextLine();
//                        This is another way to write our method chain. Use this approach in debugging.
//                        ArrayList<Pen> pens = zoo.getPens();
//                        Pen tempPen = pens.get(penIndex);
//                        tempPen.removeBabyAnimal(babyAnimalIndex);
                zoo.getPens()
                        .get(penIndex)
                        .removeBabyAnimal(babyAnimalIndex);
            }
        } else {
            if (zoo.getPens().get(penIndex).getAnimals().isEmpty()) {
                System.out.println("There are NO animals (that are adults).");
            } else {
                System.out.println("What's the number of the animal?");
                int animalIndex = scanner.nextInt();
                scanner.nextLine();
                zoo.getPens()
                        .get(penIndex)
                        .removeAnimal(animalIndex);
            }
        }
    }
}
