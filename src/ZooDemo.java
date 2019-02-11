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
            System.out.println("4. Add baby animal to pen");
            System.out.println("5. Remove animal from pen");
            System.out.println("6. Remove baby animal from pen");
            System.out.println("7. Display all animals in a pen");
            System.out.println("8. Display all animals in the zoo");

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
                    if (zoo.getPens().isEmpty()) {
                        System.out.println("You need to create a pen first!");
                    } else {
                        System.out.println("Which pen would you like to add to?");
                        zoo.printPenNames();
                        int penIndex = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("What's the species of the animal?");
                        String animalSpecies = scanner.nextLine();
                        System.out.println("What's the size of the animal?");
                        String animalSize = scanner.nextLine();
                        System.out.println("What's the gender of the animal?");
                        String animalGender = scanner.nextLine();
                        Animal newAnimal = new Animal(animalSpecies, animalSize, animalGender);
                        zoo.getPens().get(penIndex).addAnimalToPen(newAnimal);
                    }
                    break;
                case 4:
                    if (zoo.getPens().isEmpty()) {
                        System.out.println("You need to create a pen first!");
                    } else {
                        System.out.println("Which pen would you like to add to?");
                        zoo.printPenNames();
                        int penIndex = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("What's the species of the baby animal?");
                        String babyAnimalSpecies = scanner.nextLine();
                        System.out.println("What's the size of the baby animal?");
                        String babyAnimalSize = scanner.nextLine();
                        System.out.println("What's the gender of the baby animal?");
                        String babyAnimalGender = scanner.nextLine();
                        System.out.println("What's the age of the baby animal?");
                        int babyAnimalAge = scanner.nextInt();
                        scanner.nextLine();
                        BabyAnimal newBabyAnimal = new BabyAnimal(babyAnimalSpecies, babyAnimalSize, babyAnimalGender, babyAnimalAge);
                        zoo.getPens().get(penIndex).addBabyAnimalToPen(newBabyAnimal);
                    }
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
}
