import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto");
        String cadena = lector.nextLine();
        System.out.println("Introduce otra cadena de texto");
        cadena = cadena + lector.nextLine();

        String output = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            output = output + cadena.charAt(i);
        }
        System.out.println(output);
    }
}