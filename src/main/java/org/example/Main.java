package org.example;

import org.example.controller.Game;
import org.example.model.Arena;
import org.example.model.Jugador;

import org.example.view.Pantalla;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Arena arena = Arena.getInstance();
        Pantalla pantalla = new Pantalla();
        Jugador jugador = new Jugador(pantalla);
        Game game = new Game(arena, pantalla, jugador);
        game.menu();

    }
}