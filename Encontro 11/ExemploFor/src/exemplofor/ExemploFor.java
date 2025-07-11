package exemplofor;

import javax.swing.JOptionPane;

public class ExemploFor {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        for (int i = 0; i <= num; i++) {            
            JOptionPane.showMessageDialog(null, "Número " + i);
        }
    }
    
}
