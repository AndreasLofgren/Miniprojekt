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
public class Prisgruppe {

    private char prisgruppe;
    private int dagleje;
    private int kilometerpris;
    private int benzinpris;

    public Prisgruppe(char prisgruppe, int dagleje) {
        this.prisgruppe = prisgruppe;
        this.dagleje = dagleje;
    }

    public char getPrisgruppe() {
        return prisgruppe;
    }

    public void setPrisgruppe(char prisgruppe) {
        this.prisgruppe = prisgruppe;
    }

    public int getDagleje() {
        return dagleje;
    }

    public void setDagleje(int dagleje) {
        this.dagleje = dagleje;
    }

    public int getKilometerpris() {
        return kilometerpris;
    }

    public void setKilometerpris(int kilometerpris) {
        this.kilometerpris = kilometerpris;
    }

    public int getBenzinpris() {
        return benzinpris;
    }

    public void setBenzinpris(int benzinpris) {
        this.benzinpris = benzinpris;
    }

}
