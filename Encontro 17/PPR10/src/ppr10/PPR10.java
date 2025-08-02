package ppr10;

import javax.swing.JOptionPane;

public class PPR10 {

    public static void main(String[] args) {
        Produto produto = new Produto(101, "Notebook Dell", 5, 3500.00);

        String mensagem = "Código: " + produto.getCodigo() + "\n"
                + "Descrição: " + produto.getDescricao() + "\n"
                + "Quantidade: " + produto.getQuantidade() + "\n"
                + String.format("Valor: R$ %.2f", produto.getValor());

        JOptionPane.showMessageDialog(null, mensagem);

        produto.setQuantidade(10);

        JOptionPane.showMessageDialog(null, "Quantidade atualizada: " + produto.getQuantidade());
 
    }

}
