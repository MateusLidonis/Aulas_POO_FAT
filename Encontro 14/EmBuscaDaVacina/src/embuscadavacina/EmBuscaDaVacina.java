package embuscadavacina;

import javax.swing.*;

public class EmBuscaDaVacina {

    public static void main(String[] args) {
        //Indica se o programa deve repetir
        String repetir;

            //Executa quando repetir = S
            do {
                //Indica o primeiro valor, define o tamanho do gene a ser analisado
                int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do gene"));

                //O tamanho do gene é limitado à entrada anterior
                int dna[] = new int[tamanhoVetor];

                //Conta o valor a ser buscado
                int contadorDNA = 0;

                String saida = "Elementos do vetor\n";

                //Pede o valor do gene
                for (int indice = 0; indice < tamanhoVetor; indice++) {
                    dna[indice] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do " + (indice + 1) + "º gene"));
                    saida += dna[indice] + " ";

                }
                //Exibe o valor do gene
//        JOptionPane.showMessageDialog(null, "O vetor é " + saida);

                //Informando o valor a ser buscado
                int alvo = Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor genético a ser analisado?"));

                //Percorre todo o array de DNA
                for (int indice = 0; indice < dna.length; indice++) {
                    //Se a gente acha o valor a ser buscado, o contador aumenta
                    if (dna[indice] == alvo) {
                        contadorDNA++;
                    }
                }

                //Verifica a quantidade de aparições do gene
                switch (contadorDNA) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Sumiuu!");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Ainda não é o suficiente!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Achei o danado!");
                }
                repetir = JOptionPane.showInputDialog("Deseja repetir o programa (S/N)?").toUpperCase();
            }while(repetir.equals("S"));
    }

}
