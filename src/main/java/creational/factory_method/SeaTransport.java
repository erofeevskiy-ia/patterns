package creational.factory_method;

public class SeaTransport implements Transport {
    @Override
    public void delivery(String product) {
        System.out.println("Deliver " + product + "on boat");
    }
}
