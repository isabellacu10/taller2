/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import com.sun.source.tree.SwitchTree;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fecha();
        
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
                }break;
            case 2 :
                int dia2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia2 >=1 && dia2 <=18){
                    JOptionPane.showInternalMessageDialog(null, "su signo es acuario");
                }else if (dia2 >=19 && dia2 <=28){
                    JOptionPane.showInternalMessageDialog(null, "su signo es piscis");
                    
                }break;
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
                }break;
            case 5 :
                int dia5 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia5 >=1 && dia5 <=20){
                    JOptionPane.showInternalMessageDialog(null, "su signo es tauro");
                }else if (dia5 >=21 && dia5 <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es geminis");   
                }break;
            case 6 :
                int dia6 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia6 >=1 && dia6 <=20){
                    JOptionPane.showInternalMessageDialog(null, "su signo es geminis");
                }else if (dia6 >=21 && dia6 <=30){
                    JOptionPane.showInternalMessageDialog(null, "su signo es cancer");   
                }break;
            case 7 :
                int dia7 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia7 >=1 && dia7 <=22){
                    JOptionPane.showInternalMessageDialog(null, "su signo es cancer");
                }else if (dia7 >=23 && dia7 <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es leo");   
                }break;
            case 8 :
                int dia8 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia8 >=1 && dia8 <=22){
                    JOptionPane.showInternalMessageDialog(null, "su signo es leo");
                }else if (dia8 >=23 && dia8 <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es virgo");   
                }break;
            case 9 :
                int dia9 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia9 >=1 && dia9 <=22){
                    JOptionPane.showInternalMessageDialog(null, "su signo es virgo");
                }else if (dia9 >=23 && dia9 <=30){
                    JOptionPane.showInternalMessageDialog(null, "su signo es libra");   
                }break;
            case 10 :
                int dia10 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia10 >=1 && dia10 <=22){
                    JOptionPane.showInternalMessageDialog(null, "su signo es libra");
                }else if (dia10 >=23 && dia10 <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es escorpio");   
                }break;
            case 11 :
                int dia11 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia11 >=1 && dia11 <=21){
                    JOptionPane.showInternalMessageDialog(null, "su signo es escorpio");
                }else if (dia11 >=22 && dia11 <=30){
                    JOptionPane.showInternalMessageDialog(null, "su signo es sagitario");   
                }break;
            case 12 :
                int dia12 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia del mes"));
                if (dia12 >=1 && dia12 <=21){
                    JOptionPane.showInternalMessageDialog(null, "su signo es sagitario");
                }else if (dia12 >=22 && dia12 <=31){
                    JOptionPane.showInternalMessageDialog(null, "su signo es capricornio");   
                }break;              
        
        
        
    }
           
    }
    public static void descuentos() {
        int n1 =Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del producto"));
        int n2 =Integer.parseInt(JOptionPane.showInputDialog("ingrese el porcentaje de descuento"));
        int valor = n1 - (n1 * n2 / 100);
        JOptionPane.showMessageDialog(null, "el valor a pagar es de : "+valor);
    }
    public static void numeros() {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        if (n1 >n2 && n1>n3){
            JOptionPane.showInternalMessageDialog(null, "el numero "+n1+" es el mayor de los numeros");
        }else if (n2>n1 && n2 >n3){
            JOptionPane.showInternalMessageDialog(null, "el numero "+n2+" es el mayor de los numeros");
        }else if (n3>n1 && n3>n2){
            JOptionPane.showInternalMessageDialog(null, "el numero "+n3+" es el mayor de los numeros");
        }

        if (n1 > n2 && n1 > n3 && n2 > n3){
            JOptionPane.showInternalMessageDialog(null, "el orden es: "+n3+" "+n2+" "+n1);
        }else if (n1 > n2 && n1 > n3 && n2 < n3){
            JOptionPane.showInternalMessageDialog(null, "el orden es: "+n2+" "+n3+" "+n1);
        }else if (n2 > n1 && n2 > n3 && n1 > n3){
            JOptionPane.showInternalMessageDialog(null, "el orden es: "+n3+" "+n1+" "+n2);
        }else if (n2 > n1 && n2 > n3 && n1 < n3){
            JOptionPane.showInternalMessageDialog(null, "el orden es: "+n1+" "+n3+" "+n2);
        }else if (n3 > n1 && n3 > n2 && n1 > n2){
            JOptionPane.showInternalMessageDialog(null, "el orden es: "+n2+" "+n1+" "+n3);
        }else if (n3 > n1 && n3 > n2 && n1 < n3){
            JOptionPane.showInternalMessageDialog(null, "el orden es: "+n1+" "+n2+" "+n3);
        }
    }
    public static void fecha() {
    int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
    int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
    int año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

    switch (mes) {

        case 1:
            if (dia < 31) {dia++ ;
            } else {dia = 1 ; mes = 2;
            }break;

        case 2:
            if (dia < 28) { dia++ ;
            } else { dia = 1 ; mes = 3 ;
            }break;

        case 3:
            if (dia < 31) { dia++ ;
            } else {dia = 1 ; mes = 4 ;
            }break;
            
        case 4:
            if (dia < 30) {dia++ ;
            } else {dia = 1 ; mes = 5 ;
            }break;

        case 5: 
            if (dia < 31) { dia++ ;
            } else { dia = 1 ; mes = 6 ;
            }break;

        case 6: 
            if (dia < 30) { dia++ ;
            } else {dia = 1 ; mes = 7 ;
            }break;

        case 7: 
            if (dia < 31) { dia++ ;
            } else { dia = 1 ; mes = 8 ;
            }break;
    
        case 8: 
            if (dia < 31) {dia++ ;
            } else {dia = 1 ; mes = 9 ;
            }break;
           
        case 9: 
            if (dia < 30) { dia++ ;
            } else { dia = 1 ; mes = 10 ;
            }break;

        case 10: 
            if (dia < 31) {dia++ ;
            } else { dia = 1 ; mes = 11 ;
            }break;
            
        case 11: 
            if (dia < 30) { dia++ ;
            } else { dia = 1 ; mes = 12 ;
            }break;
            
        case 12: 
            if (dia < 31) { dia++ ;
            } else { dia = 1 ; mes = 1; año++ ;
            }break;
    }

    JOptionPane.showMessageDialog(null, "La fecha siguiente es: " + dia + "/" + mes + "/" + año);
    }
    
}
    
