package org.example.view;

import java.util.Scanner;

public class Pantalla {
    public static void mostrarMensaje (String mensaje) {
        System.out.println(mensaje);
    }

    public int obtenerOpcion (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
