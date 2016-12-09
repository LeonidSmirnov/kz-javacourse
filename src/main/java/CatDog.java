/**
 * Created by Asus on 08.12.2016.
 */
public class CatDog implements Pet {
private Pet cat;
private Pet dog;

public CatDog(Pet dog , Pet cat){
    this.dog = dog;
    this.cat = cat;
}

    public void makeSound() {

    }

    public String getName() {
        return String.format("%s%s", this.cat.getName() , this.dog.getName());
    }

    public String getNicname() {
        return getName();
    }
}
