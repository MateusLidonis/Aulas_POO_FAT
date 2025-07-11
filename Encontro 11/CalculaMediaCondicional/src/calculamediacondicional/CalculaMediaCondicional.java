package calculamediacondicional;

import javax.swing.JOptionPane;

public class CalculaMediaCondicional {

    public static void main(String[] args) {
        double primeiraAva, segundaAva, media;
        String repetir;

        // Aqui o programa solicita os dois valores e valida eles juntos, portanto, se UM deles estiver errado, o programa vai solicitar os DOIS novamente
        // Isso não é legal, imagine uma escola com 10 avaliações, e o professor erra o último valor, vai ter que inserir todos novamente....
//        do {            
//            primeiraAva = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira avaliação"));
//            segundaAva = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda avaliação"));
//            if ((primeiraAva < 0 || primeiraAva > 10) || (segundaAva < 0 || segundaAva > 10)){
//                JOptionPane.showMessageDialog(null, "Nota inválida");
//            }
//        } while ((primeiraAva < 0 || primeiraAva > 10) || (segundaAva < 0 || segundaAva > 10));
        while (true) {
            try {

                do {
                    do {
                        primeiraAva = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da PRIMEIRA avaliação"));
                        if (primeiraAva < 0 || primeiraAva > 10) {
                            JOptionPane.showMessageDialog(null, "Nota inválida");
                        }
                    } while (primeiraAva < 0 || primeiraAva > 10);

                    do {
                        segundaAva = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da SEGUNDA avaliação"));
                        if (segundaAva < 0 || segundaAva > 10) {
                            JOptionPane.showMessageDialog(null, "Nota inválida");
                        }
                    } while (segundaAva < 0 || segundaAva > 10);

                    media = (primeiraAva + segundaAva) / 2;
                    JOptionPane.showMessageDialog(null, "A média simples do aluno é: " + media);

                    repetir = JOptionPane.showInputDialog("NOVO CÁLCULO (S/N)?").trim().toUpperCase();

                } while (repetir.equals("S"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
