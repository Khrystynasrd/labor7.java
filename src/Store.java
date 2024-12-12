public class Store {
    private int stock;

    public Store(int stock) {
        this.stock = stock;
    }

    public synchronized void sell(int quantity, String clientName){
        System.out.println(clientName + " хоче купити " + quantity + " одиниць товару");
        if (quantity<=stock){
            stock-=quantity;
            System.out.println(clientName + " успішно купив " + quantity + " одиниць товару");
        } else {
            System.out.println(clientName + " не може купити товар. Недостатньо запасу");
        }
    }
}