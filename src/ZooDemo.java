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
            switch(userInput) {
                case 1:
                    System.out.println("What's the name of the pen you would like to add?");
                    scanner.nextLine();
                    String penNameToAdd = scanner.nextLine();
                    Pen newPen = new Pen(penNameToAdd);
                    zoo.addPen(newPen);
                    break;
                case 2:
                    System.out.println("What is the name of the pen you would like to remove?");
                    scanner.nextLine();
                    String penNameToRemove = scanner.nextLine();
                    zoo.removePen(penNameToRemove);
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
