package jugador;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Jugador {
    public double cartera;
    public String nombre;
    public double dineroPerdido;
    public Date fechaUltimaPartida;
    public double dineroPerdidoruleta;
    public double dineroPerdidoTon;
    public double dineroPerdidoLuminosa;
    public double dineroPerdidoBlackjack;

    /**
     * Constructor de jugador, todos los atributos se inicializan a 0 hasta que obtengan un valor
     */

    public Jugador() {
        this.dineroPerdido = 0;
        this.fechaUltimaPartida = new Date();
        this.dineroPerdidoruleta = 0;
        this.dineroPerdidoTon = 0;
        this.dineroPerdidoLuminosa = 0;
        this.dineroPerdidoBlackjack = 0;
    }
    public  void dineroperdido(){
        this.dineroPerdido = dineroPerdidoBlackjack + dineroPerdidoruleta + dineroPerdidoLuminosa + dineroPerdidoTon;
    }
    public void dineroPerdidoruleta(double dineroPerdidoruleta){
        this.dineroPerdidoruleta = this.dineroPerdidoruleta + dineroPerdidoruleta;
    }
    public void dineroPerdidoTon(double dineroPerdidoTon){
        this.dineroPerdidoTon = this.dineroPerdidoTon + dineroPerdidoTon;
    }
    public void dineroPerdidoLuminosa(double dineroPerdidoLuminosa){
        this.dineroPerdidoLuminosa= this.dineroPerdidoLuminosa + dineroPerdidoLuminosa;
    }
    public void dineroPerdidoBlackJack(double dineroPerdidoBlackJack){
        this.dineroPerdidoBlackjack= this.dineroPerdidoBlackjack + dineroPerdidoBlackJack;
    }

    public void recogerGanancias(double ganancias){
        this.cartera = ganancias;
    }

    public void ponerNombre(Scanner teclado){
        this.nombre = teclado.next();
    }

    public void cantidadBase(Scanner teclado){
        this.cartera = teclado.nextDouble();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCartera() {
        return cartera;
    }
    public void cajero(double dineroextra){
        cartera = cartera + dineroextra;
    }

    public void setCartera(double cartera) {
        this.cartera = cartera;
    }

    public void imprimir() {
        System.out.println("Jugador: " + this.nombre);
        System.out.println("Cantidad de dinero: " + this.cartera);
    }

    public void imprimirEstadisticas() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Jugador: " + this.nombre);
        System.out.println("Cantidad de dinero: " + this.cartera);
        System.out.println("Dinero perdido total: " + this.dineroPerdido);
        System.out.println("Dinero perdido en ruleta: " + this.dineroPerdidoruleta);
        System.out.println("Dinero perdido en Ton: " + this.dineroPerdidoTon);
        System.out.println("Dinero perdido en Luminosa: " + this.dineroPerdidoLuminosa);
        System.out.println("Dinero perdido en Blackjack: " + this.dineroPerdidoBlackjack);
        System.out.println("Fecha de la última partida: " + (this.fechaUltimaPartida != null ? sdf.format(this.fechaUltimaPartida) : "N/A"));
    }

    /**
     * Hemos investigado la funcion Buffered writer para escribir contenido dentro de una clase FileWriter que hemos creado con el nombre archivo
     * Dentro de esta utilizamos la funcion write para escribir lo que queramos
     * Si la fecha no es nula se escribe la fecha de la última partida y si es nula se escribe N/A
     * @param archivo
     */
    public void guardarEnArchivo(String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            writer.write(this.nombre + "\n");
            writer.write(this.cartera + "\n");
            writer.write(this.dineroPerdido + "\n");
            writer.write(this.dineroPerdidoruleta + "\n");
            writer.write(this.dineroPerdidoTon + "\n");
            writer.write(this.dineroPerdidoLuminosa + "\n");
            writer.write(this.dineroPerdidoBlackjack + "\n");
            writer.write(fechaUltimaPartida != null ? sdf.format(fechaUltimaPartida) : "N/A");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setFechaUltimaPartida() {
        this.fechaUltimaPartida = new Date();
    }

    /**
     * BufferedReader es para leer archivos, creamos FileReader con el nombre de reader y metemos cada linea o valor dentro de las variables o atributos.
     * @param archivo
     */

    public void leerDeArchivo(String archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            this.nombre = reader.readLine();
            this.cartera = Double.parseDouble(reader.readLine());
            this.dineroPerdido = Double.parseDouble(reader.readLine());
            this.dineroPerdidoruleta = Double.parseDouble(reader.readLine());
            this.dineroPerdidoTon = Double.parseDouble(reader.readLine());
            this.dineroPerdidoLuminosa = Double.parseDouble(reader.readLine());
            this.dineroPerdidoBlackjack = Double.parseDouble(reader.readLine());
            String fechaUltimaPartidaStr = reader.readLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            this.fechaUltimaPartida = fechaUltimaPartidaStr.equals("N/A") ? null : sdf.parse(fechaUltimaPartidaStr);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}