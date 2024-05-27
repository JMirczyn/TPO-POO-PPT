package org.example.model;

import org.example.view.Pantalla;

public class Jugador {
    private Pantalla pantalla;
    public Jugador(Pantalla pantalla){
        this.pantalla = pantalla;
    }

    public int opcion (){
        pantalla.mostrarMensaje("Elije: 0 para piedra, 1 para papel, 2 para tijera:");
        return pantalla.obtenerEntrada();
    }

}