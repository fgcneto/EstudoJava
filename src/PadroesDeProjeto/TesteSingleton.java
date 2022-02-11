package PadroesDeProjeto;

public class TesteSingleton {
    public static void main(String[] args) {
        SingletonOne singletonOne = SingletonOne.getInstance();
        System.out.println("Primeira Instância do Singleton One " + singletonOne);
        System.out.println("Testando a Instância do Singleton One " + singletonOne);

        SingletonTwo singletonTwo = SingletonTwo.getInstance();
        System.out.println("Primeira Instância do Singleton Two" + singletonTwo);
        System.out.println("Testando a Instância do Singleton Two" + singletonTwo);

        SingletonThree singletonThree = SingletonThree.getInstance();
        System.out.println("Primeira Instância do Singleton Three" + singletonThree);
        System.out.println("Testando a Instância do Singleton Three" + singletonThree);
    }
}
