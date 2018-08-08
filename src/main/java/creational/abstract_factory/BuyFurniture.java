package creational.abstract_factory;

public class BuyFurniture {
    public static void main(String[] args) {
        FurnitureFactory modernFurniture = new ModernFurniture();

        modernFurniture.createChair();
        modernFurniture.createSofa();

    }
}
