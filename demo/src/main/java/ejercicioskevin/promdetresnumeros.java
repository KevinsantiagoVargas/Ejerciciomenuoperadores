package ejercicioskevin;
import java.util.Scanner;
public class promdetresnumeros {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite tres sifras con espacio:");
        double numone = scanner.nextDouble();
        double numtwo = scanner.nextDouble();
        double numthree = scanner.nextDouble();
        double promedio = (numone + numtwo + numthree) / 3;
        System.out.println("aqui esta el promedio de las tres sifras:" + promedio);
        scanner.close();
    }
}
/* */