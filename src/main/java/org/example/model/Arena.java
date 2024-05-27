package org.example.model;
import java.util.Random;

public class Arena {
    private static Arena instance;
    private int puntosJugador;
    private Random random;

    private Arena(){
        puntosJugador = 0;
        random = new Random();
    } // Constructor Singleton

    public static Arena getInstance(){
        if (instance == null) {
            instance = new Arena();
        }
        return instance;
    }


    public static int jugar(int opcionJugador) {
        Arena arena = getInstance();
        return arena.jugarRonda(opcionJugador);
    }

    private int jugarRonda(int opcionJugador) {
        int opcionOponente = generarOpcionOponente();
        if (opcionJugador == opcionOponente){
            return 0; // Empate
        } else if ((opcionJugador == 0 && opcionOponente == 2) || (opcionJugador == 1 && opcionOponente == 0) || (opcionJugador == 2 && opcionOponente == 1)) {
            puntosJugador++;
            if (puntosJugador == 3) {
                return 3; // El jugador gana la partida
            }
            return 1; // El jugador avanza en la arena

        } else {
            puntosJugador --;
            if (puntosJugador == -3) {
                return -3; // El jugador pierde la partida
            }
            return -1; // El jugador retrocede en la arena
        }
    }
    /* public int jugar(int opcionJugador){ // 0=piedra - 1=papel - 2=tijera
        int opcionOponente = generarOpcionOponente();
        if (opcionJugador == opcionOponente){
            return 0; // Empate
        } else if ((opcionJugador == 0 && opcionOponente == 2) || (opcionJugador == 1 && opcionOponente == 0) || (opcionJugador == 2 && opcionOponente == 1)) {
            puntosJugador++;
            if (puntosJugador == 3) {
                return 3; // El jugador gana la partida
            }
            return 1; // El jugador avanza en la arena

        } else {
            puntosJugador --;
            if (puntosJugador == -3) {
                return -3; // El jugador pierde la partida
            }
            return -1; // El jugador retrocede en la arena
        }
    }*/

    public int getPuntosJugador(){
        return puntosJugador;
    }

    public void setPuntosJugador(int puntosJugador){
        this.puntosJugador = puntosJugador;
    }

    private int generarOpcionOponente(){
        return random.nextInt(3);
    }

    public void reiniciar(){
        puntosJugador = 0;
    }

}
