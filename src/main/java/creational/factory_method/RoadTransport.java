package creational.factory_method;

public class RoadTransport implements Transport {
  @Override
  public String delivery(String product) {
    return "Deliver " + product + "using car";
  }
}
