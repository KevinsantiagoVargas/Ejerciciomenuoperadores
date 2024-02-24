package ejercicioskevin;
import java.util.Scanner;
public class mostrarareadelcuadrado {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite tamaño cuadrado:");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        double perimetro = 4 * lado;
        System.out.println("tamaño del area cuadrado:" + area);
        System.out.println("tamaño del perimetro cuadrado:" + perimetro);
        scanner.close();
}
}
/* */