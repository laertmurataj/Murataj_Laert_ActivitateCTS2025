package ro.cts.clase;

public class User implements Observer{
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void recieveAlert(String message) {
        System.out.println(name + " recieved alert: "+ message);

    }
}
