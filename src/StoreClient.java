public class StoreClient implements Runnable {
    private final Store store;
    private final String clientName;
    private final int quantityToBuy;

    public StoreClient(Store store, String clientName, int quantityToBuy) {
        this.store = store;
        this.clientName = clientName;
        this.quantityToBuy = quantityToBuy;
    }

    @Override
    public void run() {
        store.sell(quantityToBuy,clientName);
    }


}