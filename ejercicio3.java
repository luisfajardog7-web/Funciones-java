import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Introduce el segundo numero: ");
        float numero2 = scanner.nextFloat();

        System.out.println("El resultado de sumar " + numero1 + " + " + numero2 + " = " + suma(numero1, numero2));

        scanner.close(); // IMPORTANTE
    }

    public static float suma(float n1, float n2) {
        return n1 + n2;
    }
}