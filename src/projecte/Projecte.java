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

    private static final int MAX_JUGADOR = 2;
    private static Jugador[] array = new Jugador[MAX_JUGADOR];
    private static int opcio;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        inicialitzarVariables();
        do {
            demanarOpcio();
            tractarOpcio();
        } while (!opcioFinal());

    }

    public static void inicialitzarVariables() {
        

        for (int i = 0; i < array.length; i++) {
            array[i] = new Jugador();
            array[i].setOmplit(false);
        }
    }

    public static void demanarOpcio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("0. Sortir del programa");
        System.out.println("1. Introduir un nou jugador");
        System.out.println("2. Borrar un jugador");
        System.out.println("3. Modificar jugador");
        System.out.println("4. Llistar jugadors");
        System.out.println("5. Recuperar jugador borrat");
        
        opcio = entrada.nextInt();

    }

    public static void tractarOpcio() {

        switch (opcio) {
            case 0:
                System.out.println("Adéu!!");
                break;
            case 1:
                introduirJugador();
                break;
            case 2:
                modificarJugador();
                break;
            case 3:
                borrarJugador();
                break;
            case 4:
                llistarJugador();
                break;
            case 5:
                recuperarJugador();
                break;
            default:
                System.out.println("\nOpció incorrecta!!");
        }

    }

    public static boolean opcioFinal() {
        return opcio == 0;
    }

    public static void introduirJugador() {
        Scanner ent = new Scanner(System.in);

        int i;
        for (i = 0; i < array.length && array[i].isOmplit(); i++);

        if (i < array.length) {
            System.out.println("Introdueix el nom del jugador");
            array[i].setNom(ent.skip("[\r\n]*").nextLine());
            System.out.println("Introdueix la seva posició");
            array[i].setPosicio(ent.skip("[\r\n]*").nextLine());
            System.out.println("Introdueix el dorsal del jugador");
            array[i].setDorsal(ent.skip("[\r\n]*").nextInt());
            System.out.println("Introdueix els anys del jugador");
            array[i].setAnys(ent.skip("[\r\n]*").nextInt());
            System.out.println("Introdueix el pes del jugador");
            array[i].setPes((float) ent.skip("[\r\n]*").nextDouble());

            char esHome;
            do {
                System.out.println("És home o dona?(H/D):");
                esHome = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                //per tant només haurem de tractar les lletres majúscules
            } while (esHome != 'H' && esHome != 'D');
            array[i].setHome(esHome == 'H');     //si esHome conté la 'H' home serà true i sinó false. Fa el mateix que un if_else però és molt més curt
            array[i].setOmplit(true);
        } else {
            System.out.println("\nLes dades ja han estat introduïdes, si en vols posar més l'hauràs de borrar primer.");
        }
    }

    public static void modificarJugador() {
        Scanner ent = new Scanner(System.in);
        char siNo = 'N';
        int cont = 1, i;
        for (i = 0; i < array.length && siNo != 'S' && siNo != 'F'; i++) {
            if (array[i].isOmplit()) {
                System.out.format("\nJugador %d:\n", cont++);
                System.out.println(array[i].toString());
                do {
                    System.out.println("\nVols modificar el jugador(S/N) o finalitzar la cerca (F)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
            }
            if (siNo == 'S') {
                break;
            }
        }

        if (siNo == 'S') {

            System.out.println("\nNom: " + array[i].getNom());
            do {
                System.out.println("\nVols modificar el nom?(S/N):");
                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nou nom: ");
                array[i].setNom(ent.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nDorsal: " + array[i].getDorsal());
            do {
                System.out.println("\nVols modificar el dorsal?(S/N):");
                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nou dorsal: ");
                array[i].setDorsal(ent.skip("[\r\n]*").nextInt());
            }

            System.out.println("\nAnys del jugador: " + array[i].getAnys());
            do {
                System.out.println("\nVols modificar els anys del jugador?(S/N):");
                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nous anys del jugador: ");
                array[i].setAnys(ent.skip("[\r\n]*").nextInt());
            }

            System.out.println("\nPes del jugador: " + array[i].getPes());
            do {
                System.out.println("\nVols modificar el pes?(S/N):");
                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nou pes: ");
                array[i].setPes(ent.skip("[\r\n]*").nextInt());
            }

            if (array[i].isHome()) {
                System.out.println("\nÉs home");
            } else {
                System.out.println("\nÉs dona");
            }
            do {
                System.out.println("\nVols modificar el gènere?(S/N):");
                siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                char esHome;
                do {
                    System.out.println("És home o dona?(H/D):");
                    esHome = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esHome != 'H' && esHome != 'D');
                array[i].setHome(esHome == 'H');     //si esHome conté la 'H' home serà true i sinó false. Fa el mateix que un if_else però és molt més curt
                System.out.print("Nou gènere: ");
                if (array[i].isHome()) {
                    System.out.println("home");
                } else {
                    System.out.println("dona");
                }
            }

            System.out.println("Jugador modificat correctament.");

        } else {
            System.out.println("\nNo hi ha jugadors per modificar, o no n'has triat cap per modificar.");
        }

    }

    public static void borrarJugador() {

        Jugador p = null;
        Scanner ent = new Scanner(System.in);
        char siNo = 'N';
        int i;
        for (i = 0; i < array.length && siNo != 'F'; i++) {
            p = array[i];
            if (p.isOmplit()) {
                System.out.println(p);
                do {
                    System.out.println("\nVols borrar el jugador(S/N) o finalitzar la cerca (F)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
            }
            if (siNo == 'S') {
                break;
            }
        }

        if (siNo == 'S') {
            p.setOmplit(false);
            System.out.println("Jugador borrat correctament.");

        } else {
            System.out.println("\nNo s'ha borrat cap jugador.");
        }

    }

    public static void llistarJugador() {

        Scanner ent = new Scanner(System.in);

        boolean algun = false;
        char siNo = 'S';
        int i;
        for (i = 0; i < array.length; i++) {
            Jugador p = array[i];
            if (p.isOmplit()) {
                algun = true;
                System.out.println(p);
                do {
                    System.out.println("\nVols vore més jugadors(S/N)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N');
            }
            if (siNo == 'N') {
                break;
            }
        }
        if (!algun) {
            System.out.println("\nNo hi ha jugadors per mostrar, si vols, primer crea'n.");
        }
    }

    public static void recuperarJugador() {
        Scanner ent = new Scanner(System.in);
        //Primer recorrem l'array buscant caselles buides i preguntant quina volem recuperar
        char siNo = 'N';
        int cont = 0, i;
        for (i = 0; i < array.length && siNo != 'S' && siNo != 'F'; i++) {
            if (!array[i].isOmplit()) {
                System.out.format("\nJugador %d:\n", ++cont);
                System.out.println(array[i].toString());
                do {
                    System.out.println("\nVols recuperar el jugador(S/N) o finalitzar la cerca (F)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
            }
            if (siNo == 'S') {
                break;
            }
        }
        //Si l'usuari ha contestat que sí és que ha triat un pilot per modificar    
        if (siNo == 'S') {
            array[i].setOmplit(true);
            System.out.println("Jugador recuperat correctament.");
        } else if (cont == 0) {
            System.out.println("No hi ha jugadors per recuperat.");
        } else {
            System.out.println("Jugador no recuperat.");
        }

    }
}
