/**
 * Created by Asus on 08.12.2016.
 */
public class Cat implements Pet {

    private Pet pet;
    public void makeSound() {
        System.out.println(String.format("miyau %s" , this.getName()));
    }


    public String getName() {
        return this.pet.getName();
    }

    public Cat(Pet pet) {
        this.pet = pet;
    }

    public String getNicname() {
        return getName();
    }

    @Override
    public String toString() {
        return getName();
    }
}
