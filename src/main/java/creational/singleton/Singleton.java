package creational.singleton;

public class Singleton {
    private Singleton instance;

    public Singleton createInstance(){
        if (instance!=null)
            return instance;
        return new Singleton();
    }

    private Singleton()
    {}
}
