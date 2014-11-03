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

    private String prisgruppe;
    private int dagleje;
    private int kilometerpris;
    private int benzinpris;

    public Prisgruppe(String prisgruppe) {
        this.prisgruppe = prisgruppe;
        dagleje = 0;
        kilometerpris = 0;
        benzinpris = 0;
    }

    public String getPrisgruppe() {
        return prisgruppe;
    }

    public void setPrisgruppe(String prisgruppe) {
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
