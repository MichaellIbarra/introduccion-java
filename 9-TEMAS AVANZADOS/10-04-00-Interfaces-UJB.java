public interface Traductor {
    // public y abstract
    void traducir();

    // Metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a Ingles");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("Traduzco a Frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en Frances...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        // Traductor en Frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
