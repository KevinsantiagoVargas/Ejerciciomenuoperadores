package ejercicioskevin;
import java.util.Scanner;
public class ingresardosdigitossuma {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite primer numero:");
        double numone = scanner.nextDouble();
        System.out.println("digite segundo numero:");
        double numtwo = scanner.nextDouble();
        double suma = numone + numtwo;
        System.out.println("el total de los numeros es: " + suma);
        scanner.close();
    }
}
/* */