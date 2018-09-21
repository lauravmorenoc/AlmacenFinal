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
public class Caja {
    private Producto[] productos;

    public Caja(Producto[] productos) {
        this.productos = productos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    
}
