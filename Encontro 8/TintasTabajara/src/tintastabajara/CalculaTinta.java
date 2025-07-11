/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tintastabajara;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class CalculaTinta {
    double largura, altura, area, totalTinta;
    
    public void recebeMedidas() {
        largura = Double.parseDouble(JOptionPane.showInputDialog("Qual a largura (em metros) da sua parede?"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura (em metros) da sua parede?"));
    }
    
    public void calculaTintaNecessaria() {
        area = largura * altura;
        totalTinta = area / 2;        
    }
    
    public void exibeTintaNecessaria() {
        JOptionPane.showMessageDialog(null, String.format("""
                                            A sua parede tem %.2f m² de área, você vai precisar de %.2f litros de tinta!
                                            Para a sua sorte, a Tintas Tabajara contém uma enorme variedade de cores para sua obra/reforma
                                            Iremos entrar em contato!
                                            """, area, totalTinta));

        
    }
}
