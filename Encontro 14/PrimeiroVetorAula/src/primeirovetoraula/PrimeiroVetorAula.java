package primeirovetoraula;

import javax.swing.*;

public class PrimeiroVetorAula {

    public static void main(String[] args) {
        int vetor[] = new int[10];

        for (int indice = 0; indice < vetor.length; indice++) {
            vetor[indice] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (indice + 1) + "º Elemento"));
        }
        
        for (int indice = 0; indice < vetor.length; indice++) {
            JOptionPane.showMessageDialog(null, "O valor na posição " + indice + " do vetor é: " + vetor[indice]);
        }

    }

}
