/**
 * Created by Asus on 08.12.2016.
 */
public class Dog implements Pet {

    private Pet pet;

    public Dog(Pet pet){this.pet = pet;}


    public void makeSound() {
        this.pet.makeSound();
        System.out.println("Gav , Gav");
    }

    public String getName() {
        return this.pet.getName();
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getNicname() {
        return getName();
    }
}
