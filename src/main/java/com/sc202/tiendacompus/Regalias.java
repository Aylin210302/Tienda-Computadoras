
package com.sc202.tiendacompus;
public class Regalias {
    public String rifa;
    public String descuento;

    public String getRifa() {
        return rifa;
    }

    public void setRifa(String rifa) {
        this.rifa = rifa;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        
        
        this.descuento = descuento;
    }
public Regalias(String rifa, String descuento){
    this.descuento = descuento;
    this.rifa = rifa;
}
}
