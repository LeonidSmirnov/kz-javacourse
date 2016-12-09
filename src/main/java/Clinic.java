import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 08.12.2016.
 */
public class Clinic {


    private final List<Client> clients = new ArrayList();

    public void addClient(final int position , Client client){
        clients.add(position , client);
    }

    public void findNicname(String nickname){

        for (Client client: clients
             ) {
            if(nickname.equals(client.getPetName())){
                System.out.println("Поиск прошел успешно");
                System.out.println(client);
                System.out.println( "------------------------------------------------------");
            }

        }

    }
    public void createNicname(String nickname,String newNicname)
    {
        for (int i =0 ; i< clients.size(); i++){
            if (nickname.equals(this.clients.get(i).getClientName())){

                addClient(i , new Client(newNicname ,new Cat(new Animal(this.clients.get(i).getPetName() ))));
            }else {

                if (nickname.equals(this.clients.get(i).getClientName())){
                    clients.remove(i);
                    addClient(i , new Client(newNicname ,new Dog(new Animal(this.clients.get(i).getPetName() ))));
            }}

        }
    }

    public void printClient(){
        for (Client client: clients
             ) {
            System.out.println(client);

        }
    }
}
