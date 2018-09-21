/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;
import becker.robots.*;
/**
 *
 * @author Hernan Quiroga
 */
public class Estante {
    private Thing thing;
    private Caja[] cajas;

    public Estante(Thing thing, Caja[] cajas) {
        this.thing = thing;
        this.cajas = cajas;
    }

    public Thing getThing() {
        return thing;
    }

    public void setThing(Thing thing) {
        this.thing = thing;
    }

    public Caja[] getCajas() {
        return cajas;
    }

    public void setCajas(Caja[] cajas) {
        this.cajas = cajas;
    }
}
