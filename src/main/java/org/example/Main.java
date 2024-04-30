package org.example;

import org.example.controller.Game;
import org.example.model.Arena;
import org.example.model.Jugador;
import org.example.model.Oponente;
import org.example.view.Pantalla;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Arena arena = Arena.obtenerInstancia();
        Pantalla pantalla = new Pantalla();
        Jugador jugador = new Jugador(pantalla);
        Oponente oponente = new Oponente();
        Game game = new Game(arena, pantalla, jugador, oponente);
        game.jugar();

    }
}