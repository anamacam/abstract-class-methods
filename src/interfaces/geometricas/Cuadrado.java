package interfaces.geometricas;

public class Cuadrado extends FigurasGeométricas{

    private double ladoA;
    private double ladoB;
    private double base;


    public Cuadrado(double ladoA, double ladoB, double base) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.base = base;

    }

    @Override
    public double calcularArea() {
        this.name = "Cuadrado";
        this.area = ladoA * ladoB ;
        return area;
    }

    @Override
    public boolean tieneTodosLosLadosIguales() {
        return base == ladoA && base == ladoB;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                ", name='" + name + '\'' +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", base=" + base +
                ", area=" + area +
                '}';
    }
}
