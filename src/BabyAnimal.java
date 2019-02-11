public class BabyAnimal extends Animal {

    private int age;

    public BabyAnimal(String species, String size, String gender, int age) {
        super(species, size, gender);
        this.age = age;
    }

    @Override
    public void printDetails() {
        System.out.println("Your baby animal is a " + getSpecies() +
                ", it has this size: " + getSize() +
                ", it has this gender: " + getGender() +
                ", and it is " + age + " years old");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
