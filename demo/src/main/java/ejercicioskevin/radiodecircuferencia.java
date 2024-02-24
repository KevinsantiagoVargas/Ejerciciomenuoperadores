package ejercicioskevin;
import java.util.Scanner;
public class radiodecircuferencia {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("degite radio de circunferencia:");
        double radio = scanner.nextDouble();
        double circufenrecialongitud = 2 * Math.PI * radio;
        double circuloareavista = Math.PI * Math.pow(radio, 2);
        System.out.println("la longitud:" + circufenrecialongitud);
        System.out.println("la area vista:" + circuloareavista);
        scanner.close();
    }
}
/* */