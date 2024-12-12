//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store store = new Store(80);

        Thread client1 = new Thread(new StoreClient(store,"Костянтин",30));
        Thread client2 = new Thread(new StoreClient(store,"Дарія",45));
        Thread client3 = new Thread(new StoreClient(store,"Ігор",35));

        client1.start();
        client2.start();
        client3.start();

    }
}