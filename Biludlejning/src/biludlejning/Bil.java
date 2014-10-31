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
public class Bil {

    private Prisgruppe prisgruppe;
    private String bilmaerke;
    private String model;

    public Bil(Prisgruppe prisgruppe, String bilmaerke, String model) {
        this.prisgruppe = prisgruppe;
        this.bilmaerke = bilmaerke;
        this.model = model;
    }

    public Prisgruppe getPrisgruppe() {
        return prisgruppe;
    }

    public String getBilmaerke() {
        return bilmaerke;
    }

    public String getModel() {
        return model;
    }

}
