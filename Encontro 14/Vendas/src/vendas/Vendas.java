package vendas;

import javax.swing.JOptionPane;

public class Vendas {

    public static void main(String[] args) {
        int codigo;
        String nome;
        double comissao;
        
        Vendedor lojinha = new Vendedor();
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu código de vendedor?"));
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        lojinha.addVendas(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de vendas?")));
        lojinha.calculaComissao();
        comissao = lojinha.getComissao();
        
        JOptionPane.showMessageDialog(null, "Código: " + codigo + 
                                        "\n Nome: " + nome + 
                                        "\n Vendas: " + lojinha.getVendas() + 
                                        "\n Comissão: " + comissao);
        
    }
    
}
