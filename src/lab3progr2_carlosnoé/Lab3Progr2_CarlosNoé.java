package lab3progr2_carlosnoé;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Lab3Progr2_CarlosNoé {

    public static void main(String[] args) throws ParseException {
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
                            
                            System.out.println("Ingrese el numero de placa");
                            String Placa = k1ng.nextLine();
                            System.out.println("Ingrese la Marca");
                            String Marca = k1ng.nextLine();
                            System.out.println("Ingrese el tipo 'T'= Turism, 'C'=Camioneta, etc");
                            char Type = k1ng.next().charAt(0);
                            JColorChooser colorChooser = new JColorChooser();
                            Color color = colorChooser.getColor();
                            System.out.println("Ingrese el dia de nacimiento: ");
                            String dia = k1ng.nextLine();
                            System.out.println("Ingrese el mes de nacimiento: ");
                            String mes = k1ng.nextLine();
                            System.out.println("Ingrese el año de nacimiento");
                            String ano = k1ng.nextLine();
                            String entrada = dia + "/" + mes + "/" + ano;
                            DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
                            Date fecha = format.parse(entrada);

                            System.out.println("Ingrese el tipo de combustible del AutoMovil");
                            String Cumbustible = k1ng.nextLine();
                            System.out.println("Ingrese el numero de puertas: ");
                            int NumPuertas = k1ng.nextInt();
                            System.out.println("Ingrese el tipo de transmicion: ");
                            String Trans = k1ng.nextLine();
                            System.out.println("Ingrese el numero de puertas: ");
                            int NumAsientos = k1ng.nextInt();

                            Automovil Movil = new Automovil(Cumbustible, Trans, NumPuertas, NumAsientos, Placa, Marca, Type, color, fecha);
                            ListaV.add(Movil);
                            break;
                        case 2:

                            System.out.println("Ingrese el numero de placa");
                            String Placa3 = k1ng.nextLine();
                            System.out.println("Ingrese la Marca");
                            String Marca3 = k1ng.nextLine();
                            System.out.println("Ingrese el tipo 'T'= Turism, 'C'=Camioneta, etc");
                            char Type3 = k1ng.next().charAt(0);
                            JColorChooser colorChooser3 = new JColorChooser();
                            Color color3 = colorChooser3.getColor();
                            System.out.println("Ingrese el dia de nacimiento: ");
                            String dia3 = k1ng.nextLine();
                            System.out.println("Ingrese el mes de nacimiento: ");
                            String mes3 = k1ng.nextLine();
                            System.out.println("Ingrese el año de nacimiento");
                            String ano3 = k1ng.nextLine();
                            String entrada3 = dia3 + "/" + mes3 + "/" + ano3;
                            DateFormat format3 = new SimpleDateFormat("DD/MM/YYYY");
                            Date fecha3 = format3.parse(entrada3);

                            System.out.println("Ingrese el limite");
                            double lim = k1ng.nextDouble();
                            System.out.println("Ingrese el Peso");
                            double peso = k1ng.nextDouble();
                            System.out.println("Ingrese el Consumo");
                            double consumo = k1ng.nextDouble();

                            Moto mum = new Moto(lim, peso, consumo, Placa3, Marca3, Type3, color3, fecha3);
                            ListaV.add(mum);
                            break;
                        case 3:
                            System.out.println("Ingrese el numero de placa");
                            String Placa1 = k1ng.nextLine();
                            System.out.println("Ingrese la Marca");
                            String Marca1 = k1ng.nextLine();
                            System.out.println("Ingrese el tipo 'T'= Turism, 'C'=Camioneta, etc");
                            char Type1 = k1ng.next().charAt(0);
                            JColorChooser colorChooser1 = new JColorChooser();
                            Color color1 = colorChooser1.getColor();
                            System.out.println("Ingrese el dia de nacimiento: ");
                            String dia1 = k1ng.nextLine();
                            System.out.println("Ingrese el mes de nacimiento: ");
                            String mes1 = k1ng.nextLine();
                            System.out.println("Ingrese el año de nacimiento");
                            String ano1 = k1ng.nextLine();
                            String entrada1 = dia1 + "/" + mes1 + "/" + ano1;
                            DateFormat format1 = new SimpleDateFormat("DD/MM/YYYY");
                            Date fecha1 = format1.parse(entrada1);

                            System.out.println("Ingrese la capacidad de pasajeros");
                            int pass = k1ng.nextInt();
                            System.out.println("Ingrese el numeroDEejes");
                            int NumEJE = k1ng.nextInt();
                            System.out.println("Ingrese el Consumo");
                            double consumo1 = k1ng.nextDouble();

                            Buses bus = new Buses(pass, NumEJE, consumo1, Placa1, Marca1, Type1, color1, fecha1);
                            ListaV.add(bus);
                            break;
                        case 4:
                            break;

                        case 5:
                            break;

                        case 6:
                            ListarVehi(ListaV);
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

    public static ArrayList<Vehiculos> AgregarAutomovil(ArrayList<Vehiculos> ListaV) throws ParseException {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Ingrese el numero de placa");
        String Placa = k1ng.nextLine();
        System.out.println("Ingrese la Marca");
        String Marca = k1ng.nextLine();
        System.out.println("Ingrese el tipo 'T'= Turism, 'C'=Camioneta, etc");
        char Type = k1ng.next().charAt(0);
        JColorChooser colorChooser = new JColorChooser();
        Color color = colorChooser.getColor();
        System.out.println("Ingrese el dia de nacimiento: ");
        String dia = k1ng.nextLine();
        System.out.println("Ingrese el mes de nacimiento: ");
        String mes = k1ng.nextLine();
        System.out.println("Ingrese el año de nacimiento");
        String ano = k1ng.nextLine();
        String entrada = dia + "/" + mes + "/" + ano;
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);

        System.out.println("Ingrese el tipo de combustible del AutoMovil");
        String Cumbustible = k1ng.nextLine();
        System.out.println("Ingrese el numero de puertas: ");
        int NumPuertas = k1ng.nextInt();
        System.out.println("Ingrese el tipo de transmicion: ");
        String Trans = k1ng.nextLine();
        System.out.println("Ingrese el numero de puertas: ");
        int NumAsientos = k1ng.nextInt();

        Automovil Movil = new Automovil(Cumbustible, Trans, NumPuertas, NumAsientos, Placa, Marca, Type, color, fecha);
        ListaV.add(Movil);
        return ListaV;

    }

    public static void ListarVehi(ArrayList<Vehiculos> ListaV) {
        System.out.println("Vehiculos");
        for (Vehiculos vehiculos : ListaV) {
            if (vehiculos instanceof Automovil) {
                System.out.println(vehiculos.toString());
            }
        }
        System.out.println("Motocicletas");
        for (Vehiculos vehiculos : ListaV) {
            if (vehiculos instanceof Moto) {
                System.out.println(vehiculos.toString());
            }
        }
        System.out.println("Buses");
        for (Vehiculos vehiculos : ListaV) {
            if (vehiculos instanceof Buses) {
                System.out.println(vehiculos.toString());
            }
        }
    }
}
