import java.util.ArrayList;

public class Zoo {

    private ArrayList<Pen> pens;

    public Zoo() {
        this.pens = new ArrayList<Pen>();
    }

    public void printAllAnimalsInZoo() {
        System.out.println("Here are all your animals: ");
        for (int i = 0; i < pens.size(); i++) {
            pens.get(i).showAllAnimals();
        }
    }

}
