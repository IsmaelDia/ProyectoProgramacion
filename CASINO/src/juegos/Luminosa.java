package juegos;

import java.util.ArrayList;
import java.util.Scanner;
public class Luminosa {
    public Luminosa() {
    }
    public double dineroJugador;
    public double dineroGastadoLumi;
    public double getDineroJugador() {
        return dineroJugador;
    }

    public void setDineroJugador(double dineroJugador) {
        this.dineroJugador = dineroJugador;
    }
    public double dineroGando(){
        return dineroJugador;
    }
    public double dineroGastadoLumi(){return dineroGastadoLumi;}


    public void LaLumi(){

        ArrayList<Double> dinerito = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        // TITULO
        boolean dineroBien = true;
        boolean noMoney=false;
        System.out.println("\n" +
                " ▄            ▄▄▄▄▄▄▄▄▄▄▄                                                                               \n" +
                "▐░▌          ▐░░░░░░░░░░░▌                                                                              \n" +
                "▐░▌          ▐░█▀▀▀▀▀▀▀█░▌                                                                              \n" +
                "▐░▌          ▐░▌       ▐░▌                                                                              \n" +
                "▐░▌          ▐░█▄▄▄▄▄▄▄█░▌                                                                              \n" +
                "▐░▌          ▐░░░░░░░░░░░▌                                                                              \n" +
                "▐░▌          ▐░█▀▀▀▀▀▀▀█░▌                                                                              \n" +
                "▐░▌          ▐░▌       ▐░▌                                                                              \n" +
                "▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌                                                                              \n" +
                "▐░░░░░░░░░░░▌▐░▌       ▐░▌                                                                              \n" +
                " ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀                                                                               \n" +
                "                                                                                                        \n" +
                " ▄            ▄         ▄  ▄▄       ▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░▌          ▐░▌       ▐░▌▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌\n" +
                "▐░▌          ▐░▌       ▐░▌▐░▌░▌   ▐░▐░▌ ▀▀▀▀█░█▀▀▀▀ ▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌\n" +
                "▐░▌          ▐░▌       ▐░▌▐░▌▐░▌ ▐░▌▐░▌     ▐░▌     ▐░▌▐░▌    ▐░▌▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌\n" +
                "▐░▌          ▐░▌       ▐░▌▐░▌ ▐░▐░▌ ▐░▌     ▐░▌     ▐░▌ ▐░▌   ▐░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌\n" +
                "▐░▌          ▐░▌       ▐░▌▐░▌  ▐░▌  ▐░▌     ▐░▌     ▐░▌  ▐░▌  ▐░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌\n" +
                "▐░▌          ▐░▌       ▐░▌▐░▌   ▀   ▐░▌     ▐░▌     ▐░▌   ▐░▌ ▐░▌▐░▌       ▐░▌ ▀▀▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                "▐░▌          ▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌    ▐░▌▐░▌▐░▌       ▐░▌          ▐░▌▐░▌       ▐░▌\n" +
                "▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌ ▄▄▄▄█░█▄▄▄▄ ▐░▌     ▐░▐░▌▐░█▄▄▄▄▄▄▄█░▌ ▄▄▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌\n" +
                "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌      ▐░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀        ▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀ \n" +
                "                                                                                                        \n");
        /**
         * REGLAS DEL PROGRAMA
         */
        System.out.println("¿deseas ver las reglas antes de empezar?(si/no)");
        String opcion = teclado.next();
        if (opcion.equalsIgnoreCase("si")) {
            System.out.println("Las reglas son simples: ");
            System.out.println("apostaras un numero definido de dinero que seran 10€");
            System.out.println("EN CASO DE GANAR EL DINERO PREMIADO SON 200");
            System.out.println("HAY UN PREMIO ESPECIAL DE QUE LA APUESTA GANADA TE DE 2000 CREDITOS");
            System.out.println("Te lo jugaras a la suerte, hay en total 5 tipos de objetos");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*no");
            System.out.println("Los objetos son: ");
            System.out.println("1·Manzanas = OOO");
            System.out.println("2·Asteriscos = ***");
            System.out.println("3·Maquina= /-/");
            System.out.println("4·Dolares = $$$");
            System.out.println("5·Sorpresa = |+|");
        }
        boolean seguir= false;// PARA LA PREGUNTA DEL DO WHILE


        //PARA QUE HAYAN ESPACIOS ENTRE LAS COSAS Y EL INICIO DEL JUEGO
        System.out.println();
        System.out.println();
        System.out.println("----------PULSA ENTER PARA JUGAR------------");
        System.out.println();
        System.out.println("TE QUEDAN "+dineroJugador+" PARA APOSTAR");
        teclado.nextLine();
        teclado.nextLine();
        System.out.println();
        System.out.println();

        do {
            do{
                /**
                 *Comprueba que tenga dinero para jugar
                 */
                if (dineroJugador <= 0) {
                    System.out.println("vaya no te queda dinero me parece que hoy ya no jugaras a la luminosa");
                    System.out.println("pregunta a un administrador para ingresar mas");
                    dineroBien=false;
                    noMoney=true;
                } else {
                    dineroBien=false;
                }
            } while (dineroBien);
            if (noMoney){break;}


            /**
             *aqui el juego ya ha empezado y se le quita al usuario
             */
            dineroJugador = dineroJugador - 10;
            dineroGastadoLumi = dineroGastadoLumi + 10;
            String obnum1 = "";
            String obnum2 = "";
            String obnum3 = "";
//pueden tocar del 0 al 4 asique hay 5 posibilidades
            /**
             *creo los random y pueden tocar del 0 al 4
             */
            int num1 = (int) (Math.random() * 5);
            int num2 = (int) (Math.random() * 5);
            int num3 = (int) (Math.random() * 5);
            int superPremio = (int) (Math.random() * 100);


//CABLEADO PARA QUE LOS NUMEROS SE VEAN BONITOS DE FORMA VISUAL

            if (num1 == 0) {
                obnum1 = "OOO";
            }
            if (num1 == 1) {
                obnum1 = "***";
            }
            if (num1 == 2) {
                obnum1 = "/-/";
            }
            if (num1 == 3) {
                obnum1 = "$$$";
            }
            if (num1 == 4) {
                obnum1 = "|+|";
            }
            if (num2 == 0) {
                obnum2 = "OOO";
            }
            if (num2 == 1) {
                obnum2 = "***";
            }
            if (num2 == 2) {
                obnum2 = "/-/";
            }
            if (num2 == 3) {
                obnum2 = "$$$";
            }
            if (num2 == 4) {
                obnum2 = "|+|";
            }

            if (num3 == 0) {
                obnum3 = "OOO";
            }
            if (num3 == 1) {
                obnum3 = "***";
            }
            if (num3 == 2) {
                obnum3 = "/-/";
            }
            if (num3 == 3) {
                obnum3 = "$$$";
            }
            if (num3 == 4) {
                obnum3 = "|+|";
            }
            dineroBien=true;

            /**
             *imprimo cuando gana el usuario y con posibilidad de ganar el premio de 2000
             */
            if (num1 == num2 && num1 == num3){
                if (superPremio==50){dineroJugador = dineroJugador + 2000;
                    System.out.println("ENHORABUENA ACABAS DE GANAR EL SUPER PREMIO DE 3000 LAS POSIBILIDADES ERAN MUY BAJAS, ERES MUY AFORTUNADO DISFRUTA EL PREMIO");
                }
                else{dineroJugador = dineroJugador + 200;}
                System.out.println(" ________________________________________________\n" +
                        "/  __  __          _____      _                 \\\n" +
                        "|  |  \\/  |_   _   |_   _|__  | | ___   __ _     |\n" +
                        "|  | \\  / | | | |    | |/ _ \\ | |/ _ \\ / _` |    |\n" +
                        "|  | |\\/| | |_| |    | |  __/ | | (_) | (_| |    |\n" +
                        "|  |_|  |_|\\__, |    |_|\\___| |_|\\___/ \\__, |    |\n" +
                        "\\         |___/                       |___/     /\n" +
                        " ----------------------------------------------\n" +
                        "|                  CASINO                      |\n" +
                        "|----------------------------------------------|\n" +
                        "|                |               |             |\n" +
                        "|      " + obnum1 + "       |     " + obnum2 + "       |      " + obnum3 + "    |\n" +
                        "|                |               |             |\n" +
                        "|______________________________________________|\n" +
                        "|              ENHORABUENA HAS GANADO          |\n" +
                        "|----------------------------------------------|\n");

            }
            /**
             *imprimo cuando pierde
             */
            else {
                System.out.println(" ________________________________________________\n" +
                        "/  __  __          _____      _                 \\\n" +
                        "|  |  \\/  |_   _   |_   _|__  | | ___   __ _     |\n" +
                        "|  | \\  / | | | |    | |/ _ \\ | |/ _ \\ / _` |    |\n" +
                        "|  | |\\/| | |_| |    | |  __/ | | (_) | (_| |    |\n" +
                        "|  |_|  |_|\\__, |    |_|\\___| |_|\\___/ \\__, |    |\n" +
                        "\\         |___/                       |___/     /\n" +
                        " ----------------------------------------------\n" +
                        "|                  CASINO                      |\n" +
                        "|----------------------------------------------|\n" +
                        "|                |               |             |\n" +
                        "|      " + obnum1 + "       |     " + obnum2 + "       |      " + obnum3 + "    |\n" +
                        "|                |               |             |\n" +
                        "|______________________________________________|\n" +
                        "|   OHH VAYA HAS PERDIDO, SIGUE INTENTANDOLO   |\n" +
                        "|----------------------------------------------|\n");

            }
            /**
             *pregunta para seguir jugando
             */
            System.out.println();
            System.out.println("¿DESEAS SEGUIR JUGANDO? (escribe un 0 para terminar de jugar)");
            System.out.println("----------PULSA ENTER PARA JUGAR------------");
            System.out.println();
            System.out.println("TE QUEDAN "+dineroJugador+" PARA APOSTAR");
            String opcion2 = teclado.nextLine();
            System.out.println();
            System.out.println();

            if (opcion2.equalsIgnoreCase("0")){
                seguir=true;
            }
            // en caso de alguna palabra que NO SEA NO seguira jugando
        }while (!seguir);
    }

    }