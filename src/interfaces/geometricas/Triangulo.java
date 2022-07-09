package interfaces.geometricas;

import java.util.Objects;

public class Triangulo extends FigurasGeométricas {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;

    public Triangulo(double base, double altura, double ladoA, double ladoB) {
        this.name = "Triángulo";
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        this.name = "Triangulo";
        this.area = (base * altura)/2;
        return area;
    }

    @Override
    public boolean tieneTodosLosLadosIguales() {
        return base == ladoA && base == ladoB;

    }

    @Override
    public String toString() {
        return ", name='" + name + '\'' +
                ", area=" + area +
                "base=" + base +
                ", altura=" + altura +
                ", ladoA=" + ladoA +
                ", ladoB=" + ladoB;
    }
}






