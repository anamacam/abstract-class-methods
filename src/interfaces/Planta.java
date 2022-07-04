package interfaces;

public class Planta extends SeresVivos {
// la palabra reservada override índica se está sobrescribiendo el método abstracto de la clase padre.
    @Override
    public void alimentarse() {
        System.out.println(" la planta se alimenta a través de la fotosíntesis");
    }
}
