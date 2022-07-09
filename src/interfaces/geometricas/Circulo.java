package interfaces.geometricas;

public class Circulo extends FigurasGeométricas{

    private double radio;

    public Circulo(double radio) {
        this.name = "Círculo";
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        this.area = radio * radio * PI;
        return area;
    }

    @Override
    public String toString() {
        return  ", name='" + name + '\'' +
                "radio=" + radio +
                ", area=" + area;
    }
}
