/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author Hernan Quiroga
 */
public class Pedido {
    private String cliente;
    private int cantidad;
    private Producto[] producto;

    public Pedido(String cliente, int cantidad, Producto[] producto) {
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }
    
    
}
