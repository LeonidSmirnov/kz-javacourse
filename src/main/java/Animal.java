/**
 * Created by Asus on 08.12.2016.
 */
public class Animal implements Pet {

    private final String name;

    public Animal(final String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(String.format("%s say :%s ", this.name, "beep"));
    }

    public String getName() {
        return this.name;
    }

    public String getNicname() {
        return this.name;
    }

    @Override
    public String toString() {
       return (this.getName());
    }
}
