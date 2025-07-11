/*
Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive)
em ordem decrescente.
 */
package decrescente;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Decrescente {

    public static void main(String[] args) {
        String repetir;
        while (true) {
            try {
                do {

                    int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));

                    //Usando StringBuilder para montar a lista
                    StringBuilder ordem = new StringBuilder("A ordem decrescente entre 1 e " + num + " é:\n");

                    //Contagem decrescente usando for, visto que não foi solicitado o input dos números
                    //Fiz uma alteração para receber um valor do usuário
                    for (int i = num; i >= 1; i--) {
                        //Adiciono o índice atual na lista
                        ordem.append(i);
                        //Se o índice não for igual à 1, eu posso adicionar uma "," na lista. Se o número for igual à 1, eu pulo essa parte
                        if (i != 1) {
                            ordem.append(", ");
                        }
                    }//E o output vai ficar assim "10, 9, 8, 7, 6, 5, 4, 3, 2, 1"
                    JOptionPane.showMessageDialog(null, ordem);

                    repetir = JOptionPane.showInputDialog(null, "Deseja repetir a execução do programa (S/N)?").trim().toUpperCase();
                } while (repetir.equals("S"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
