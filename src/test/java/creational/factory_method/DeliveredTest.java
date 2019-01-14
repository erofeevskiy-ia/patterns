package creational.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DeliveredTest {

  @Test
  void deliveringBySeaTest(){
    Logistic logistic = new SeaLogisticCompany();
    assertTrue(logistic.createTransport().delivery("BOX").toLowerCase().contains("boat"));
  }

}