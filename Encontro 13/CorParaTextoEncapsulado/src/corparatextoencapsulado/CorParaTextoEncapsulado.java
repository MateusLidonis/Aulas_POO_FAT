package corparatextoencapsulado;

import javax.swing.JOptionPane;

public class CorParaTextoEncapsulado {

    public static void main(String[] args) {
        String repetir;
        while (true) {//Loop infinito para ficar repetindo o programa
            do {//Só vai repetir se a condição do do-while for verdadeira
                JOptionPane.showMessageDialog(null, "Bem vindo ao óculos para daltônicos"
                        + "\nVocê deve digitar três porcentagens de cores"
                        + "\nR G B (Vermelho Verde Azul)"
                        + "\nExemplo: 40 60 20");

                Oculos oculos = new Oculos();

                oculos.setRGB(JOptionPane.showInputDialog("Digite as cores separadas por um espaço simples, devem ser números inteiros"));
                oculos.CalculaMistura();
                repetir = JOptionPane.showInputDialog("Deseja repetir o programa (S/N)?").trim().toUpperCase();
            } while (repetir.equals("S"));
            break;
        }
    }

}
