package ejercicioskevin;
import java.util.Scanner;
public class areatriangulo {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite la longitud del tiangrulo:");
            double base = scanner.nextDouble();
            System.out.println("digite el tamaño del triangulo:");
            double altura = scanner.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("la area del triangulo:" + area);
            scanner.close();
        }
}
