/*
Supondo que a população de um país A seja da ordem de 80000 habitantes
com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes
com uma taxa de crescimento de 1.5%.
Faça um programa que calcule e escreva o número de anos necessários para que
a população do país A ultrapasse ou iguale a população do país B,
mantidas as taxas de crescimento.
 */
package populacao;

import javax.swing.JOptionPane;

public class Populacao {

    public static void main(String[] args) {
        int populacaoA, populacaoB;
        double taxaA = 3, taxaB = 1.5, anos = 0;
        String repetir;

        //Do para saber se o usuário deseja repetir o programa
        do {
            //Loop infinito para garantir que o usuário digite o número correto, apenas continuar o programa quando o número for correto
            while (true) {
                //Começo a validação de números
                try {
                    //Pede a população da cidade A
                    populacaoA = Integer.parseInt(JOptionPane.showInputDialog("Quantos habitantes tem a cidade A?"));
                    //Se fo maior que o range estipulado
                    if (populacaoA > 80999) {
                        //Exibe essa mensagem. Por conta do while true, executa esse bloco novamente
                        JOptionPane.showMessageDialog(null, "A cidade A deve ter no máximo 80.999 habitantes.");
                        //Até o número estar dentro do range, então, para o loop e segue para o próximo bloco de código
                    } else {
                        break;
                    }
                    //Se for qualquer coisa diferente de número, cai na exceção
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }

            //Mesma lógica do bloco anterior
            while (true) {
                try {
                    populacaoB = Integer.parseInt(JOptionPane.showInputDialog("Quantos habitantes tem a cidade B?"));
                    if (populacaoB > 200999) {
                        JOptionPane.showMessageDialog(null, "A cidade B deve ter no máximo 200.999 habitantes.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            //Se a população A já for maior do que a população B, nem faz a conta, já exibe essa mensagem
            if (populacaoA >= populacaoB) {
                JOptionPane.showMessageDialog(null, "A populção da cidade A já é maior ou igual à população da cidade B");
                // Se A for menor do que B, ai sim, vamos calcular em quantos anos a população de A fica igual ou maior á população de B
            } else {

                while (populacaoA < populacaoB) {
                    populacaoA += populacaoA * (taxaA / 100);
                    populacaoB += populacaoB * (taxaB / 100);
                    anos++;
                }

                JOptionPane.showMessageDialog(null, "Considerando uma taxa anual de crescimento de " + taxaA + " para a cidade A"
                        + "\nE uma taxa de crescimento anual de " + taxaB + " para a cidade B"
                        + "\nPodemos afirmar que a cidade A irá se igualar, ou ultrapassar a cidade B"
                        + "\nEm " + anos + " anos"
                        + "\nSendo a população da cidade A após esse período: " + populacaoA
                        + "\nE a população da cidade B: " + populacaoB);

            }
            //Validação para o usuário repetir o programa
            repetir = JOptionPane.showInputDialog("Deseja repetir o programa (S/N)?").trim().toUpperCase();
        } while (repetir.equals("S"));
    }
}
