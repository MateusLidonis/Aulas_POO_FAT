/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encontro7desafio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Calculo {
    float salario, comissao,valorTotalVendas, porcentagemVenda = 5f, salarioFinal;
    int carrosVendidos;
    
    public void recebeDados() {
        carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros o funcionário vendeu?"));
        valorTotalVendas = Float.parseFloat(JOptionPane.showInputDialog("Qual é o valor total de vendas?"));
        salario = Float.parseFloat(JOptionPane.showInputDialog("Qual é o salário do funcionário?"));
        comissao = Float.parseFloat(JOptionPane.showInputDialog("Qual é a comissão fixa do funcionário? Em porcentagem"));       
    }
    
    public void calculoFinal() {
        salarioFinal = salario + ((valorTotalVendas * (comissao / 100)) * carrosVendidos) + (valorTotalVendas * (porcentagemVenda/100));
        JOptionPane.showMessageDialog(null, "O salário final do cliente é de R$" + salarioFinal);
    }
}
