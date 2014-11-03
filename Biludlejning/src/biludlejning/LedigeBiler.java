/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejning;

/**
 *
 * @author Andreas
 */
public class LedigeBiler {
    private Bil bil;
    private Double motorstr;
    private int registreringsnummer;
    private int kilometertaeller;

    public LedigeBiler(Double motorstr, int registreringsnummer) {
        this.motorstr = motorstr;
        this.registreringsnummer = registreringsnummer;
        kilometertaeller = 0;
        bil = new Bil(bil.getPrisgruppe(), bil.getBilmaerke(), bil.getModel());
    }

    public int getKilometertaeller() {
        return kilometertaeller;
    }

    public void setKilometertaeller(int kilometertaeller) {
        this.kilometertaeller = kilometertaeller;
    }

    public Double getMotorstr() {
        return motorstr;
    }

    public int getRegistreringsnummer() {
        return registreringsnummer;
    }    
}
