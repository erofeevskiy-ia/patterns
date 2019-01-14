package creational.factory_method;

public class SeaTransport implements Transport {
  @Override
  public String delivery(String product) {
    return "Deliver " + product + "on boat";
  }
}
