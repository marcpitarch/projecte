/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author marc
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nom=null, posicio; 
        int dorsal=0, anys=0; 
        float pes=0;
        boolean esMasculi=false, prova=false;
        
        Scanner entrada = new Scanner(System.in);
        
        int opcio;
        do {
        System.out.println("0. Sortir del programa");
            System.out.println("1. Introduir un nou jugador");
            System.out.println("2. Borrar un jugador");
            System.out.println("3. Modificar jugador");
            System.out.println("4. Llistar jugadors");
            opcio = entrada.nextInt();
            switch (opcio) {
                case 0:
                    
                    //sortir
                    break;
                case 1:
                   
                    //introduir metode per donar alta 1 jugador
                    break;
                case 2:
                   
                    //introduir un metode per borrar jugadors
                    break;
                case 3:
                    
                    //Modificar jugador
                    break;
                    
                case 4:
                    
                    //Llistar jugador
                    break;
               default:
                System.out.println("No has introduit cap numero correcte");
            } 
                
        
    }while (opcio != 0);   
        
} 
}