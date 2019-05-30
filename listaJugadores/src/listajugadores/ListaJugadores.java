package listajugadores;

import java.util.Scanner;

/**
 *
 * @author cavargas10 
 */
public class ListaJugadores {

    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);

        String cadena = "";
        String nombre = "";
        String apellido = "";
        int goles = 0;
        int sueldo = 0;
        double sumaSueldo = 0;
        double sumaGoles = 0;
        double totalGoles = 0;
        double sueldoProm = 0;
        boolean bandera = true;
        int contador = 0;
        String valorUsuario = "";
        
        cadena = String.format("%s%s\n", cadena,
                "Lista de Jugadores: ");
        
        do {

            contador = contador + 1;

            System.out.printf("Ingrese sus Nombre: ");
            nombre = entrada.nextLine();
            System.out.printf("Ingrese sus Apellido: ");
            apellido = entrada.nextLine();
            System.out.printf("Ingrese los goles: ");
            goles = entrada.nextInt();
            System.out.printf("Ingrese su Sueldo: ");
            sueldo = entrada.nextInt();
                                    
            cadena = String.format("%sNombre: %s, Apellido: %s , Goles: %.2f,"
                    + "Sueldo: %.2f\n", cadena, nombre, apellido, goles, sueldo);

            sumaGoles = sumaGoles + goles;
            
            sumaSueldo = sumaSueldo + sueldo;

            entrada.nextLine(); //limpiar el buffer

            System.out.println("Desea salir ingrese 'n' ");
            valorUsuario = entrada.nextLine();

            if (valorUsuario.equals("n")) {
                bandera = false;
            }

        } while (bandera == true);

        totalGoles = (double) sumaGoles + totalGoles;
        sueldoProm = (double) sumaSueldo / contador;
        
        cadena = String.format("%s\nTotal Goles: %d, Promedio Sueldo: %.2f\n",
                cadena, totalGoles, sueldoProm);
        
        System.out.printf("%s", cadena);

    }

}

/*
EL usuario ingresa Nombre, Apellido, Goles, Sueldo
EL usuario decide si quiere seguir ingresando datos, despues de cada jugador
Hacer el ejercicio con while

Lista Jugadores
Nombre      Apellido        Goles       Sueldo
Jug1        Jug1A           5           1000.00
Jug2        Jug2A           7           2000.00

Total Goles = 12
Promedio Sueldo = 1500.00*/
