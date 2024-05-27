package juegos;

import utilidades.Util;

import java.util.ArrayList;
import java.util.Scanner;
public class Ruleta {
    public double dineroJugador;
    public double dineroGastadoRule;
    public double dineroGastadoRule(){return dineroGastadoRule;}

    public Ruleta() {
    }
    public Ruleta(double dineroJugador) {
        this.dineroJugador = dineroJugador;
    }
    public void laRule() {
        ArrayList<Integer> luckyNumbers = new ArrayList<>();
        ArrayList<Double> dinerito = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean dineroBien = true;
        boolean empezarsindinero = false;
        boolean noMoney = false;

        //TITULO
        System.out.println("\n" +
                " ▄            ▄▄▄▄▄▄▄▄▄▄▄            ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄  ▄            ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░▌          ▐░░░░░░░░░░░▌          ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌          ▐░░░░░░░░░░░▌\n" +
                "▐░▌          ▐░█▀▀▀▀▀▀▀█░▌          ▐░█▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░▌          ▐░█▀▀▀▀▀▀▀▀▀ \n" +
                "▐░▌          ▐░▌       ▐░▌          ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌          ▐░▌          \n" +
                "▐░▌          ▐░█▄▄▄▄▄▄▄█░▌          ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░▌          ▐░█▄▄▄▄▄▄▄▄▄ \n" +
                "▐░▌          ▐░░░░░░░░░░░▌          ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌          ▐░░░░░░░░░░░▌\n" +
                "▐░▌          ▐░█▀▀▀▀▀▀▀█░▌          ▐░█▀▀▀▀█░█▀▀ ▐░▌       ▐░▌▐░▌          ▐░█▀▀▀▀▀▀▀▀▀ \n" +
                "▐░▌          ▐░▌       ▐░▌          ▐░▌     ▐░▌  ▐░▌       ▐░▌▐░▌          ▐░▌          \n" +
                "▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌          ▐░▌      ▐░▌ ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌▐░▌       ▐░▌          ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀            ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀ \n" +
                "                                                                                        \n");
        /**
         * Aqui se crea el tablero del juego siendo 3 x 12
         */
        String[][] matriz = new String[3][12];
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = String.valueOf(cont);
                cont++;
            }
        }
        /**
         *compruebo que el usuario dispone de dinero antes de empezar a apostar
         */
        if (dineroJugador <= 0) {
            System.out.println("VAYA NO TIENES DINERO!!!");
            System.out.println();
            System.out.println("----------PULSA ENTER PARA ABANDONAR EL JUEGO------------");
            teclado.nextLine();
            System.out.println();
            System.out.println();
            empezarsindinero = true;
        }
        if (!empezarsindinero) {
            boolean otra = false;


//REGLAS DEL PROGRAMA (SOLO INFO)
            System.out.println("¿deseas ver las reglas antes de empezar?(si/no)");
            String opcion = teclado.next();
            if (opcion.equalsIgnoreCase("si")) {
                System.out.println("Las reglas son simples: ");
                System.out.println("1· podras apostar el dinero que decidas sobre los numeros que decidas (son 36 numeros)");
                System.out.println("una vez digas que ya no apuestas mas empezara el juego");
                System.out.println("y el programa elegira 1 solo numero ganador");
                System.out.println("Si has escogido el numero ganador  ");
                System.out.println("el dinero apostado por dicho numero se multiplicara por 35");
                System.out.println("una vez apostado a un numero el dinero ya esta en la mesa no se puede cancelar");
                System.out.println();
            }
            boolean seguir = false;// PARA LA PREGUNTA DEL DO WHILE


            boolean existe = false;
            int numeroapostado;


            System.out.println("Vamos a ir numero por numero es decir me dices numero y dinero para apostar y despues si quieres puedes volver a apostar a otro");

            do {
                boolean dinerin = false;
                seguir = false;
                do {
                    /**
                     *imprimo tablero y le pido al usuario que empiece a decir numeros a los que apostar
                     */
                    Tablero(matriz);
                    System.out.println("Dime a que numero quieres apostar");
                    do {
                        existe = false; // Establecer existe como false antes de verificar
                        numeroapostado = Util.leernumero(0, 35);

                        /**
                         *compruebo que el numero aun no este apostado para poder apostar en el
                         */
                        for (int i = 0; i < luckyNumbers.size(); i++) {
                            int numactu = luckyNumbers.get(i);
                            if (numactu == numeroapostado) {
                                System.out.println("ese numero ya esta apostado");
                                existe = true;
                                break;// Salir del bucle una vez que se encuentra el número
                            }
                        }
                    } while (existe); // Salir del bucle do-while cuando el número no existe en la lista

                    /**
                     *el usuario dice cuanto dinero apostar al numeeo anteriormente dicho
                     */
                    System.out.println("¿cuanto le quieres apostar?");
                    double dineroapostado = teclado.nextInt();
                    /**
                     *comprueba que el dinero apostado no sea mayor al dinero del usuario
                     */
                    if (dineroapostado > dineroJugador) {
                        System.out.println("vaya no te queda esa cantidad prueba con menos ");
                        System.out.println("te quedan " + dineroJugador);
                    } else {
                        /**
                         *restan el dinero apostado y se añaden ambos numero a los arrays
                         */
                        dineroJugador = dineroJugador - dineroapostado;
                        dineroGastadoRule = dineroGastadoRule + dineroapostado;
                        dinerito.add(dineroapostado);
                        luckyNumbers.add(numeroapostado);
                    }
                    if (dineroJugador <= 0) {
                        System.out.println("NO TE QUEDA DINERO PARA SEGUIR APOSTANDO NUMEROS");
                        System.out.println("BUENA SUERTE");
                        dinerin = true;
                    }
                    /**
                     *pregunta para seguir apostando al siguiente numero y poder apostar a varios
                     */
                    if (!dinerin) {
                        System.out.println("quieres seguir apostando (si o no)");
                        String respu = teclado.next();
                        if (respu.equalsIgnoreCase("no")) {
                            seguir = true;
                        }
                    }
                } while (!seguir);

                System.out.println("quieres ver tus apuestas (si o no)");
                String siono = teclado.next();
                if (siono.equalsIgnoreCase("si")) {

                    /**
                     *te da la informacion de numeros apostados y de dinero apostado
                     */
                    for (int i = 0; i < luckyNumbers.size(); i++) {
                        Integer numactu = luckyNumbers.get(i);
                        Double dinactu = dinerito.get(i);

                        System.out.println("HAS APOSTADO " + dinactu + "€ POR EL NUMERO " + numactu);
                    }
                }

                System.out.println();
                System.out.println();
                System.out.println("----------PULSA ENTER PARA JUGAR------------");//Hay que preguntar como hacer que haga una pausa sin tener que escirbir para que siga
                teclado.nextLine();
                teclado.nextLine();
                System.out.println();
                System.out.println();


//pueden tocar del 0 al 35 asique hay 36 posibilidades
                /**
                 *Numero random ganador puede tocar del 0 al 35
                 */
                int numeroPremiado = (int) (Math.random() * 36);


                Tablero(matriz);

                /**
                 *comprueba si el numero ganador es uno de los apostados asi se multiplica el dinero apostado por dicho numero x35
                 */
                for (int i = 0; i < luckyNumbers.size(); i++) {
                    Integer numactu = luckyNumbers.get(i);
                    Double dinactu = dinerito.get(i);

                    if (numactu == numeroPremiado) {
                        dineroJugador = dineroJugador + (dinactu * 35);
                    }


                }


                System.out.println("EL NUMERO GANADOR ES: " + numeroPremiado);
                System.out.println("tu dinero actual es " + dineroJugador);

                System.out.println();
                /**
                 *si no te queda dinero despues del juego te saca directamente
                 */
                if (dineroJugador == 0) {
                    System.out.println("NO TE QUEDA DINERO (SALIENDO DEL JUEGO)");
                    break;
                }
                System.out.println("¿deseas volver a jugar? (si o  no)");
                String responde = teclado.next();
                if (responde.equalsIgnoreCase("no")) {
                    otra = true;
                }
                if (!responde.equalsIgnoreCase("no")) {
                    for (int i = 0; i < luckyNumbers.size(); i++) {
                        Integer numactu = luckyNumbers.get(i);
                        Double dinactu = dinerito.get(i);

                        luckyNumbers.remove(numactu);
                        dinerito.remove(dinactu);
                    }
                }


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

            } while (!otra);
        }
    }

    /**
     *tablero de la ruleta
     */
        public void Tablero(String[][] matriz) {
            int numFilas = matriz.length;
            int numColumnas = matriz[0].length;

            int l = 0;
            System.out.print("┌");
            do {
                l++;
                System.out.print("─────");
            }
            while (l != numColumnas);
            System.out.println("┐");
            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {

                    if (matriz[i][j].length() == 2) {
                        System.out.print("│ " + matriz[i][j] + " ");
                    } else {
                        System.out.print("│ " + matriz[i][j] + "  ");
                    }
                }
                System.out.println(" │");


                if (i < numFilas - 1) {
                    for (int j = 0; j < numColumnas; j++) {
                        System.out.print("├────");
                    }
                    System.out.println("─┤");

                }
            }
            int p = 0;
            System.out.print("└");
            do {
                p++;
                System.out.print("─────");
            }
            while (p != numColumnas);
            System.out.println("┘");
        }
        public double dineroGando(){
        return dineroJugador;
        }

    public double getDineroJugador() {
        return dineroJugador;
    }

    public void setDineroJugador(double dineroJugador) {
        this.dineroJugador = dineroJugador;
    }
}


