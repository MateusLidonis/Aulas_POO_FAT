package postoipirangaencapsulado;

import java.math.RoundingMode; //Não quero arredondar os valores!!!!
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PostoIpirangaEncapsulado {

    public static void main(String[] args) {
        BombaPosto frentista = new BombaPosto();
        DecimalFormat df = new DecimalFormat("#,###.00");
        df.setRoundingMode(RoundingMode.DOWN); //Não quero arredondar os valores!!!!
        
        JOptionPane.showMessageDialog(null, String.format("Bem vindo ao Posto Ipiranga\n"
                + "O preço do nosso Álcool é %.2f\n"
                + "O preço da nossa gasolina é %.2f", frentista.getPrecoAlcool(), frentista.getPrecoGasolina()));

        frentista.setTipoCombustivel(JOptionPane.showInputDialog("Qual será o combustível a ser abastecido?\nAlcool\nGasolina").trim().toUpperCase());
        frentista.setLitros(Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?")));

        frentista.calcula();

        if (frentista.getResultadoComDesconto() != 0) {
            String resultadoFormatado = df.format(frentista.getResultado());
            String resultadoComDescontoFormatado = df.format(frentista.getResultadoComDesconto());
            JOptionPane.showMessageDialog(null,
                    "Você escolheu " + frentista.getTipoCombustivel()
                    + "\nValor total sem desconto: R$ " + resultadoFormatado
                    + "\nDesconto aplicado: " + (int) (frentista.getDesconto() * 100) + "%"
                    + "\nValor total com desconto: R$ " +  resultadoComDescontoFormatado
            );
        }

    }

}
