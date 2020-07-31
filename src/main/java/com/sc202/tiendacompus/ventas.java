
package com.sc202.tiendacompus;
public class ventas {
    public String productos;
    public String marca;
    public int precio;
    public String capacidad;
    public String proposito;
    public String tipo;
    public String accesorio;

public ventas(String productos, String marca, String capacidad, String proposito, String tipo, String accesorio, int precio){
   this.productos = productos;
   this.marca = marca;
   this.capacidad = capacidad;
   this.proposito = proposito;
   this.tipo = tipo;
   this.accesorio = accesorio;
   this.precio = precio;
}
}
