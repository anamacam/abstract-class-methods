package interfaces.geometricas;

public abstract class FigurasGeométricas {
    // protected hereda a el atributo a las clases hijas
    public static final double PI = 3.1416;
    protected String name;
    protected double area;

    public abstract double calcularArea();

    protected boolean tieneTodosLosLadosIguales(){
        return false;
    }


}
