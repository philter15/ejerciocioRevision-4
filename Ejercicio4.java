package com.generation;

// se importa Scanner
import java.util.Scanner;

public class Codigo4 {
  /**
   * Se importa el Scanner
   * Se realiza el public static
   * se modifica el nombre de la variable j1 por j2 que corresponde a jugador 2
   * se modifica el texto "jugador 1" por jugador 2
   * se corrigen y agregan corchetes en el codigo
   */
    public static void main(String[] args) {
      
  Scanner s = new Scanner(System.in);
        
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        Scanner s2 = new Scanner(System.in);
        String j2 = s2.nextLine();
        
        if (j1 == j2) {
          System.out.println("Empate");
        } else {
          int g = 2;
          switch(j1) {
            case "piedra":
              if (j2 == "tijeras") {
                g = 1;
              }
  
            case "papel":
              if (j2 == "piedra") {
                g = 1;
              }
            case "tijera":
              if (j2.equals("papel")) {
                g = 1;
              }
              break;
            default:
          }
          System.out.println("Gana el jugador " + g);
        }
  }
}