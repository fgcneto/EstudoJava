package PadroesDeProjeto.singleton;

/**
 * @author Francisco Gomes Cordeiro Neto
 * @see <a href= "https://stackoverflow.com/a/24018148">Referência</a>
 *  ** This pattern is beneficial for at least 3 reasons:
 * 1 - Static factory
 * 2 - Lazy initialization
 * 3 - Thread safe
 */
public class SingletonThree {

    private static class InstanceSingletonThree{
        public static SingletonThree instance = new SingletonThree();
    }

    private SingletonThree (){}

    public static SingletonThree getInstance(){
        return InstanceSingletonThree.instance;
    }
}
