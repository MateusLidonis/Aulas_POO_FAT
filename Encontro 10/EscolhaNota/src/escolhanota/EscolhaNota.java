package escolhanota;

import javax.swing.JOptionPane;

public class EscolhaNota {

    public static void main(String[] args) {
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno"));
        
        switch (nota) {
            case 5:
                JOptionPane.showMessageDialog(null, "Ótimo");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Muito bom");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Bom");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Regular");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Ruim");
                break;                
             
            default:
                JOptionPane.showMessageDialog(null, "Nota Inválida");
        }
    }
    
}
