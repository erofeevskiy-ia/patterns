package creational.factory_method;

public class RoadTransport implements Transport {
  @Override
  public void delivery(String product) {
    System.out.println("Deliver " + product + "using car");
  }
}
