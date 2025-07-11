package divisaocondicional;

import javax.swing.JOptionPane;

public class DivisaoCondicional {

    public static void main(String[] args) {
        while (true) {
            try {
                double n1, n2, resultado;
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));

                do {
                    n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
                    if (n2 <= 0) {
                        JOptionPane.showMessageDialog(null, "Número inválido, digite um número maior que 0!");
                    }
                } while (n2 <= 0);
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "A divisão de " + n1 + " por " + n2 + " é: " + resultado);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
