/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import javax.swing.JOptionPane;

/**
 *
 * @author UIS
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        signo();
    }
    public static void multiplo() {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
        int r = n1%3;
        if (r==0){
            JOptionPane.showMessageDialog(null, "es un multiplo de 3");
        }else{
            JOptionPane.showInternalMessageDialog(null, "el numero no es un multipo de 3");
        }
        if (100 <= r && r <=200){
            JOptionPane.showMessageDialog(null, "el numero esta entre 100 y 200");
        }else {
            JOptionPane.showMessageDialog(null, "el numero no esta entre 100 y 200");
        }
        
        
    }
    public static void signo() {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese su mes de nacimiento (en numeros) "));
        switch (mes){
            case 1 :
                int dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia >=1 && dia <=19){
                    JOptionPane.showInternalMessageDialog(null, "su signo es capricornio");
                }else if (dia >=20 && dia <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es acuario");
                }
            case 2 :
                int dia2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia2 >=1 && dia2 <=18){
                    JOptionPane.showInternalMessageDialog(null, "su signo es acuario");
                }else if (dia2 >=19 && dia2 <=28){
                    JOptionPane.showInternalMessageDialog(null, "su signo es piscis");
                    
                }
            case 3 :
                int dia3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia3 >=1 && dia3 <=20){
                    JOptionPane.showInternalMessageDialog(null, "su signo es piscis");
                }else if (dia3 >=21 && dia3 <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es aries");   
                }
            case 4 :
                int dia4 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia4 >=1 && dia4 <=19){
                    JOptionPane.showInternalMessageDialog(null, "su signo es aries");
                }else if (dia4 >=20 && dia4 <=30){
                    JOptionPane.showInternalMessageDialog(null, "su signo es tauro");   
                }
            case 5 :
                int dia5 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia5 >=1 && dia5 <=20){
                    JOptionPane.showInternalMessageDialog(null, "su signo es tauro");
                }else if (dia5 >=21 && dia5 <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es geminis");   
                }
            case 6 :
                int dia6 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia6 >=1 && dia6 <=20){
                    JOptionPane.showInternalMessageDialog(null, "su signo es geminis");
                }else if (dia6 >=21 && dia6 <=30){
                    JOptionPane.showInternalMessageDialog(null, "su signo es cancer");   
                }
            case 7 :
                int dia7 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia7 >=1 && dia7 <=22){
                    JOptionPane.showInternalMessageDialog(null, "su signo es cancer");
                }else if (dia7 >=23 && dia7 <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es leo");   
                }
            case 8 :
                int dia8 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia8 >=1 && dia8 <=22){
                    JOptionPane.showInternalMessageDialog(null, "su signo es leo");
                }else if (dia8 >=23 && dia8 <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es geminis");   
                }
                    
              
                    
        
        
        
    }
        
     
        
    }
}
