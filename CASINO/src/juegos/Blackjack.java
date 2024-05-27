package juegos;

import java.util.Scanner;

public class Blackjack {
    public Blackjack() {
    }
    public double dineroJugador;
    public double dineroGastadoBlack;
    public double getDineroJugador() {
        return dineroJugador;
    }
    public void setDineroJugador(double dineroJugador) {
        this.dineroJugador = dineroJugador;
    }
    public double dineroGando(){
        return dineroJugador;
    }
    public double dineroGastadoBlack(){return dineroGastadoBlack;}
    public void Blackjah(){
        Scanner teclado = new Scanner(System.in);
        boolean dineroBien = true;
        boolean noMoney = false;
        boolean seguir=false;
        System.out.println("\n" +
                " ▄▄▄▄▄▄▄▄▄▄   ▄            ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄    ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄    ▄ \n" +
                "▐░░░░░░░░░░▌ ▐░▌          ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌\n" +
                "▐░█▀▀▀▀▀▀▀█░▌▐░▌          ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌ ▐░▌  ▀▀▀▀▀█░█▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌ ▐░▌ \n" +
                "▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌▐░▌          ▐░▌▐░▌        ▐░▌    ▐░▌       ▐░▌▐░▌          ▐░▌▐░▌  \n" +
                "▐░█▄▄▄▄▄▄▄█░▌▐░▌          ▐░█▄▄▄▄▄▄▄█░▌▐░▌          ▐░▌░▌         ▐░▌    ▐░█▄▄▄▄▄▄▄█░▌▐░▌          ▐░▌░▌   \n" +
                "▐░░░░░░░░░░▌ ▐░▌          ▐░░░░░░░░░░░▌▐░▌          ▐░░▌          ▐░▌    ▐░░░░░░░░░░░▌▐░▌          ▐░░▌    \n" +
                "▐░█▀▀▀▀▀▀▀█░▌▐░▌          ▐░█▀▀▀▀▀▀▀█░▌▐░▌          ▐░▌░▌         ▐░▌    ▐░█▀▀▀▀▀▀▀█░▌▐░▌          ▐░▌░▌   \n" +
                "▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌▐░▌          ▐░▌▐░▌        ▐░▌    ▐░▌       ▐░▌▐░▌          ▐░▌▐░▌  \n" +
                "▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌ ▐░▌  ▄▄▄▄▄█░▌    ▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌ ▐░▌ \n" +
                "▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌▐░░░░░░░▌    ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀   ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀    ▀  ▀▀▀▀▀▀▀      ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀    ▀ \n" +
                "                                                                                                           \n");

        System.out.println("¿deseas ver las reglas antes de empezar?(si/no)");
        String opcion = teclado.next();
        if (opcion.equalsIgnoreCase("si")) {
            System.out.println("Las reglas son simples: ");
            System.out.println("apostaras el dinero que desees");
            System.out.println("EN CASO DE GANAR EL DINERO PREMIADO ES EL DOBLE DE TU APUESTA");
            System.out.println("PERO SI GANAS BLACKJACK TU APUESTA SE MULTIPLICARA POR 2.5");
            System.out.println("Hacer BLACKJACK significa que en tus primeras 2 cartas sumes 21");
            System.out.println("pero cuidado que el crupier tambien puede ganar de blackjack");
            System.out.println("LAS CARTAS DEL CRUPIER NO SE PUEDEN VER");
        }
        //PARA QUE HAYAN ESPACIOS ENTRE LAS COSAS Y EL INICIO DEL JUEGO
        System.out.println();
        System.out.println();
        System.out.println("----------PULSA ENTER PARA JUGAR------------");
        System.out.println();
        teclado.nextLine();
        teclado.nextLine();
        System.out.println();
        System.out.println();
        /**
         * El juego completo está dentro de un do while que se ejecuta mientras el boolean seguir sea falso
         */
        do {
            seguir = false;// PARA LA PREGUNTA DEL DO WHILE
            boolean blackjack = false;
            boolean noMasCartas = false;
            boolean crupierBlackjack = false;

            boolean dado3usu = false;
            boolean dado4usu = false;
            boolean dado5usu = false;
            boolean dado6usu = false;
            boolean dado7usu = false;
            int dado3Cru = 0;
            int dado4Cru = 0;
            int dado5Cru = 0;
            int dado6Cru = 0;
            int dado7Cru = 0;
            int dado3jug = 0;
            int dado4jug = 0;
            int dado5jug = 0;
            int dado6jug = 0;
            int dado7jug = 0;
            int dado8jug = 0;

            double apuesta;
            do {
                if (dineroJugador <= 0) {
                    System.out.println("vaya no te queda dinero");
                    System.out.println("pregunta a un administrador para ingresar mas");
                    dineroBien = false;
                    noMoney = true;
                } else {
                    dineroBien = false;
                }
            } while (dineroBien);
            if (noMoney) {
                break;
            }
            /**
             * Pide que ingress la apuesta, si cumple los requisitos se resta el dinero.
             */
            System.out.println("TIENES " + dineroJugador + " PARA APOSTAR");
            System.out.println();
            do {
                System.out.println("Ingrese la apuesta:");
                apuesta = teclado.nextInt();


                if (apuesta > dineroJugador) {
                    System.out.println("no tienes tanto dinero tienes: " + dineroJugador);
                }
            } while (apuesta > dineroJugador || apuesta < 0 || dineroJugador == 0 || apuesta == 0);
            dineroJugador = dineroJugador - apuesta;
            dineroGastadoBlack = dineroGastadoBlack + apuesta;

            /**
             * Aquí se crean 4 variables que son las 2 primeras cartas del crupier y las 2 primeras del jugador, si por casualidad las 2 primeras cartas del crupier fuesen 21 (10 + 11) se volveria true el
             * boolean que hace que el juego continue si es falso, por eso 1 de las cartas es un mathrandom que puede dar 11
             */
            int dado1Cru = (int) (Math.random() * 11);
            dado1Cru = dado1Cru + 1;
            int dado1jug = (int) (Math.random() * 11);
            dado1jug = dado1jug + 1;
            int dado2Cru = (int) (Math.random() * 10);
            dado2Cru = dado2Cru + 1;
            int dado2jug = (int) (Math.random() * 10);
            dado2jug = dado2jug + 1;
            if ((dado1Cru + dado2Cru) == 21) {
                System.out.println("vaya, el crupier tiene blackjack");
                crupierBlackjack = true;
                /**
                 * Else if, es decir, si el crupier no tiene black jack se van sumando cartas(números) hasta que por regla del casino el crupier se planta (deja de coger cartas) si tiene un conjunto de mas de 17
                 */
            } else if (dado1Cru + dado2Cru < 17) {
                dado3Cru = (int) (Math.random() * 10);
                dado3Cru = dado3Cru + 1;

                if (dado1Cru + dado2Cru + dado3Cru < 17) {
                    dado4Cru = (int) (Math.random() * 10);
                    dado4Cru = dado4Cru + 1;
                }
                if (dado1Cru + dado2Cru + dado3Cru + dado4Cru < 17) {
                    dado5Cru = (int) (Math.random() * 10);
                    dado5Cru = dado5Cru + 1;
                }
                if (dado1Cru + dado2Cru + dado3Cru + dado4Cru + dado5Cru < 17) {
                    dado6Cru = (int) (Math.random() * 10);
                    dado6Cru = dado6Cru + 1;
                }
                if (dado1Cru + dado2Cru + dado3Cru + dado4Cru + dado5Cru + dado6Cru < 17) {
                    dado7Cru = (int) (Math.random() * 10);
                    dado7Cru = dado7Cru + 1;
                }
            }
            /**
             * Como el crupier no tuvo una victoria instantánea, se ejecuta nuestra parte
             */
            if (!crupierBlackjack) {
                System.out.println("CARTA 1 PARA EL JUGADOR:" + dado1jug);
                System.out.println("CARTA 2 PARA EL JUGADOR:" + dado2jug);
                System.out.println("total de puntos: " + (dado1jug + dado2jug));
                /**
                 * Al iugal del crupier se comprueba si el usuario ha conseguido un blackjack, es decir, ha conseguido un 21 en las 2 primeras cartas.
                 */
                if ((dado1jug + dado2jug) == 21) {
                    dineroJugador = dineroJugador + (apuesta * 2.5);
                    System.out.println("\n" +
                            "oooooooooo.  ooooo              .o.         .oooooo.   oooo    oooo    oooo       .o.         .oooooo.   oooo    oooo \n" +
                            "`888'   `Y8b `888'             .888.       d8P'  `Y8b  `888   .8P'     `888      .888.       d8P'  `Y8b  `888   .8P'  \n" +
                            " 888     888  888             .8\"888.     888           888  d8'        888     .8\"888.     888           888  d8'    \n" +
                            " 888oooo888'  888            .8' `888.    888           88888[          888    .8' `888.    888           88888[      \n" +
                            " 888    `88b  888           .88ooo8888.   888           888`88b.        888   .88ooo8888.   888           888`88b.    \n" +
                            " 888    .88P  888       o  .8'     `888.  `88b    ooo   888  `88b.      888  .8'     `888.  `88b    ooo   888  `88b.  \n" +
                            "o888bood8P'  o888ooooood8 o88o     o8888o  `Y8bood8P'  o888o  o888o .o. 88P o88o     o8888o  `Y8bood8P'  o888o  o888o \n" +
                            "                                                                    `Y888P                                            \n" +
                            "                                                                                                                      \n" +
                            "                                                                                                                      \n");

                    blackjack = true;
                }
                /**
                 * Si el boolean blackjack sigue en falso, nos preguntará si queremos coger una carta del 1 al 10 para añadirle a nuestro total, pero si nos pasamos de 21 perderemos
                 *
                 * Hay un booleano por cada carta para comprobar que esta ya ha sido entregada, comprobando en cada tirada que no te pasas de 21.
                 */
                if (!blackjack) {
                    do {
                        System.out.println("¿Quieres pedir otra carta? (si/no)");
                        String opcion1 = teclado.next();
                        if (opcion1.equalsIgnoreCase("no")) {
                            noMasCartas = true;
                        } else if (!dado3usu) {
                            dado3jug = (int) (Math.random() * 10);
                            dado3jug = dado3jug + 1;
                            System.out.println("CARTA 3 PARA EL JUGADOR:" + dado3jug);
                            System.out.println("total de puntos: " + (dado1jug + dado2jug + dado3jug));
                            dado3usu = true;
                            if (dado1jug + dado2jug + dado3jug > 21) {
                                System.out.println("VAYA TE HAS PASADO DE 21");
                                break;

                            }
                        } else if (!dado4usu) {
                            dado4jug = (int) (Math.random() * 10);
                            dado4jug = dado4jug + 1;
                            System.out.println("CARTA 4 PARA EL JUGADOR:" + dado4jug);
                            System.out.println("total de puntos: " + (dado1jug + dado2jug + dado3jug + dado4jug));
                            dado4usu = true;
                            if (dado1jug + dado2jug + dado3jug + dado4jug > 21) {
                                System.out.println("VAYA TE HAS PASADO DE 21");
                                break;
                            }
                        } else if (!dado5usu) {
                            dado5jug = (int) (Math.random() * 10);
                            dado5jug = dado5jug + 1;
                            System.out.println("CARTA 5 PARA EL JUGADOR:" + dado5jug);
                            System.out.println("total de puntos: " + (dado1jug + dado2jug + dado3jug + dado4jug + dado5jug));
                            dado5usu = true;
                            if (dado1jug + dado2jug + dado3jug + dado4jug + dado5jug > 21) {
                                System.out.println("VAYA TE HAS PASADO DE 21");
                                break;
                            }
                        } else if (!dado6usu) {
                            dado6jug = (int) (Math.random() * 10);
                            dado6jug = dado6jug + 1;
                            System.out.println("CARTA 6 PARA EL JUGADOR:" + dado6jug);
                            System.out.println("total de puntos: " + (dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug));
                            dado6usu = true;
                            if (dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug > 21) {
                                System.out.println("VAYA TE HAS PASADO DE 21");
                                break;
                            }
                        } else if (!dado7usu) {
                            dado7jug = (int) (Math.random() * 10);
                            dado7jug = dado7jug + 1;
                            System.out.println("CARTA 7 PARA EL JUGADOR:" + dado7jug);
                            System.out.println("total de puntos: " + (dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug + dado7jug));
                            dado7usu = true;
                            if (dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug + dado7jug > 21) {
                                System.out.println("VAYA TE HAS PASADO DE 21");
                                break;
                            }
                        } else {
                            dado8jug = (int) (Math.random() * 10);
                            dado8jug = dado8jug + 1;
                            System.out.println("CARTA 8 PARA EL JUGADOR:" + dado8jug);
                            System.out.println("total de puntos: " + (dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug + dado7jug + dado8jug));

                            if (dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug + dado7jug + dado8jug > 21) {
                                System.out.println("VAYA TE HAS PASADO DE 21");
                                break;
                            }
                            break;
                        }
                    } while (!noMasCartas);
                    if (noMasCartas) {
                        System.out.print("EL CRUPIER TIENE: " + (dado1Cru + dado2Cru + dado3Cru + dado4Cru + dado5Cru + dado6Cru + dado7Cru));

                        /**
                         * El juego consiste en quedarse más cerca del numero 21 que el crupier por lo tanto
                         * Despues de entregar todas las cartas comienzan las comprobaciones de los casos posibles, si la suma de cartas del usuario es igual al crupier habrá un empate y te devolverán el dinero
                         * En caso de que te pases de 21, el crupier gana
                         * En caso de que el crupier se pase de 21, gana el usuario
                         * Si la suma de numeros del crupier es mayor a la del usuario (sin pasarse de 21 porque eso ya se comprobó dentro de otro if-else, el crupier gana
                         * Y por último en el caso de que el crupier esté mas lejos del 21 que tú, tú ganas
                         *
                         */

                    }
                    if (dado1Cru + dado2Cru + dado3Cru + dado4Cru + dado5Cru + dado6Cru + dado7Cru == dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug + dado7jug + dado8jug) {
                        dineroJugador = dineroJugador + apuesta;
                        System.out.println("\n" +
                                " ▄▄▄▄▄▄▄▄▄▄▄  ▄▄       ▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                                "▐░░░░░░░░░░░▌▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌\n" +
                                "▐░█▀▀▀▀▀▀▀▀▀ ▐░▌░▌   ▐░▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ \n" +
                                "▐░▌          ▐░▌▐░▌ ▐░▌▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌          \n" +
                                "▐░█▄▄▄▄▄▄▄▄▄ ▐░▌ ▐░▐░▌ ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ \n" +
                                "▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌     ▐░░░░░░░░░░░▌\n" +
                                "▐░█▀▀▀▀▀▀▀▀▀ ▐░▌   ▀   ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌     ▐░▌     ▐░█▀▀▀▀▀▀▀▀▀ \n" +
                                "▐░▌          ▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌     ▐░▌     ▐░▌          \n" +
                                "▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ \n" +
                                "▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌     ▐░▌     ▐░░░░░░░░░░░▌\n" +
                                " ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀            ▀         ▀       ▀       ▀▀▀▀▀▀▀▀▀▀▀ \n" +
                                "                                                                              \n");
                        System.out.println("NO HAS PERDIDO DINERO");
                    } else if (dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug + dado7jug + dado8jug > 21) {
                        System.out.println("\n" +
                                " ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                                "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌\n" +
                                "▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                                "▐░▌          ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌          ▐░▌       ▐░▌     ▐░▌          ▐░▌       ▐░▌▐░▌▐░▌    ▐░▌▐░▌       ▐░▌\n" +
                                "▐░▌          ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌ ▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▌   ▐░▌▐░█▄▄▄▄▄▄▄█░▌\n" +
                                "▐░▌          ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌     ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌▐░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌\n" +
                                "▐░▌          ▐░█▀▀▀▀█░█▀▀ ▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀▀▀      ▐░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀      ▐░▌ ▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌   ▐░▌ ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                                "▐░▌          ▐░▌     ▐░▌  ▐░▌       ▐░▌▐░▌               ▐░▌     ▐░▌          ▐░▌     ▐░▌       ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌    ▐░▌▐░▌▐░▌       ▐░▌\n" +
                                "▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌ ▐░█▄▄▄▄▄▄▄█░▌▐░▌           ▄▄▄▄█░█▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌      ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░▌     ▐░▐░▌▐░▌       ▐░▌\n" +
                                "▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌          ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌      ▐░░▌▐░▌       ▐░▌\n" +
                                " ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀            ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀        ▀▀  ▀         ▀ \n" +
                                "                                                                                                                                                    \n");

                    } else if (dado1Cru + dado2Cru + dado3Cru + dado4Cru + dado5Cru + dado6Cru + dado7Cru > 21) {
                        dineroJugador = dineroJugador + (apuesta * 2);
                        System.out.println("\n" +
                                " ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                                "▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌\n" +
                                "▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                                "▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌       ▐░▌     ▐░▌          ▐░▌       ▐░▌▐░▌▐░▌    ▐░▌▐░▌       ▐░▌\n" +
                                "▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░▌       ▐░▌     ▐░▌ ▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▌   ▐░▌▐░█▄▄▄▄▄▄▄█░▌\n" +
                                "▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌     ▐░▌       ▐░▌     ▐░▌▐░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌\n" +
                                "▐░▌       ▐░▌ ▀▀▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀█░█▀▀      ▐░▌     ▐░▌       ▐░▌     ▐░▌ ▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌   ▐░▌ ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                                "▐░▌       ▐░▌          ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌     ▐░▌       ▐░▌     ▐░▌       ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌    ▐░▌▐░▌▐░▌       ▐░▌\n" +
                                "▐░█▄▄▄▄▄▄▄█░▌ ▄▄▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░▌      ▐░▌  ▄▄▄▄█░█▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌     ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░▌     ▐░▐░▌▐░▌       ▐░▌\n" +
                                "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌      ▐░░▌▐░▌       ▐░▌\n" +
                                " ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀        ▀▀  ▀         ▀ \n" +
                                "                                                                                                                                                    \n");

                    } else if (dado1Cru + dado2Cru + dado3Cru + dado4Cru + dado5Cru + dado6Cru + dado7Cru > dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug + dado7jug + dado8jug) {
                        System.out.println("\n" +
                                " ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                                "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌\n" +
                                "▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                                "▐░▌          ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌          ▐░▌       ▐░▌     ▐░▌          ▐░▌       ▐░▌▐░▌▐░▌    ▐░▌▐░▌       ▐░▌\n" +
                                "▐░▌          ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌ ▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▌   ▐░▌▐░█▄▄▄▄▄▄▄█░▌\n" +
                                "▐░▌          ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌     ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌▐░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌\n" +
                                "▐░▌          ▐░█▀▀▀▀█░█▀▀ ▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀▀▀      ▐░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀      ▐░▌ ▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌   ▐░▌ ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                                "▐░▌          ▐░▌     ▐░▌  ▐░▌       ▐░▌▐░▌               ▐░▌     ▐░▌          ▐░▌     ▐░▌       ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌    ▐░▌▐░▌▐░▌       ▐░▌\n" +
                                "▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌ ▐░█▄▄▄▄▄▄▄█░▌▐░▌           ▄▄▄▄█░█▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌      ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░▌     ▐░▐░▌▐░▌       ▐░▌\n" +
                                "▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌          ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌      ▐░░▌▐░▌       ▐░▌\n" +
                                " ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀            ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀        ▀▀  ▀         ▀ \n" +
                                "                                                                                                                                                    \n");
                    } else if (dado1Cru + dado2Cru + dado3Cru + dado4Cru + dado5Cru + dado6Cru + dado7Cru < dado1jug + dado2jug + dado3jug + dado4jug + dado5jug + dado6jug + dado7jug + dado8jug) {
                        dineroJugador = dineroJugador + (apuesta * 2);
                        System.out.println("\n" +
                                " ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                                "▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌\n" +
                                "▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                                "▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌       ▐░▌     ▐░▌          ▐░▌       ▐░▌▐░▌▐░▌    ▐░▌▐░▌       ▐░▌\n" +
                                "▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░▌       ▐░▌     ▐░▌ ▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▌   ▐░▌▐░█▄▄▄▄▄▄▄█░▌\n" +
                                "▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌     ▐░▌       ▐░▌     ▐░▌▐░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌\n" +
                                "▐░▌       ▐░▌ ▀▀▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀█░█▀▀      ▐░▌     ▐░▌       ▐░▌     ▐░▌ ▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌   ▐░▌ ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                                "▐░▌       ▐░▌          ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌     ▐░▌       ▐░▌     ▐░▌       ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌    ▐░▌▐░▌▐░▌       ▐░▌\n" +
                                "▐░█▄▄▄▄▄▄▄█░▌ ▄▄▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░▌      ▐░▌  ▄▄▄▄█░█▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌     ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░▌     ▐░▐░▌▐░▌       ▐░▌\n" +
                                "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌      ▐░░▌▐░▌       ▐░▌\n" +
                                " ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀        ▀▀  ▀         ▀ \n" +
                                "                                                                                                                                                    \n");
                    }
                }
            }
                System.out.println();
                System.out.println("¿DESEAS SEGUIR JUGANDO? (escribe un 0 para terminar de jugar)");
                System.out.println("----------PULSA ENTER PARA JUGAR------------");
                System.out.println();
                teclado.nextLine();
                String opcion2 = teclado.nextLine();
                System.out.println();
                System.out.println();

                if (opcion2.equalsIgnoreCase("0")) {
                    seguir = true;
                }
            }
            while (!seguir) ;

    }
}
