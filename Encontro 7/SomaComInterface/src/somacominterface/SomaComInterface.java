/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somacominterface;

/**
 *
 * @author Mateus
 */
import javax.swing.JOptionPane;
public class SomaComInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int primeiroNumero, segundoNumero, resultado;
        
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        resultado = primeiroNumero + segundoNumero;
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "\nO resultado é: " + resultado);
        
    }
    
}
