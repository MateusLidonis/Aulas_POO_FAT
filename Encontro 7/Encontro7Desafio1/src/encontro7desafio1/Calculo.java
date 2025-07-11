/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encontro7desafio1;

/**
 *
 * @author Mateus
 */
import javax.swing.JOptionPane;
public class Calculo {
    float custoFabrica, percentualDistribuidor = 28.0f, imposto = 45.0f, custoFinal;
    
    public void recebeCusto() {
        custoFabrica = Float.parseFloat(JOptionPane.showInputDialog("Qual é o custo de fábrica do carro?"));
    }
    
    public void calculaCustoFinal() {
        custoFinal = custoFabrica * (1 + percentualDistribuidor/100) * (1 + imposto/100);
        JOptionPane.showMessageDialog(null, "O custo final do carro ao cliente é de R$" + custoFinal);
    }
    
}
