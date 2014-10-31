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
public class Kunde {

    private int koerekortnummer;
    private String navn;
    private String tlf;
    private String cpr;

    public Kunde() {
        koerekortnummer = 0;
        navn = "";
        tlf = "";
        cpr = "";
    }

    public int getKoerekortnummer() {
        return koerekortnummer;
    }

    public void setKoerekortnummer(int koerekortnummer) {
        this.koerekortnummer = koerekortnummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

}
