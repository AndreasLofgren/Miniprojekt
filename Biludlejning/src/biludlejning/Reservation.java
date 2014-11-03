/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejning;

import java.util.ArrayList;

/**
 *
 * @author Andreas
 */
public class Reservation {

    private Kunde kunde;
    private int kontraktnummer;
    private int startdato;
    private int slutdato;

    public Reservation(int startdato, int slutdato) {
        this.startdato = startdato;
        this.slutdato = slutdato;
        kunde = new Kunde();
        kontraktnummer = 0;
    }

    public int getStartdato() {
        return startdato;
    }

    public int getSlutdato() {
        return slutdato;
    }

    public int getKontraktnummer() {
        return kontraktnummer;
    }
    
   /* public void findBiler(int dato) {
        ArrayList<LedigeBiler> biler = new ArrayList<>();
        if (slutdato >= dato) {
            
        }
    }*/
}