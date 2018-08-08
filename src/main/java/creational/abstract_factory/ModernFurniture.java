package creational.abstract_factory;

public class ModernFurniture implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair() {
            @Override
            String whoAmI() {
                return "I am ModernChair";
            }
        };
    }

    @Override
    public Sofa createSofa() {
        return ()->"I am ModernSofa";
    }
}
