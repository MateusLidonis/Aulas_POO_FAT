package arraymultidimensional2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ArrayMultidimensional2 {

    public static void main(String[] args) {
        int mat[][], diag[], lin, col;
        lin = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas/colunas tem a matriz"));
        col = lin;
        mat = new int[lin][col];
        diag = new int[lin];
        String resposta = "Colunas";
        col = 0;
        for (int[] m : mat) {
            for (int coluna = 0; coluna < m.length; coluna++) {
                m[coluna] = (int) (Math.random() * 10);
            }
            resposta += "\t" + col++;
        }
        resposta += "\nLinhas";
        lin = 0;
        for (int[] m : mat) {
            resposta += "\n" + lin++;
            for (int coluna = 0; coluna < m.length; coluna++) {
                resposta += "\t" + m[coluna];
            }
        }
        resposta += "\n\nDiagonal Principal = ";
        col = 0;
        for (int[] m : mat) {
            resposta += " " + m[col++];
        }
        JTextArea saida = new JTextArea(resposta);
        JOptionPane.showMessageDialog(null, saida);
        System.exit(0);
    }
}


