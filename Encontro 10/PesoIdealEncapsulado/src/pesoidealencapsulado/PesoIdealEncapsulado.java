package pesoidealencapsulado;

import javax.swing.JOptionPane;

public class PesoIdealEncapsulado {

    public static void main(String[] args) {
        Calcula calcula = new Calcula();
        calcula.setSexo(JOptionPane.showInputDialog("Qual é o seu sexo?\nMasculino?\nFeminino").trim().toUpperCase());
        calcula.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros (Ex. 1.75)")));
        calcula.calculaPesoIdeal();

        // Eu não gosto de usar essa condição aqui, mas to usando só pra demonstrar o getPeso no Main
        // Poderia criar um método exibeResultado na classe Calcula e lá eu faria uma validação melhor
        if (calcula.getPeso() != 0) {
            JOptionPane.showMessageDialog(null, String.format("O seu peso ideal é: %.2f kg", calcula.getPeso()));
        }
//        JOptionPane.showMessageDialog(null,calcula.getAltura());
//        JOptionPane.showMessageDialog(null,calcula.getSexo());
    }

}
