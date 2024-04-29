package org.example.view;

import org.example.controller.Game;

public class Pantalla {
    private Game juego;
    private static Pantalla instancia;

    private Pantalla() {this.juego = new Game();}

    public static Pantalla getInstance(){
        if(instancia == null){
            instancia = new Pantalla();
        }
        return instancia;
    }

    public Game getGame(){return this.juego;}

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        Game game = Game.getInstance();
        int opcion;
        do {
            System.out.println("Bienvenido al combate PPT");
            System.out.println("Seleccionar una opcion");
            System.out.println("1-Iniciar el Juego");
            System.out.println("2-Salir del Juego");
            String input = scanner.nextLine();
            try {
                opcion = Integer.parseInt(input);
                if (opcion != 1 && opcion != 2){
                    System.out.println("No coloco una opcion correcta, Por favor intente nuevamente.");
                }
            }catch (NumberFormatException e){
                System.out.println("Opcion invalida, Por favor intente nuevamente.");
            }
        }while (opcion != 1 && opcion != 2);
        if (opcion == 2){
            System.out.println("Saliendo del programa");
        }
        if (opcion == 1) {
            do {
                System.out.println("Seleccionar ataque (1, 2 o 3)");
                System.out.println("1-Piedra");
                System.out.println("2-Papel");
                System.out.println("3-Tijera");
                String input = scanner.nextLine();
                try {
                    opciones = Integer.parseInt(input);
                    if (opciones != 1 && opciones != 2 & opciones != 3) {
                        System.out.println("Opción inválida. Por favor, ingrese 1 , 2 o 3");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                    opcion = 0;
                }
            } while (opcion != 1 && opcion != 2);
            estatuspartida += 1;
            game.setEstatuspartida(estatuspartida);
            eleccion = opciones;
            game.setEleccion(eleccion);
        }
    }

}
