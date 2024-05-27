package org.example.controller;

import org.example.model.Arena;
import org.example.model.Jugador;
import org.example.view.Pantalla;

public class Game {
    private Arena arena;
    private Pantalla pantalla;
    private Jugador jugador;
    private boolean partidaEnCurso;

    public Game(Arena arena, Pantalla pantalla, Jugador jugador){
        this.arena = arena;
        this.pantalla = pantalla;
        this.jugador = jugador;
        this.partidaEnCurso = false;
    }

    public void iniciarPartida(){
        if(!partidaEnCurso){
            partidaEnCurso = true;
            arena.reiniciar();
            pantalla.mostrarMensaje("Inicio de partida");
            pantalla.mostrarMensaje("Debes empujar a tu oponente fuera de la arena.");
            pantalla.mostrarMensaje("Cada vez que ganes una ronda lo empujaras una posta.");
            pantalla.mostrarMensaje("Pero ten en cuenta que si pierdes, retrocederas.");
            pantalla.mostrarMensaje("Cada combatiente comienza con 3 postas detras");
            pantalla.mostrarMensaje("Buena suerte");
            jugar();
        } else {
            pantalla.mostrarMensaje("Ya hay una partida en curso");
        }
    }

    public void terminarPartida(){
        if (partidaEnCurso){
            partidaEnCurso = false;
            pantalla.mostrarMensaje("Fin de la partida");
        } else {
            pantalla.mostrarMensaje("No es valido");
        }
    }

    public void jugar() {
        while (partidaEnCurso) {
            pantalla.mostrarMensaje("Posicion: " + arena.getPuntosJugador());

            int opcionJugador = jugador.opcion();


            int resultado = Arena.jugar(opcionJugador);
            if (resultado == 0) {
                pantalla.mostrarMensaje("Empate");
            } else if (resultado == 1) {
                pantalla.mostrarMensaje("Ganaste");
                pantalla.mostrarMensaje("Empujas al oponente una posta");
            } else if (resultado == -1){
                pantalla.mostrarMensaje("Perdiste");
                pantalla.mostrarMensaje("Retrocedes una posta");
            } else if (resultado == 3){
                pantalla.mostrarMensaje("¡Has derrotado a tu oponente!");
                pantalla.mostrarMensaje("¡Felicitaciones!");
                partidaEnCurso = false;
            } else if (resultado == -3){
                pantalla.mostrarMensaje("¡Has sido derrotado!");
                pantalla.mostrarMensaje("¡Mejor suerte la proxima!");
                partidaEnCurso = false;
            }
        }
    }

    public void menu() {
        boolean ejecutar = true;

        while (ejecutar) {
            pantalla.mostrarMensaje("Elije: 1 para iniciar partida, 2 para terminar partida, 3 para salir:");
            int opcion = pantalla.obtenerEntrada();
            switch (opcion) {
                case 1:
                    iniciarPartida();
                    break;
                case 2:
                    terminarPartida();
                    break;
                case 3:
                    ejecutar = false;
                    pantalla.mostrarMensaje("Saliendo del juego");
                    break;
                default:
                    pantalla.mostrarMensaje("Opcion no valida");
                    break;
            }
        }
    }

}

