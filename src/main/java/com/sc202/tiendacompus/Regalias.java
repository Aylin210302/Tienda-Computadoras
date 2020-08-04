
package com.sc202.tiendacompus;

import javax.swing.JOptionPane;

public class Regalias {
    public void regalia1(){
        JOptionPane.showMessageDialog(null, "Por la compra de tus computadoras marca lenovo llevate gratis un mouse y una funda para tu nueva laptop");
        
    }
    public void regalia2(){
        JOptionPane.showMessageDialog(null, "Por la compra de tu PC de gama media puedes cambiar tu ssd por una de 480GB");
        String decision = JOptionPane.showInputDialog("¿Quieres aprovechar la regalia? Si/No");
        if(decision == "Si"){
            int preNormal = 35000;
            int preOferta = 17500;
            JOptionPane.showMessageDialog(null, "Tu SSD te queda en " + preOferta);
        }else{
            JOptionPane.showMessageDialog(null, "No hay inconveniente el precio de tu almacenamiento queda en el primer apartado");
        }
                
    }
    public void regalia3(){
        JOptionPane.showMessageDialog(null, "Como tu PC va enfocada a gaming te agregamos un monitor ASSUS de 27 pulgadas con un 25% de descuento");
        String opcion = JOptionPane.showInputDialog("¿Quieres aprovechar la regalia? Si/No");
        if(opcion == "Si"){
            int preNormal = 339000;
            int preOferta = 25450;
            JOptionPane.showMessageDialog(null, "Tu monitor te queda en " + preOferta);
        }else{
            JOptionPane.showMessageDialog(null, "´Puedes seguir con la informacion del primer panel");  
        }
    }
    public void regalia4(){
        JOptionPane.showMessageDialog(null, "En este caso tu PC esta enfocada a edicion o animacion asi que te agregamos un procesador AMD Ryzen ThreadRipper 1920X con un 50%");
        String decision = JOptionPane.showInputDialog("¿Quieres aprovechar la regalia? Si/No");
        if(decision == "Si"){
            int preNormal = 294640;
            int preOferta = 147000;
            JOptionPane.showMessageDialog(null, "Tu nuevo procesador queda en " + preOferta);
        }else{
            JOptionPane.showMessageDialog(null, "Puedes seguir con tu compra");
        }
    }
    public void regalia5(){
        JOptionPane.showMessageDialog(null, "El enfoque de tu nueva PC sera de animacion 3D para eso te traemos un opcion que te puede servir si esta en tu presupuesto");
        JOptionPane.showMessageDialog(null, "Un monitor DELL U-series de 38 pulgadas de color negro");
        String opcion = JOptionPane.showInputDialog( "¿Deseas aprovechar y saber mas acerca de esta regalia de un 25% de descuento? Si/No");
        if(opcion == "Si"){
            String preNormal = "107499$";
            String preOferta = "2688475$";
            JOptionPane.showMessageDialog(null, "Tu monitor curvo queda en " + preOferta);
        }else{
             JOptionPane.showMessageDialog(null, "Si no desea usar la regalia continue con su compra");
        }
           
    }
}
