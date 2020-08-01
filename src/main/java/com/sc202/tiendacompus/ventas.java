
package com.sc202.tiendacompus;

import javax.swing.JOptionPane;

public class ventas {
public void compras(){
  int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos desea comprar"));
        ventas[] arreglo;
        arreglo = new ventas[cantidad];
        
        JOptionPane.showMessageDialog(null, "Por favor seleccione una opcion");
        
        do{
            for(int i = 0; i < arreglo.length; i++){
            String opcion = JOptionPane.showInputDialog(null, "a. LAPTOPS" + "b. Accesorios" + "c. Arma la tuya" + "d. He terminado de comprar");
            
            
            switch(opcion){
                case "a":
                        JOptionPane.showMessageDialog(null, "Te solicitaremos algunos datos para mejorar tu busqueda");
                        String capacidad = JOptionPane.showInputDialog("¿Que capacidad de memoria quieres? alta o media");
                        String proposito = JOptionPane.showInputDialog("¿Para que ocupas la computadora? trabajo o gaming");
                        JOptionPane.showMessageDialog(null, "Estamos buscando una buena opcion para ti, esto tomara unos minutos");
                        JOptionPane.showMessageDialog(null, "Hemos encontrado varias opciones para ti");
                        if(capacidad == "media" || proposito == "trabajo"){
                            String opciones = JOptionPane.showInputDialog("Tenemos 3 opciones " + " a. HP de 4GB en 359.000" + " b. Lenovo de 8GB en 384200" + " c. Portatil DELL de 4GB en 378000 ");
                            switch(opciones){
                                case "a":
                                    String marca = "HP";
                                    String RAM = "4GB";
                                    int precio = 359000;
                                    JOptionPane.showMessageDialog(null,marca + RAM + precio);
                                    break;
                                case "b":
                                    String modelo = "HP";
                                    String RAM1 = "8GB";
                                    int monto = 384200;
                                    JOptionPane.showMessageDialog(null, modelo + RAM1 + monto);
                                    break;
                                case "c":
                                    String tipo = "DELL";
                                    String RAM2 = "4GB";
                                    int valor = 378000;
                                    JOptionPane.showMessageDialog(null, tipo + RAM2 + valor);
                                    break;
                                    
                            }//fin de switch
                        }else if(capacidad == "alta" || proposito == "gaming"){
                            String variedad = JOptionPane.showInputDialog("Tenemos 3 opciones que te pueden ayudar " + " a. XPG XENIA de 32GB en 1101750 colones " + " b. Lenovo de 12GB en 624890 colones " + " c. Levono de 8GB en 706250 colones");
                            switch(variedad){
                                case "a":
                                  String modelo1 = "XPG XENIA";
                                  String memoria1 = "32GB";
                                  int precio1 = 1101750;
                                  JOptionPane.showMessageDialog(null, modelo1 + memoria1 + precio1);
                                  
                                  break;
                                case "b":
                                  String modelo2 = "Lenovo";
                                  String memoria2 = "12GB";
                                  int precio2 = 624890;
                                  JOptionPane.showMessageDialog(null, modelo2 + memoria2 + precio2);
                                  break;
                                case "c":
                                  String modelo3 = "Lenovo";
                                  String memoria3 = "8GB";
                                  int precio3 = 706250;
                                  JOptionPane.showMessageDialog(null, modelo3 + memoria3 + precio3);
                                  break;
                            }//fin del switch
                        }//fin del else
                        
                        break;
                case "b":
                    String accesorio = JOptionPane.showInputDialog("¿Que tipo de accesorio buscas?" + "a. mouse" + "b. Fundas" + "c. teclados" + "d. audifonos ");
                    switch(accesorio){
                        case "a":
                            String tipo = JOptionPane.showInputDialog("¿Lo desea inalambrico o alambrico?");
                            if (tipo=="inalambrico"){
                                JOptionPane.showMessageDialog(null, "los mouses inalambricos cuestan 9000 colones");
                                int precio = 9000;
                            }else{
                                JOptionPane.showMessageDialog(null, "Los maouses alambricos tienen un costo de 5000 colones");
                                int precio = 5000;
                            }
                            break;
                        case "b":
                            JOptionPane.showMessageDialog(null, "Nuestras fundas para computadora tiene un costo de 10000 para cualquier modelo");
                            int precio = 10000;
                            break;
                        case "c":
                            String modelo = JOptionPane.showInputDialog("Tenemos teclados negro o blanco con luces de colores");
                            if (modelo == "negro"){
                                JOptionPane.showMessageDialog(null, "Nuesttros teclados negros tienen un costo de 25000 colones");
                                int valor = 25000;
                            }else{
                                JOptionPane.showMessageDialog(null, "Nuestros teclados blanco con luces tienen un costo de 35000");
                                int valor = 35000;
                            }
                            break;
                        case "d":
                            String audifonos = JOptionPane.showInputDialog("Tenemos audifonos inalambricos o alambricos");
                            if (audifonos == "inalambricos"){
                                JOptionPane.showMessageDialog(null, "Todos nuestros audifonos inalambricos tienen un monto de 15000");
                                int monto = 15000;
                            }else{
                                JOptionPane.showMessageDialog(null, "Nuestros audifinos alambricos valen 10000");
                                int monto = 10000;
                            }
                    }//fin del switch accesorio
                    break;
                case "c":
                   String armala = JOptionPane.showInputDialog("¿Que tipo andas buscando? " + " a. Uso domestico " + " b. Gama Media " + " c. Gama alta" );
                switch(armala){
                    case "a":
                        String monitor1 = "Acer 21.5";
                        int preMon1 = 80000;
                        String almacenamiento1 = "SSD de 128GB";
                        int preAlm1 = 20000;
                        String procesador1 = "Intel pentium";
                        int prePro1 = 40000;
                        String RAM1 = "SODIMM de 4GB";
                        int preRAM1 = 28476;
                        int total1 = (preMon1 + preAlm1 + preRAM1);
                        JOptionPane.showMessageDialog(null,"En el primer caso tendria un total de: " +  total1);
                        break;
                    case "b":
                        String procesador2 = "Intel core i3 8TH GEN";
                        int prePro2 = 55000;
                        String RAM2 = "SODIMM DE 8GB";
                        int preRAM2 = 33000;
                        String almacenamiento2 = "SSD de 240GB";
                        int preAlm2 = 40000;
                        String discoduro2 = "500GB";
                        int preDisc2 = 39500;
                        int total2 = prePro2 + preRAM2 + preAlm2 + preDisc2;
                        JOptionPane.showMessageDialog(null, "Esta opcion tiene un costo de: " + total2);
                        break;
                    case "c":
                        String procesador3 = "Intel core i7 10TH GEN";
                        int prePro3 = 245000;
                        String RAM3 = "SODIMM DE 16GB";
                        int preRAM3 = 39900;
                        String almacenamiento3 = "SSD DE 240GB";
                        int preAlm3 = 40000;
                        String discoduro3 = "1TB";
                        int preDisc3 = 46900;
                        int total3 = prePro3 + preRAM3 + preAlm3 + preDisc3;
                        JOptionPane.showMessageDialog(null, "Esta ultima opcion mas avanzada tiene un costo de; " + total3);
                        
                        break;
                        
                        
                        
                }//fin del switch armala
                
                break; 
        }//fin del swicth opcion

        }//fin del for
            
        }while("opcion".equals("d"));
}//fin de ventas
}//fin de la clase
