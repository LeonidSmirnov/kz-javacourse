/**
 * Created by Asus on 08.12.2016.
 */
public class Client {
    private  final String id;
    private  final Pet pet;

    public Client(String id , Pet pet){
        this.id = id;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "id :" + this.id + "    pet: " + this.pet;

    }
    public String getPetName(){
        return this.pet.getName();
    }
    public String getClientName(){
        return this.id;
    }
}
