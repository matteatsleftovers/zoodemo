public class Animal {

    private String species;
    private String size;
    private String gender;

    public Animal(String species, String size, String gender) {
        this.species = species;
        this.size = size;
        this.gender = gender;
    }

    public void printDetails() {
        System.out.println("Your animal is a " + species +
                ", it has this size: " + size +
                ", and it has this gender: " + gender);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
