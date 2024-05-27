package org.example.view;
import java.util.Scanner;

public class Pantalla {
    private Scanner scanner;

    public Pantalla(){
        scanner = new Scanner(System.in);
    }

   /* private Game juego;*/
    private static Pantalla instancia;

   /*  public Pantalla() {this.juego = new Game();}*/

    public static Pantalla getInstance(){
        if(instancia == null){
            instancia = new Pantalla();
        }
        return instancia;
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public int obtenerEntrada(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
