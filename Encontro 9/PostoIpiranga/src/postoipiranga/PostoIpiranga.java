package postoipiranga;

import javax.swing.JOptionPane;

public class PostoIpiranga {

    public static void main(String[] args) {
        /*
     Álcool - Até 20 litros, 3% de desconto
     Álcool - Acima de 20 litros, 5% de desconto
     Gasolina - Até 20 litros, 4% de desconto
     Gasolina - Acima de 20 litros, 6% de desconto
         */
        JOptionPane.showMessageDialog(null, "Bem vindo ao Posto Ipiranga");

        BombaPosto tabajaras = new BombaPosto();

        tabajaras.recebeDados();
        tabajaras.calcula();
        tabajaras.exibeResultado();
    }
}
