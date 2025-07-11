package tabuada;

import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) {
        // Solicita ao usuário o número para a tabuada
        String input = JOptionPane.showInputDialog("Digite um número para ver a tabuada:");
        
        // Verifica se o usuário inseriu algo
        if (input != null && !input.isEmpty()) {
            try {
                int numero = Integer.parseInt(input); // Converte o número para inteiro
                StringBuilder tabuada = new StringBuilder("Tabuada do " + numero + ":\n");
                
                // Gera a tabuada
                for (int i = 1; i <= 10; i++) {
                    tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
                }
                
                // Exibe a tabuada no JOptionPane
                JOptionPane.showMessageDialog(null, tabuada.toString(), "Tabuada", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número foi inserido.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}
 
