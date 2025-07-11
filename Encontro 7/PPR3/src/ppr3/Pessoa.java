/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppr3;

/**
 *
 * @author Mateus
 */
import javax.swing.JOptionPane;
public class Pessoa {
    String nome, endereco;
    int idade;
    float peso, altura;   
    
    public void cadastraPessoa() {
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        endereco = JOptionPane.showInputDialog("Qual o seu endereço?");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso (Ex. 50.5)"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura (Ex. 1.75)"));       
    }
    
    public void mostraPessoa() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + 
                                            "\n Endereço: " + endereco + 
                                            "\n Idade: " + idade + 
                                            "\n Peso: " + peso + 
                                            "\n Altura: " + altura);
    }
}
