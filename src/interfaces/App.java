package interfaces;
import interfaces.geometricas.Circulo;
import interfaces.geometricas.FigurasGeométricas;
import interfaces.geometricas.Rectangulo;
import interfaces.geometricas.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<FigurasGeométricas> figurasGeométricas = new ArrayList<>();
       figurasGeométricas.add(new Circulo(20));
       figurasGeométricas.add(new Triangulo(10, 20, 25, 25));
       figurasGeométricas.add(new Rectangulo(24.5,20.6));

        for (int i = 0; i < figurasGeométricas.size(); i++) {
            figurasGeométricas.get(i).calcularArea();
            System.out.println(figurasGeométricas.get(i).toString());


        }

    }

}






