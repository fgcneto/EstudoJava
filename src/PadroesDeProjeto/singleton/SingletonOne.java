package PadroesDeProjeto.singleton;

/**
 * Primeiro Singleton
 * @author Francisco Gomes Cordeiro Neto
 */
class SingletonOne {

    private static SingletonOne instance;

    private SingletonOne() {
        super();
    }

    public static SingletonOne getInstance(){
        if (instance == null) instance = new SingletonOne();
        return instance;
    }
}
