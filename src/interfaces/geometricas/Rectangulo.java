package interfaces.geometricas;

public class Rectangulo extends FigurasGeométricas{
    private double ladoA;
    private double ladoB;

    public Rectangulo(double ladoA, double ladoB) {

        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        this.name = "Rectángulo";
        this.area = ladoA * ladoB;
        return area;

    }

    @Override
    public boolean tieneTodosLosLadosIguales() {
        return ladoA == ladoB;
    }

    @Override
    public String toString() {
        return ", name='" + name + '\'' +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", name='" + name + '\'' +
                ", area=" + area;
    }
}
