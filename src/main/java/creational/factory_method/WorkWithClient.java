package creational.factory_method;

public class WorkWithClient {
    public static void main(String[] args) {
        Logistic logistic = new SeaLogisticCompany();
        logistic.createTransport().delivery("BOX");
    }
}
