package org.example.view;
import java.util.Scanner;

public class Pantalla {
    private Scanner scanner;

    public Pantalla(){
        scanner = new Scanner(System.in);
    }

   // private static Pantalla instancia;

    /*public static Pantalla getInstance(){
        if(instancia == null){
            instancia = new Pantalla();
        }
        return instancia;
    }*/

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public int obtenerEntrada(){
        while(true){
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                mostrarMensaje("Entrada no valida");
                }
        }
    }


}
