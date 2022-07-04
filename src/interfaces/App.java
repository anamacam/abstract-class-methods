package interfaces;

public class App {

    public static void main(String[] args) {
        // como serVivo es una clase abstracta no se puede instanciar, no se puede crear objetos de esta clase.
        Planta planta = new Planta();
        AnimalCarnívoro animala = new AnimalCarnívoro();

        planta.alimentarse();
        animala.alimentarse();
    }
}
