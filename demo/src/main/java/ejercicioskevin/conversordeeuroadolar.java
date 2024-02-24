package ejercicioskevin;
import java.util.Scanner;
public class conversordeeuroadolar {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valueCambio = 1.08;
        System.out.println("digite el monto euro:");
        double euro = scanner.nextDouble();
        double dolar = euro * valueCambio;
        System.out.println(euro + " valor de euro es " + dolar + " dólar.");
        scanner.close();
    }
}
/* */