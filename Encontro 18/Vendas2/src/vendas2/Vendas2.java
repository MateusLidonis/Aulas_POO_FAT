package vendas2;

import javax.swing.JOptionPane;

public class Vendas2 {

    public static void main(String[] args) {
        //Método construtor SEM parâmetros
        Vendedor vendedor1 = new Vendedor();
        
        //Método construtor COM parâmetros
        Vendedor vendedor2 = new Vendedor(2, "Mateus", 50000);
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu código de vendedor?"));
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        double vendasIniciais = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor inicial de vendas?"));
        
        vendedor1.setCodigo(codigo);
        vendedor1.setNome(nome);
        vendedor1.setVendas(vendasIniciais);
        vendedor1.addVendas(10000);
        
        JOptionPane.showMessageDialog(null, "Dados do vendedor 1:\n" + vendedor1.toString() +
                                            "\n\nDados do vendedor 2:\n" + vendedor2.toString());
    }
    
}
