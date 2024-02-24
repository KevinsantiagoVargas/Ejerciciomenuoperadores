package ejercicioskevin;
import java.util.Scanner;
public class determinarareavolumencilin {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digita radio cilindro:");
        double radio = scanner.nextDouble();
        System.out.println("digita altura cilindro:");
        double altura = scanner.nextDouble();
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTotal = 2 * Math.PI * radio * (radio + altura);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("la area del lado: " + areaLateral);
        System.out.println("la area del todo el cilindro: " + areaTotal);
        System.out.println("volumen del cilindro: " + volumen);
        scanner.close();
    }
}
/* */