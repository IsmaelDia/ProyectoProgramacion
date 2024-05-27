package juegos;

import java.util.Scanner;

public class ToN {
        Scanner teclado = new Scanner(System.in);

public double dineroJugador;
    public double dineroGastadoTon;
    public double dineroGastadoTon(){return dineroGastadoTon;}
    public void setDineroJugador(double dineroJugador) {
        this.dineroJugador = dineroJugador;
    }
    public double dineroGandoTon;

    public void ToN(){

        System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄       ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌     ▐░░▌      ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌     ▐░█▀▀▀▀▀▀▀█░▌     ▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                "     ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌       ▐░▌     ▐░▌▐░▌    ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌\n" +
                "     ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌       ▐░▌     ▐░▌ ▐░▌   ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌\n" +
                "     ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌       ▐░▌     ▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌\n" +
                "     ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌       ▐░▌     ▐░▌   ▐░▌ ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                "     ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌       ▐░▌     ▐░▌    ▐░▌▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌\n" +
                "     ▐░▌     ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░▐░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌\n" +
                "     ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌     ▐░▌      ▐░░▌▐░▌       ▐░▌▐░░░░░░░░░░▌ ▐░▌       ▐░▌\n" +
                "      ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀   ▀▀▀▀▀▀▀▀▀▀▀       ▀▀▀▀▀▀▀▀▀▀▀       ▀        ▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀   ▀         ▀ \n" +
                "                                                                                                                               ");


        System.out.println("¿deseas ver las reglas antes de empezar?(si/no)");
        String opcion = teclado.next();
        if (opcion.equalsIgnoreCase("si")) {
            System.out.println("Reglas del juego:");
            System.out.println("La primera tirada tendrás un multiplicador x2 con un 45% de probabilidad");
            System.out.println("Si aciertas tendrás la oportunidad de volver a jugar, esta vez con un multiplicador x3 y 35% de probabilidad");
            System.out.println("Si la suerte te sonríe llegarás a tu tercera tirada donde podrás elegir retirarte o arriesgarlo todo con un multiplicador x4 y un 25% de probabilidad");
            System.out.println("Si has llegado hasta aquí podrás hacerte de oro con un multiplicador x10 pero tan solo 10% de probabilidad. ¿Te arriesgarás?");
        }

        //int dineroJugador = 100;
        int apuestaJuego = 0;

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Estás aquí");
        System.out.println(" ");
        System.out.println("o");
        System.out.println("- - - -");
        System.out.println(" ");
        System.out.println(" ");
        int apuesta;

        do {
            System.out.println("Ingrese la apuesta:");
            apuesta = teclado.nextInt();
        } while (apuesta > dineroJugador || apuesta < 0 ||  dineroJugador <= 0 || apuesta == 0);
        dineroJugador = dineroJugador - apuesta;
        dineroGastadoTon = dineroGandoTon + apuesta;
        //AQUI IRIA TODO EL TEMA DE REDUCCION DE DINERO ETC


        /**
         * Creo un bucle infinito del que solo se sale con un break; en el que se pregunta si quiere apostar, la cantidad, y se condiciona según el dinero o la apuesta realizada
         */
        while (true) {
            apuestaJuego = jugar(teclado, apuesta);
            dineroJugador += apuestaJuego;
            System.out.println("¿Quieres apostar? (si/no)");
            String opcionMenu = teclado.next();
            if (opcionMenu.equalsIgnoreCase("si")){
                if (dineroJugador == 0) {
                    System.out.println("No tienes dinero para apostar");
                    break;
                }
                else {
                do {
                    System.out.println("Ingrese la apuesta:");
                    apuesta = teclado.nextInt();  
                } while (apuesta > dineroJugador || apuesta < 0 || dineroJugador == 0);
                dineroJugador = dineroJugador - apuesta;
                    dineroGastadoTon = dineroGandoTon + apuesta;
}


            }
            if (!opcionMenu.equalsIgnoreCase("si")) {
                break;
            }
        }

        System.out.println("Gracias por jugar. Vuelve pronto.");
        System.out.println("Dinero " + dineroJugador );
    }

    /**
     * Aquí en el método jugar, más de lo mismo, solo que en este caso se utiliza un boolean ganar para salir al final del programa, de lo contrario se rompería con un brake
     *En este método se crean variables de tiradas, que mediante un mathRandom y compararlo a un número del 1 al 100 se saca el % de probabilidad, si está dentro del rango, avanzas si no no.
     * @param teclado
     * @param apuesta
     * @return
     */
    public static int jugar(Scanner teclado, int apuesta) {

        int apuestaJuego = apuesta;

        boolean ganando = true;

        int primerTirada = (int) (Math.random() * 100) + 1;


        while (ganando) {

            apuestaJuego = apuesta;


            if (primerTirada <= 45) {
                apuestaJuego = apuestaJuego * 2;
                System.out.println("Has ganado la primera tirada, tu apuesta se multiplicará x2, dinero actual: " + apuestaJuego);
                System.out.println("Estás aquí");
                System.out.println(" ");
                System.out.println("  o");
                System.out.println("- - - -");
                System.out.println(" ");
            } else {
                System.out.println("Has perdido la primera tirada :(");
                apuestaJuego = 0;
                break;
            }
            System.out.println("En la segunda tirada tu dinero actual se multiplicará x3 con 35% de probabilidad, tu dinero actual es: " + apuestaJuego);
            System.out.println("Quieres seguir jugando?");
            String opcionJuego = teclado.next();
            if (opcionJuego.equalsIgnoreCase("no")) {
                return apuestaJuego;
            }
            int segundaTirada = (int) (Math.random() * 100) + 1;
            if (segundaTirada <= 35) {
                apuestaJuego = apuestaJuego * 3;
                System.out.println("Has ganado la segunda tirada, tu apuesta se multiplicará x3, tu dinero actual: " + apuestaJuego);
                System.out.println(" ");
                System.out.println("Estás aquí");
                System.out.println(" ");
                System.out.println("    o");
                System.out.println("- - - -");
                System.out.println(" ");
            } else {
                System.out.println("Que mala suerte :(, has perdido la segunda tirada, vuelve a probar");
                apuestaJuego = 0;
                break;
            }
            System.out.println("Asombrosamente has llegado a la tercera tirada, esta vez tu apuesta se multiplicará x4 pero con un 25%, tu dinero actual es: " + apuestaJuego);
            System.out.println("Quieres seguir jugando?");
            String opcionJuego2 = teclado.next();
            if (opcionJuego2.equalsIgnoreCase("no")) {
                return apuestaJuego;
            }
            //System.out.println("Asombrosamente has llegado a la tercera tirada, esta vez tu apuesta se multiplicará x4 pero con un 25%, tu dinero actual es: " + apuestaJuego);
            int terceraTirada = (int) (Math.random() * 100) + 1;
            if (terceraTirada <= 25) {
                apuestaJuego = apuestaJuego * 4;
                System.out.println("WOW, has ganado la tercera tirada, tu saldo actual es de: " + apuestaJuego);
                System.out.println(" ");
                System.out.println("Estás aquí");
                System.out.println(" ");
                System.out.println("      o");
                System.out.println("- - - -");
                System.out.println(" ");
            } else {
                System.out.println("Que mala suerte :(, has perdido la tercera tirada, vuelve a probar");
                apuestaJuego = 0;
                break;
            }
            System.out.println("¡QUÉ LOCURA! HAS LLEGADO AL PREMIO BONUS, AQUÍ MULTIPLICARÁS TUS GANANCIAS X10 PERO TENDRÁS TAN SOLO 10% DE POSIBILIDADES, ¿TE ARRIESGARÁS?");
            System.out.println("Quieres seguir jugando?");
            String opcionJuego3 = teclado.next();
            if (opcionJuego3.equalsIgnoreCase("no")) {
                return apuestaJuego;
            }

            int cuartaTirada = (int) (Math.random() * 100) + 1;
            if (cuartaTirada <= 10) {
                apuestaJuego = apuestaJuego * 10;
                System.out.println("ENHORABUENA, HAS GANADO EL TODO O NADA. DISFRUTA DE TU PREMIO " + apuestaJuego);
            } else {
                System.out.println("Que mala suerte :(, has perdido el TODO O NADA, vuelve a probar");
                apuestaJuego = 0;
                break;
            }
            ganando = false;


        }
        return apuestaJuego;
    }
    public double dineroGando(){
        return dineroJugador;
    }
}
