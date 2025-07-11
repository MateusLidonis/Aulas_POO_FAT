/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppr4;

/**
 *
 * @author Mateus
 */
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
public class Equacao {
    float n1, n2, n3, n4, n5, n6, resultado;
    
    public void solicitaNumeros() {
        JOptionPane.showMessageDialog(null, """
                                            Olá, seja bem vindo à calculadora de expressões númericas
                                            A expressão que iremos resolver é: X = n1+n2*n3/(n4-n5*n6) 
                                            Preparado?                           """);
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("X = n1+n2*n3/(n4-n5*n6)"+"\nDigite n1: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("X = "+n1+"+n2*n3/(n4-n5*n6)"+"\nDigite n2: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("X = "+n1+"+"+n2+"*n3/(n4-n5*n6)"+"\nDigite n3: "));
        n4 = Float.parseFloat(JOptionPane.showInputDialog("X = "+n1+"+"+n2+"*"+n3+"/(n4-n5*n6)"+"\nDigite n4: "));
        n5 = Float.parseFloat(JOptionPane.showInputDialog("X = "+n1+"+"+n2+"*"+n3+"/("+n4+"-n5*n6)"+"\nDigite n5: "));
        n6 = Float.parseFloat(JOptionPane.showInputDialog("X = "+n1+"+"+n2+"*"+n3+"/("+n4+"-"+n5+"*n6)"+"\nDigite n6: "));
        JOptionPane.showMessageDialog(null,"A expressão inserida foi: " + "X = "+n1+"+"+n2+"*"+n3+"/("+n4+"-"+n5+"*"+n6+")");
        
    }
    
    public void realizaCalculo() {
        resultado = n1+n2*n3/(n4-n5*n6);
    }
    
    public void exibeResultado() {
        JOptionPane.showMessageDialog(null, "Seu resultado é: \n" + resultado);
    }
}
