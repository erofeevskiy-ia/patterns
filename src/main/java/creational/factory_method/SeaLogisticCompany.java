package creational.factory_method;

public class SeaLogisticCompany extends Logistic{

    public Transport createTransport(){
     return new SeaTransport();
    }
}
