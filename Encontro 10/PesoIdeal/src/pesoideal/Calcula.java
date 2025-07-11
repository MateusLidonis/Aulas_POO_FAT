package pesoideal;

import javax.swing.JOptionPane;

public class Calcula {
    String sexo;
    double altura, pesoIdeal;

    public void recebeDados() {
        sexo = JOptionPane.showInputDialog("Qual é o seu sexo?\nMasculino?\nFeminino").trim().toUpperCase();
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros (Ex. 1.75)"));        
    }
    
    public void calculaPesoIdeal() {
        char inicialSexo = sexo.charAt(0);
        if(inicialSexo == 'M'){
            pesoIdeal = (72.7 * altura) - 58;
        } else if(inicialSexo == 'F'){
            pesoIdeal = (62.1 * altura) - 44.7;
        } else{
            JOptionPane.showMessageDialog(null, "Sexo inserido não está dentro das opções");
            return;
        }
        JOptionPane.showMessageDialog(null, String.format("O seu peso ideal é: %.2f kg", pesoIdeal));
        
//        switch (inicialSexo) {
//            case 'M':
//                pesoIdeal = (72.7 * altura) - 58;
//                JOptionPane.showMessageDialog(null, String.format("O seu peso ideal é: %.2f kg", pesoIdeal));
//                break;
//            case 'F':
//                pesoIdeal = (62.1 * altura) - 44.7;
//                JOptionPane.showMessageDialog(null, String.format("O seu peso ideal é: %.2f kg", pesoIdeal));
//                break;
//            default:
//                JOptionPane.showMessageDialog(null, "Sexo inserido não está dentro das opções");
//                return;
//        }         
    }
}

