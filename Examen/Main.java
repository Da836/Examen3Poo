package Examen;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inicio = new Scanner(System.in);
        menu(inicio);
    }

    public static void menu(Scanner inicio){
        ArrayList<Sandalias> listasandalias = new ArrayList<Sandalias>();
        ArrayList<Tacones> listatacones = new ArrayList<Tacones>();
        ArrayList<Botines> listabotines = new ArrayList<Botines>();
        int opc = 0;

        do{
            System.out.println("=========================================");
            System.out.println("========= Zapatería Castellanos =========");
            System.out.println("=========================================");
            System.out.println("== 1. Ingresar una sandalia al inventario");
            System.out.println("== 2. Ingresar un tacon al inventario");
            System.out.println("== 3. Ingresar un botin al inventario");
            System.out.println("== 4. Salir");
            System.out.print("Seleccione la opcion que desee: ");
            opc = inicio.nextInt();

            switch(opc){
                case 1:
                    Sandalias sandalias = crearSandalias(inicio);
                    sandalias.setNombreclase("sandalias");
                    listasandalias.add(sandalias);
                    System.out.println("\n\nUsted acaba de agregar una sandalia al stock\n");
                    break;

                case 2:
                    Tacones tacones = crearTacones(inicio);
                    tacones.setNombreclase("tacones");
                    listatacones.add(tacones);
                    System.out.println("\n\nUsted acaba de agregar un tacon al stock\n");
                    break;

                case 3:
                    Botines botines = crearBotines(inicio);
                    botines.setNombreclase("botines");
                    listabotines.add(botines);
                    System.out.println("\n\nUsted acaba de agregar un botin al stock\n");
                    break;

                case 4:
                    System.out.println("\n\nGracias por utilizar este programa");
                    break;
            }

        }while(opc != 4);

        for(Sandalias lista: listasandalias){
            lista.File("Sandalias.txt");
        }

        for(Tacones lista: listatacones){
            lista.File("Tacones.txt");
        }

        for(Botines lista: listabotines){
            lista.File("Botines.txt");
        }
    }

    public static Sandalias crearSandalias(Scanner inicio){
        String marca;
        String color;
        String estilo;
        double talla;
        double precio;

        System.out.print("\nUsted escogio ingresar una sandalia\n");

        inicio.nextLine();
        System.out.print("Ingrese la marca de la sandalia: ");
        marca = inicio.nextLine();

        System.out.print("Ingrese el color de la sandalia: ");
        color = inicio.nextLine();

        System.out.print("Ingrese el estilo de la sandalia: ");
        estilo = inicio.nextLine();

        do {
            System.out.print("Ingrese la talla de la sandalia: ");
            talla = inicio.nextDouble();

            if(talla < 0){
                System.out.println("\n\nValor incorrecto\n");
            }

        }while(talla < 0);

        do {
            System.out.print("Ingrese el precio de la sandalia: ");
            precio = inicio.nextDouble();
            inicio.nextLine();

            if(precio < 0){
                System.out.println("\n\nValor incorrecto\n");
            }

        }while(precio < 0);

        Sandalias sandalias = new Sandalias(marca,color,estilo,talla,precio);
        return sandalias;
    }

    public static Tacones crearTacones(Scanner inicio){
        String marca;
        String color;
        String estilo;
        double talla;
        double precio;

        System.out.print("\nUsted escogio ingresar un tacon\n");

        inicio.nextLine();
        System.out.print("Ingrese la marca del tacon: ");
        marca = inicio.nextLine();

        System.out.print("Ingrese el color del tacon: ");
        color = inicio.nextLine();

        System.out.print("Ingrese el estilo del tacon: ");
        estilo = inicio.nextLine();

        do {
            System.out.print("Ingrese la talla del tacon: ");
            talla = inicio.nextDouble();

            if(talla < 0){
                System.out.println("\n\nValor incorrecto\n");
            }

        }while(talla < 0);

        do {
            System.out.print("Ingrese el precio del tacon: ");
            precio = inicio.nextDouble();
            inicio.nextLine();

            if(precio < 0){
                System.out.println("\n\nValor incorrecto\n");
            }

        }while(precio < 0);

        Tacones tacones = new Tacones(marca,color,estilo,talla,precio);
        return tacones;
    }

    public static Botines crearBotines(Scanner inicio){
        String marca;
        String color;
        String estilo;
        double talla;
        double precio;

        System.out.print("\nUsted escogio ingresar un botin\n");

        inicio.nextLine();
        System.out.print("Ingrese la marca del botin: ");
        marca = inicio.nextLine();

        System.out.print("Ingrese el color del botin: ");
        color = inicio.nextLine();

        System.out.print("Ingrese el estilo del botin: ");
        estilo = inicio.nextLine();

        do {
            System.out.print("Ingrese la talla del botin: ");
            talla = inicio.nextDouble();

            if(talla < 0){
                System.out.println("\n\nValor incorrecto\n");
            }

        }while(talla < 0);

        do {
            System.out.print("Ingrese el precio del botin: ");
            precio = inicio.nextDouble();
            inicio.nextLine();

            if(precio < 0){
                System.out.println("\n\nValor incorrecto\n");
            }

        }while(precio < 0);

        Botines botines = new Botines(marca,color,estilo,talla,precio);
        return botines;

    }

}
