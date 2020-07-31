
package com.sc202.tiendacompus;

import javax.swing.JOptionPane;

public class TiendaCompus {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos desea comprar"));
        ventas[] arreglo;
        arreglo = new ventas[cantidad];
        
        JOptionPane.showMessageDialog(null, "Por favor seleccione una opcion");
        
        do{
            String opcion = JOptionPane.showInputDialog(null, "a. Computadoras" + "b. Accesorios" + "c. Partes" + "d. He terminado de comprar");
            
            switch(opcion){
                case "a":
                    for(int i = 0; i < arreglo.length; i++){
                        JOptionPane.showMessageDialog(null, "Te solicitaremos algunos datos para mejorar tu busqueda");
                        String marca = JOptionPane.showInputDialog("¿Que marca de computadora te gustaria");
                        String capacidad = JOptionPane.showInputDialog("¿Que capacidad de memoria quieres?");
                        String tipo = JOptionPane.showInputDialog("La quieres tipo escritorio o laptop");
                        String proposito = JOptionPane.showInputDialog("¿Para que ocupas la computadora");
                        
                        
                        if(marca == "lenovo"){
                            
                        }
                    }
                    
                    break;
            }
        }while("opcion".equals("d"));
    }
    
}
