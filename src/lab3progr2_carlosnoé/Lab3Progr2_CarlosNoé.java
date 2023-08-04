package lab3progr2_carlosnoé;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3Progr2_CarlosNoé {

    public static void main(String[] args) {
        ArrayList<Vehiculos> ListaV = new ArrayList();
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Agregar Automovil \n"
                + "2. Agregar Moto \n"
                + "3. Agregar autobus \n"
                + "4. MOD Vehiculo \n"
                + "5. Eliminar Vehiculo \n"
                + "6. Listar vehiculo \n"
                + "7. Generar Boleta: \n"
                + "8. Salida");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 8) {
                if ((menu > 0) && (menu < 9)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                            break;

                        case 5:
                            break;

                        case 6:
                            break;

                        case 7:
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Agregar Automovil \n"
                            + "2. Agregar Moto \n"
                            + "3. Agregar autobus \n"
                            + "4. MOD Vehiculo \n"
                            + "5. Eliminar Vehiculo \n"
                            + "6. Listar vehiculo \n"
                            + "7. Generar Boleta: \n"
                            + "8. Salida");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }
    public static void ListarVehi(ArrayList<Vehiculos> ListaV){
        
        
    }
}
