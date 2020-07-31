
package com.sc202.tiendacompus;

import javax.swing.JOptionPane;

public class TiendaCompus {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos desea comprar"));
        ventas[] arreglo;
        arreglo = new ventas[cantidad];
        
        JOptionPane.showMessageDialog(null, "Por favor seleccione una opcion");
        
        do{
            for(int i = 0; i < arreglo.length; i++){
            String opcion = JOptionPane.showInputDialog(null, "a. Computadoras" + "b. Accesorios" + "c. Partes" + "d. He terminado de comprar");
            
            switch(opcion){
                case "a":
                        JOptionPane.showMessageDialog(null, "Te solicitaremos algunos datos para mejorar tu busqueda");
                        String marca = JOptionPane.showInputDialog("¿Que marca de computadora te gustaria");
                        String capacidad = JOptionPane.showInputDialog("¿Que capacidad de memoria quieres? alta, baja o media");
                        String proposito = JOptionPane.showInputDialog("¿Para que ocupas la computadora");
                        JOptionPane.showMessageDialog(null, "Estamos buscando una buena opcion para ti, esto tomara unos minutos");
             
                        if(marca == "lenovo" || capacidad == "alta" || proposito == "tecnico"){
                            JOptionPane.showMessageDialog(null, "Tenemos varias opciones para ti");
                        }
                        
                    
                    break;
                case "b":
                    String accesorio = JOptionPane.showInputDialog("¿Que tipo de accesorio buscas?");
                    if(accesorio == "mouse"){
                       String tipo = JOptionPane.showInputDialog("lo bucas inalambrico o alambrico");
                        if(tipo == "inalambrico"){
                            JOptionPane.showMessageDialog(null, "Todos lo mouse inalambrico valen 9000 colones");
                            int precio = 90000;
                        } else if(tipo == "alambrico"){
                            JOptionPane.showMessageDialog(null, "Nuestros mouse alambricos tienen un costo de 5000 colones");
                            int precio = 5000;
                        }
                    }else if (accesorio == "Fundas"){
                        JOptionPane.showMessageDialog(null, "Tenemos fundas para computadora a 10000 colones");
                        int precio = 10000;
                    }
            }
            }
        }while("opcion".equals("d"));
    }
    
}
