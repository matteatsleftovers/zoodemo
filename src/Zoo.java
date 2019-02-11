import java.util.ArrayList;

public class Zoo {

    private ArrayList<Pen> pens;

    public Zoo() {
        this.pens = new ArrayList<Pen>();
    }

    public void addPen(Pen pen) {
        pens.add(pen);
        System.out.println("You now have this many pens: " + pens.size());
    }

    public void printPenNames() {
        System.out.println("Here are the names of your pens in the zoo: ");
        for (int i = 0; i < pens.size(); i++) {
            System.out.println("Pen at index " + i);
            System.out.println(pens.get(i).getName());
        }
    }

    public void printAllPens() {
        System.out.println("Here are all your pens in the zoo: ");
        for (int i = 0; i < pens.size(); i++) {
            System.out.println("Pen at index " + i);
            pens.get(i).showAllAnimals();
        }
    }

    public void removePen(String name) {
        for (int i = 0; i < pens.size(); i++) {
            if (name.equalsIgnoreCase(pens.get(i).getName())) {
                System.out.println("You just removed a pen with the details below");
                Pen removedPen = pens.remove(i);
                removedPen.showAllAnimals();
            } else {
                System.out.println("Sorry, no pen by that name exists.");
            }
        }
    }

    public ArrayList<Pen> getPens() {
        return pens;
    }

    public void setPens(ArrayList<Pen> pens) {
        this.pens = pens;
    }
}
