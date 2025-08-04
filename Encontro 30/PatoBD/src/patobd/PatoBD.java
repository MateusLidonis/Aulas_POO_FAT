package patobd;

import javax.swing.JOptionPane;

public class PatoBD {

    public static void main(String[] args) {
        BancoDeDados banco = new BancoDeDados();

        banco.conectar();

        try {
            banco.buscarPatos();
            String nome = JOptionPane.showInputDialog("Qual é o nome do pato?");
            banco.incluirPato(nome);
            banco.buscarPatos();
        } catch (Exception e) {
            banco.buscarPatos();
        } finally {
            banco.desconectar();
        }

    }

}
