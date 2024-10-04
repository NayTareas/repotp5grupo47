package ar.edu.unju.escmin.tp5.main;

import ar.edu.unju.escmi.tp5.dominio.Biblioteca;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1 - Registrar libro");
            System.out.println("2 - Registrar usuario");
            System.out.println("3 - Préstamo de libro");
            System.out.println("4 - Devolución de libro");
            System.out.println("5 - Listar libros");
            System.out.println("6 - Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        biblioteca.registrarLibro();
                        break;
                    case 2:
                        biblioteca.registrarUsuario();
                        break;
                    case 3:
                        biblioteca.prestamoLibro();
                        break;
                    case 4:
                        biblioteca.devolucionLibro();
                        break;
                    case 5:
                        biblioteca.listarLibros();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}