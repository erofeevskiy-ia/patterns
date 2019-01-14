package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonTest {

  @Test
  void testThatObjectIsSingleton(){
    Singleton instanceOne = Singleton.createInstance();
    Singleton instanceTwo = Singleton.createInstance();

    assertSame(instanceOne, instanceTwo);
  }
}