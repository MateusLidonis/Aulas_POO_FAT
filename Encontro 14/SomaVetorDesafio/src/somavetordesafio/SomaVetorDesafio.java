package somavetordesafio;

import javax.swing.*;

public class SomaVetorDesafio {

    public static void main(String[] args) {
        double a[] = new double[5];
        double soma = 0;
        for (int i = 0; i <a.length ; i++) {
            a[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor"));
            soma += a[i];
        }
        JOptionPane.showMessageDialog(null,"A soma de todos os valores inseridos é: " + soma);
    }
    
}
