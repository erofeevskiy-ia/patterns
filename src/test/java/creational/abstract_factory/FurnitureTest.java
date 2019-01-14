package creational.abstract_factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class FurnitureTest {

  @DisplayName("")
  @Test
  void testThatChairIsModernSuccessTest() {

    FurnitureFactory modernFurniture = new ModernFurniture();
    Chair chair = modernFurniture.createChair();

    assertTrue( chair.whoAmI().contains("Modern"));
  }

}