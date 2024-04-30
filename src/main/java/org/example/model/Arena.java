package org.example.model;

public class Arena {
    private static Arena instancia;
    private int puntosJugador;
    private int puntosOponente;

    private Arena(){
        puntosJugador = 0;
        puntosOponente = 0;
    } // Constructor Singleton

    public static Arena obtenerInstancia(){
        if (instancia == null) {
            instancia = new Arena();
        }
        return instancia;
    }

    public int jugar (int opcionJugador, int opcionOponente){ // 0=piedra - 1=papel - 2=tijera
        if (opcionJugador == opcionOponente){
            return 0;
        } else if ((opcionJugador == 0 && opcionComputadora == 2) || (opcionJugador == 1 && opcionComputadora == 0) || (opcionJugador == 2 && opcionComputadora == 1)) {
            puntosJugador++;
            if (puntosJugador == 3) {
                return 1; // El jugador gana la partida
            }
            return 1; // El jugador avanza en la arena

        } else {
            puntosJugador --;
            if (puntosJugador == -3) {
                return -1; // El jugador pierde la partida
            }
            return -1; // El jugador retrocede en la arena
        }
    }

    public int getPuntosJugador(){
        return puntosJugador;
    }

    public void setPuntosJugador(int puntosJugador){
        this.puntosJugador = puntosJugador;
    }

    /*public int getPuntosOponente(){
        return puntosOponente;
    }

    public void setPuntosOponente(int puntosOponente){
        this.puntosOponente = puntosOponente;
    }*/

    public void reiniciar(){
        puntosJugador = 0;
       // puntosOponente = 0;
    }

}
