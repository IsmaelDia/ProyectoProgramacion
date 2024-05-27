import juegos.Blackjack;
import juegos.Luminosa;
import juegos.Ruleta;
import juegos.ToN;
import jugador.Jugador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jugador p1 = new Jugador();
        Ruleta gira = new Ruleta();
        Luminosa tragaperras = new Luminosa();
        Blackjack bj=new Blackjack();
        ToN todonada = new ToN();
        Scanner teclado = new Scanner(System.in);
        int juego = 0;
        boolean RespondeNumeromenu=false;
        System.out.println("\n" +
                "                              ________/\\\\\\\\\\\\\\\\\\_______________/\\\\\\\\\\\\\\\\\\__________________/\\\\\\\\\\\\\\\\\\\\\\______________/\\\\\\\\\\\\\\\\\\\\\\____________/\\\\\\\\\\_____/\\\\\\_________________/\\\\\\\\\\______        \n" +
                "                               _____/\\\\\\////////______________/\\\\\\\\\\\\\\\\\\\\\\\\\\______________/\\\\\\/////////\\\\\\___________\\/////\\\\\\///____________\\/\\\\\\\\\\\\___\\/\\\\\\_______________/\\\\\\///\\\\\\____       \n" +
                "                                ___/\\\\\\/______________________/\\\\\\/////////\\\\\\____________\\//\\\\\\______\\///________________\\/\\\\\\_______________\\/\\\\\\/\\\\\\__\\/\\\\\\_____________/\\\\\\/__\\///\\\\\\__      \n" +
                "                                 __/\\\\\\_______________________\\/\\\\\\_______\\/\\\\\\_____________\\////\\\\\\_______________________\\/\\\\\\_______________\\/\\\\\\//\\\\\\_\\/\\\\\\____________/\\\\\\______\\//\\\\\\_     \n" +
                "                                  _\\/\\\\\\_______________________\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\________________\\////\\\\\\____________________\\/\\\\\\_______________\\/\\\\\\\\//\\\\\\\\/\\\\\\___________\\/\\\\\\_______\\/\\\\\\_    \n" +
                "                                   _\\//\\\\\\______________________\\/\\\\\\/////////\\\\\\___________________\\////\\\\\\_________________\\/\\\\\\_______________\\/\\\\\\_\\//\\\\\\/\\\\\\___________\\//\\\\\\______/\\\\\\__   \n" +
                "                                    __\\///\\\\\\____________________\\/\\\\\\_______\\/\\\\\\____________/\\\\\\______\\//\\\\\\________________\\/\\\\\\_______________\\/\\\\\\__\\//\\\\\\\\\\\\____________\\///\\\\\\__/\\\\\\____  \n" +
                "                                     ____\\////\\\\\\\\\\\\\\\\\\___________\\/\\\\\\_______\\/\\\\\\___________\\///\\\\\\\\\\\\\\\\\\\\\\/______________/\\\\\\\\\\\\\\\\\\\\\\___________\\/\\\\\\___\\//\\\\\\\\\\______________\\///\\\\\\\\\\/_____ \n" +
                "                                      _______\\/////////____________\\///________\\///______________\\///////////_______________\\///////////____________\\///_____\\/////_________________\\/////_______\n");
//Juegos.Luminosa.LaLumi();//posibilidades de ganar 1 de cada 28 aprox
    System.out.print("¿Desea cargar un jugador existente? (si/no): ");
    String respuesta = teclado.next();

    if (respuesta.equalsIgnoreCase("si")) {
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = teclado.next();
        p1.leerDeArchivo(nombre + ".txt");
        System.out.println("cargando datos..");
        p1.imprimir();
    } else {
        System.out.print("Por favor Introduzca su nombre: ");
        p1.ponerNombre(teclado);
        boolean RespondeNumeroDeDinero = false;

        while (!RespondeNumeroDeDinero) {
            try {
                System.out.print("Bienvenido "+p1.getNombre() + " ¿Cuanto dinero llevas?: ");
                p1.cantidadBase(teclado);
                RespondeNumeroDeDinero = true;
            }  catch (InputMismatchException nfe) {
                System.out.println("ERROR: El dinero debe ser un numero");
                teclado.next();
            }
        }
    }
        while (!RespondeNumeromenu) {
            try {
                do {
                    String nombre = p1.getNombre();
                    System.out.println("1*La ruleta");
                    System.out.println("2*Luminosa");
                    System.out.println("3*Todo o Nada");
                    System.out.println("4*Blackjack");
                    System.out.println("5*Imprimir estadisticas¡");
                    System.out.println("6*METER DINERO (POR SI TE QUEDAS POBRE)");
                    System.out.println("7*GUARDAR INFORMACION DEL USUARIO Y SALIR");
                    System.out.println("-----------------Introduce el numero del juego para seleccionarlo------------------------");
                    System.out.print(" ");
                    juego = teclado.nextInt();
                    RespondeNumeromenu = true;
                    switch (juego) {
                        case 1:
                            System.out.println("Iniciando la ruleta");
                            gira.setDineroJugador(p1.getCartera());
                            gira.laRule();
                            p1.recogerGanancias(gira.dineroGando());
                            p1.dineroPerdidoruleta(gira.dineroGastadoRule());
                            break;
                        case 2:
                            System.out.println("Iniciando la Luminosa");
                            tragaperras.setDineroJugador(p1.getCartera());
                            tragaperras.LaLumi();
                            p1.recogerGanancias(tragaperras.dineroGando());
                            p1.dineroPerdidoLuminosa(tragaperras.dineroGastadoLumi());
                            break;
                        case 3:
                            System.out.println("Iniciando el Todo o Nada");
                            todonada.setDineroJugador(p1.getCartera());
                            todonada.ToN();
                            p1.recogerGanancias(todonada.dineroGando());
                            p1.dineroPerdidoTon(todonada.dineroGastadoTon());
                            break;
                        case 4:
                            System.out.println("Iniciando la BLACKJACK");
                            bj.setDineroJugador(p1.getCartera());
                            bj.Blackjah();
                            p1.recogerGanancias(bj.dineroGando());
                            p1.dineroPerdidoBlackJack(bj.dineroGastadoBlack());
                            break;
                        case 5:
                            System.out.println("...estadisticas del jugador...");
                            p1.imprimirEstadisticas();
                            break;
                        case 6:
                            System.out.println("¿Cuanto dinero quieres sacar?");
                            p1.cajero(teclado.nextDouble());
                        case 7:
                            System.out.println("Guardando datos...");
                            p1.setFechaUltimaPartida();
                            p1.guardarEnArchivo(nombre + ".txt");
                            break;
                        default:
                            System.out.println("DEL 1 AL 7 POR FAVOR");
                    }
                    p1.setFechaUltimaPartida();
                    p1.dineroperdido();
                } while (juego != 7);

        }  catch (InputMismatchException nfe) {
                System.out.println("ERROR: Debes decir el numero que desees del menu");
                teclado.next();
            }
        }

        }
    }

