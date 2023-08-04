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
                            System.out.println("Ingrese la Modelo");
                            String Modelo = k1ng.nextLine();
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

                            Automovil Movil = new Automovil(Cumbustible, Trans, NumPuertas, NumAsientos, Placa, Marca, Modelo, Type, color, fecha);
                            ListaV.add(Movil);
                            break;
                        case 2:

                            System.out.println("Ingrese el numero de placa");
                            String Placa3 = k1ng.nextLine();
                            System.out.println("Ingrese la Marca");
                            String Marca3 = k1ng.nextLine();
                            System.out.println("Ingrese la Modelo");
                            String Modelo1 = k1ng.nextLine();
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

                            Moto mum = new Moto(lim, peso, consumo, Placa3, Modelo1, Marca3, Type3, color3, fecha3);
                            ListaV.add(mum);
                            break;
                        case 3:
                            System.out.println("Ingrese el numero de placa");
                            String Placa1 = k1ng.nextLine();
                            System.out.println("Ingrese la Marca");
                            String Marca1 = k1ng.nextLine();
                            System.out.println("Ingrese la Modelo");
                            String Modelo2 = k1ng.nextLine();
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

                            Buses bus = new Buses(pass, NumEJE, consumo1, Placa1, Modelo2, Marca1, Type1, color1, fecha1);
                            ListaV.add(bus);
                            break;
                        case 4:
                            for (int i = 0; i < ListaV.size(); i++) {
                                System.out.println(i + ListaV.get(i).toString());
                            }
                            System.out.println("Ingrese el numero del carro que desea Pagar");
                            int numero3 = k1ng.nextInt();
                            MenuCambio(ListaV, numero3);
                            if (ListaV.get(numero3) instanceof Automovil) {
                                MenuCambioAutomovil(ListaV, numero3);
                            } else if (ListaV.get(numero3) instanceof Moto) {
                                MenuCambioMoto(ListaV, numero3);
                            } else {
                                MenuCambioBuses(ListaV, numero3);
                            }

                            break;

                        case 5:
                            for (int i = 0; i < ListaV.size(); i++) {
                                System.out.println(i + ListaV.get(i).toString());
                            }
                            System.out.println("Ingrese el numero del carro que desea eliminar");
                            int numero = k1ng.nextInt();
                            ListaV.remove(numero);
                            break;

                        case 6:
                            ListarVehi(ListaV);
                            break;

                        case 7:
                            for (int i = 0; i < ListaV.size(); i++) {
                                System.out.println(i + ListaV.get(i).toString());
                            }
                            System.out.println("Ingrese el numero del carro que desea Pagar");
                            int numero2 = k1ng.nextInt();
                            int Xpagar = 0;
                            if (ListaV.get(numero2) instanceof Automovil) {
                                Xpagar = 275 + 250 + 1200;
                            } else if (ListaV.get(numero2) instanceof Moto) {
                                Xpagar = 275 + 250 + 200;
                            } else {
                                Xpagar = 275 + 250 + 1000;
                            }
                            System.out.println("Es su total a pagar" + Xpagar);

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

    public static void MenuCambio(ArrayList<Vehiculos> ListaV, int num) throws ParseException {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. MOD Placa \n"
                + "2. MOD Marca \n"
                + "3. MOD Modelo \n"
                + "4. MOD Tipo\n"
                + "5. MOD Color\n"
                + "6. MOD Anio \n"
                + "7. Otro");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 7) {
                if ((menu > 0) && (menu < 8)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese su nueva Placa");
                            String Placa1 = k1ng.nextLine();
                            ListaV.get(num).setNumeroPlaca(Placa1);
                            break;
                        case 2:
                            System.out.println("Ingrese su nuevo Marca");
                            String Marca = k1ng.nextLine();
                            ListaV.get(num).setMarca(Marca);
                            break;
                        case 3:
                            System.out.println("Ingrese su Nuevo modelo");
                            String Modelo = k1ng.nextLine();
                            ListaV.get(num).setModelo(Modelo);
                            break;
                        case 4:
                            System.out.println("Ingrese el nuevo tipo");
                            char Type1 = k1ng.next().charAt(0);
                            ListaV.get(num).setTipo(Type1);
                            break;
                        case 7:
                            JColorChooser colorChooser1 = new JColorChooser();
                            Color color1 = colorChooser1.getColor();
                            ListaV.get(num).setColor(color1);
                            break;
                        case 6:
                            System.out.println("Ingrese el dia de nacimiento: ");
                            String dia1 = k1ng.nextLine();
                            System.out.println("Ingrese el mes de nacimiento: ");
                            String mes1 = k1ng.nextLine();
                            System.out.println("Ingrese el año de nacimiento");
                            String ano1 = k1ng.nextLine();
                            String entrada1 = dia1 + "/" + mes1 + "/" + ano1;
                            DateFormat format1 = new SimpleDateFormat("DD/MM/YYYY");
                            Date fecha1 = format1.parse(entrada1);
                            ListaV.get(num).setAnio(fecha1);
                            break;
                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. MOD Placa \n"
                            + "2. MOD Marca \n"
                            + "3. MOD Modelo \n"
                            + "4. MOD Tipo\n"
                            + "5. MOD Color\n"
                            + "6. MOD Anio \n"
                            + "7. Otro");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void MenuCambioBuses(ArrayList<Vehiculos> ListaV, int num) {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Cambiar la capacidad de pasajeros \n"
                + "2. Cambiar el numero de ejes\n"
                + "3. Cambiar la longitud \n"
                + "4. Salida");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 4) {
                if ((menu > 0) && (menu < 5)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese el Nuevo valor de la capacidad de pasajeros: ");
                            int newLim = k1ng.nextInt();
                            ((Buses) ListaV.get(num)).setCapacidadPassa(newLim);
                            break;
                        case 2:
                            System.out.println("Ingrese el Nuevo valor del numero de ejes");
                            int newPeso = k1ng.nextInt();
                            ((Buses) ListaV.get(num)).setNumeroEjes(newPeso);
                            break;
                        case 3:
                            System.out.println("Ingrese el Nuevo valor de la longitud");
                            double newConsu1 = k1ng.nextDouble();
                            ((Buses) ListaV.get(num)).setLongitud(newConsu1);
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Cambiar la capacidad de pasajeros \n"
                            + "2. Cambiar el numero de ejes\n"
                            + "3. Cambiar la longitud \n"
                            + "4. Salida");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void MenuCambioMoto(ArrayList<Vehiculos> ListaV, int num) {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Cambiar Limite de velocidad \n"
                + "2. Cambiar el peso \n"
                + "3. Cambiar el consumo de combustible \n"
                + "4. Salida");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 4) {
                if ((menu > 0) && (menu < 5)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese el Nuevo valor del limite de velocidad");
                            double newLim = k1ng.nextDouble();
                            ((Moto) ListaV.get(num)).setLimVeloz(newLim);
                            break;
                        case 2:
                            System.out.println("Ingrese el Nuevo valor del Peso");
                            double newPeso = k1ng.nextDouble();
                            ((Moto) ListaV.get(num)).setPeso(newPeso);
                            break;
                        case 3:
                            System.out.println("Ingrese el Nuevo valor del consumo de combustible");
                            double newConsu = k1ng.nextDouble();
                            ((Moto) ListaV.get(num)).setConsumoDCumbus(newConsu);
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Cambiar Limite de velocidad \n"
                            + "2. Cambiar el peso \n"
                            + "3. Cambiar el consumo de combustible \n"
                            + "4. Salida");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void MenuCambioAutomovil(ArrayList<Vehiculos> ListaV, int num) {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Cambiar Tipo Combustible \n"
                + "2. Cambiar Tipo de transporte \n"
                + "3. Cambiar Numero de puertas \n"
                + "4. Cambiar Numero de asientos \n"
                + "5. Otro");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 5) {
                if ((menu > 0) && (menu < 6)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese el nuevo tipo de combustible: ");
                            String Cum = k1ng.nextLine();
                            ((Automovil) ListaV.get(num)).setTipoCombu(Cum);
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo tipo de Transporte: ");
                            String Trans = k1ng.nextLine();
                            ((Automovil) ListaV.get(num)).setTipoTrans(Trans);
                            break;
                        case 3:
                            System.out.println("Ingrese el numero de puertas");
                            int Puertas = k1ng.nextInt();
                            ((Automovil) ListaV.get(num)).setNumeroDePuertas(Puertas);
                            break;
                        case 4:
                            System.out.println("Ingrese el numero de Asientos");
                            int Asientos = k1ng.nextInt();
                            ((Automovil) ListaV.get(num)).setNumeroDeAsientos(Asientos);
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Cambiar Tipo Combustible \n"
                            + "2. Cambiar Tipo de transporte \n"
                            + "3. Cambiar Numero de puertas \n"
                            + "4. Cambiar Numero de asientos \n"
                            + "5. Otro");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
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
