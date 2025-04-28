import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: debe estar entre 0 y 120.");
            }

            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero válido.");
        }
    }

}