package exemplovetor;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ExemploVetor {

    public static void main(String[] args) {
        int v[] = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º elemento (posição " + i + ")"));
        }
        
        String resposta = "Posição\tValor";
        
        for (int i = 0; i < v.length; i++) {
            resposta += "\nv[" + i + "]\t" + v[i];
        }
        
        JTextArea saida = new JTextArea();
        saida.setText(resposta);
        JOptionPane.showMessageDialog(null, saida);
        System.exit(0);
    }

}
