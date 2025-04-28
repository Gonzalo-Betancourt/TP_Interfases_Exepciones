import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Ingrese el primer número: ");
            int n1 = Integer.parseInt(input.nextLine());

            System.out.println("Número: " + n1);

        } catch (NumberFormatException e){
            System.out.println("Ocurrió el siguente error por intentar convertir un texto a entero: " + e);
        }

    }
}