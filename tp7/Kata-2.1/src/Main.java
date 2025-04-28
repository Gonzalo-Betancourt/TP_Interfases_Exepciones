import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Ingrese el primer número: ");
            int n1 = Integer.parseInt(input.nextLine());
            System.out.println("Ingresa el segundo número: ");
            int n2 = Integer.parseInt(input.nextLine());

            double resultado = n1 / n2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e){
            System.out.println("Ocurrió el siguente error por intentar dividr por 0: " + e);
        }

    }
}