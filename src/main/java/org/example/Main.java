package org.example;

import org.example.view.Pantalla

public class Main {
    public static void main(String[] args) {
        Pantalla pantalla = Pantalla.getInstance();
        pantalla.getGame().Jugar();
        pantalla.mostrar_info();
    }
}