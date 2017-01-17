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
        String nom = null, posicio = null;
        int dorsal = 0, anys = 0;
        float pes = 0;
        boolean home = false, omplit = false, jugador = false;
        char esHome=' ', esJugador=' ', introduit, borrar;

        Scanner entrada = new Scanner(System.in);
        Scanner entText=new Scanner(System.in);

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
                    
                    if (!omplit) {
                        System.out.println("Introdueix el nom del jugador");
                        nom = entText.next();
                        System.out.println("Introdueix la seva posició");
                        posicio = entrada.next();
                        System.out.println("Introdueix el dorsal del jugador");
                        dorsal = entrada.nextInt();
                        System.out.println("Introdueix els anys del jugador");
                        anys = entrada.nextInt();
                        System.out.println("Introdueix el pes del jugador");
                        pes = entrada.nextFloat();
                        System.out.println("És home o dona?(H/D):");
                        do{
                           esHome = entrada.next().toUpperCase().charAt(0);         
                                                                                             
                          }while(esHome != 'H' && esHome != 'D');
                 home = esHome == 'H';     
                        System.out.println("Dades introduides correctament!");
                        omplit = true;
                        
                    } else {
                        System.out.println("Les dades ja han estat introduïdes, si en vols posar més l'hauràs de borrar primer.");
                        omplit=false;
                    }

                    //introduir metode per donar alta 1 jugador
                    break;
                    
                case 2:
                    
                    if (!omplit) {
                        System.out.println("No hi ha cap jugador per borrar, si el vols borrar l'hauràs d'introduïr primer");
                    }
                    
                    if (omplit)  {
                        

                        do {

                            System.out.println("Vols veure les dades del Jugador? (S/N)");
                            introduit = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (introduit != 's' && introduit != 'n' && introduit != 'S' && introduit != 'N');

                        if (introduit == 's' || introduit == 'S') {
                            System.out.println("Dades del Jugador: ");
                            System.out.println("Nom: " + nom);
                            System.out.println("Posicio: " + posicio);
                            System.out.println("Dorsal: " + dorsal);
                            System.out.println("Anys: " + anys);
                            System.out.println("Pes: " + pes);
                            System.out.println("Home: " + home);

                           
                        do {

                            System.out.println("Segur que el vols esborrar? (S/N)");
                            borrar = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (borrar != 's' && borrar != 'n' && borrar != 'S' && borrar != 'N');

                        if (borrar == 's' || borrar == 'S') {
                            omplit = false;

                            System.out.println("Dades del jugador borrades!");
                        }
                        }   
                        
                    }
                    

                    //introduir un metode per borrar jugadors
                    break;
                case 3:
                    do {

                            System.out.println("Vols veure les dades del Jugador? (S/N)");
                            introduit = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (introduit != 's' && introduit != 'n' && introduit != 'S' && introduit != 'N');

                        if (introduit == 's' || introduit == 'S') {
                            System.out.println("Dades del Jugador: ");
                            System.out.println("Nom: " + nom);
                            System.out.println("Posicio: " + posicio);
                            System.out.println("Dorsal: " + dorsal);
                            System.out.println("Anys: " + anys);
                            System.out.println("Pes: " + pes);
                            System.out.println("Home: " + home);
                            
                        }
                        
                    do {
                        System.out.println("Vols modificar el jugador(S/N):");
                        
                    }  while (introduit != 's' && introduit != 'n' && introduit != 'S' && introduit != 'N');  
                        
                       System.out.println("Aquest és el nom del jugador, escriu el nou nom" + nom);
                       nom = entText.next();
                       System.out.println("Aquesta és la posicio del jugador, escriu la nova posicio" + posicio);
                       posicio = entrada.next();
                       System.out.println("Aquest és el dorsal del jugador, escriu el nou dorsal" + dorsal);
                       dorsal = entrada.nextInt();
                       System.out.println("Aquests son els anys del jugador, escriu els nous anys" + anys);
                       anys = entrada.nextInt();
                       System.out.println("Aquest és el pes del jugador, escriu el nou pes" + pes);
                       pes = entrada.nextFloat();
                       
                       
                    
                    
                    
                    

                    //Modificar jugador
                    break;

                case 4:
                    do {

                            System.out.println("Vols veure les dades del Jugador? (S/N)");
                            introduit = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (introduit != 's' && introduit != 'n' && introduit != 'S' && introduit != 'N');

                        if (introduit == 's' || introduit == 'S') {
                            System.out.println("Dades del Jugador: ");
                            System.out.println("Nom: " + nom);
                            System.out.println("Posicio: " + posicio);
                            System.out.println("Dorsal: " + dorsal);
                            System.out.println("Anys: " + anys);
                            System.out.println("Pes: " + pes);
                            System.out.println("Home: " + home);
                            
                        }
           
                    
                    

                    //Llistar jugador
                    break;
                default:
                    System.out.println("No has introduit cap numero correcte");
            }

        } while (opcio != 0);

    }
}

