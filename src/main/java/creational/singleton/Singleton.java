package creational.singleton;

public class Singleton {
  private static Singleton instance;

  public static synchronized Singleton createInstance() {

    if (instance != null) {
      return instance;
    }
    return instance = new Singleton();
  }

  private Singleton() {
  }
}
