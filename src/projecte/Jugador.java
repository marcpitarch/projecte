/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

/**
 *
 * @author marc
 */
public class Jugador {
    String nom = null, posicio = null;
        int dorsal = 0, anys = 0;
        float pes = 0;
        boolean home = false, omplit = false, jugador = false;
        char esHome=' ', esJugador=' ', introduit, borrar;

    @Override
    public String toString() {
        return "Jugador{" + "nom=" + nom + ", posicio=" + posicio + ", dorsal=" + dorsal + ", anys=" + anys + ", pes=" + pes + ", home=" + home + ", esHome=" + esHome + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String posicio) {
        this.posicio = posicio;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getAnys() {
        return anys;
    }

    public void setAnys(int anys) {
        this.anys = anys;
    }

    public float getPes() {
        return pes;
    }

    public void setPes(float pes) {
        this.pes = pes;
    }

    public boolean isHome() {
        return home;
    }

    public void setHome(boolean home) {
        this.home = home;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }

    public boolean isJugador() {
        return jugador;
    }

    public void setJugador(boolean jugador) {
        this.jugador = jugador;
    }

    public char getEsHome() {
        return esHome;
    }

    public void setEsHome(char esHome) {
        this.esHome = esHome;
    }

    public char getEsJugador() {
        return esJugador;
    }

    public void setEsJugador(char esJugador) {
        this.esJugador = esJugador;
    }

    public char getIntroduit() {
        return introduit;
    }

    public void setIntroduit(char introduit) {
        this.introduit = introduit;
    }

    public char getBorrar() {
        return borrar;
    }

    public void setBorrar(char borrar) {
        this.borrar = borrar;
    }       
}

