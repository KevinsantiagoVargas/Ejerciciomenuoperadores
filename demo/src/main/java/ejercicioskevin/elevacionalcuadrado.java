package ejercicioskevin;
import java.util.Scanner;
public class elevacionalcuadrado {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digitar numero:");
        double numero = scanner.nextDouble();
        double resultado = Math.pow(numero, 2);
        System.out.println("resultado " + numero + "de la elevacion : " + resultado);
        scanner.close();
    }
}
/* */