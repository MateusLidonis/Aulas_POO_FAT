package postoipiranga;

import javax.swing.JOptionPane;

public class BombaPosto {

    double litros;
    String tipoCombustivel;
    double precoAlcool = 3.30;
    double precoGasolina = 2.90;
    double resultado, resultadoComDesconto;
    double desconto;

    public void recebeDados() {
        tipoCombustivel = JOptionPane.showInputDialog("Qual será o combustível a ser abastecido?\nalcool\ngasolina");
        litros = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros?"));

    }

    public void calculaGasolina() {
        resultado = (litros * precoGasolina);
        desconto = (litros <= 20) ? 0.04 : 0.06;
        //desconto = (if) ? true : false;
        resultadoComDesconto = resultado - (resultado * desconto);
    }

    public void calculaAlcool() {
        resultado = (litros * precoAlcool);
        desconto = (litros <= 20) ? 0.03 : 0.05;
        resultadoComDesconto = resultado - (resultado * desconto);
    }

    public void calcula() {
        if (tipoCombustivel.equals("alcool")) {
            calculaAlcool();
        } else if (tipoCombustivel.equals("gasolina")) {
            calculaGasolina();
        } else {
            //Opção inválida
            JOptionPane.showMessageDialog(null, "Tipo de combustível inválido.");
            return;
        }
    }

    public void exibeResultado() {
        JOptionPane.showMessageDialog(null,
                "Você escolheu " + tipoCombustivel
                + "\nValor total sem desconto: R$ " + String.format("%.2f", resultado)
                + "\nDesconto aplicado: " + (int) (desconto * 100) + "%"
                + "\nValor total com desconto: R$ " + String.format("%.2f", resultadoComDesconto)
        );
    }
}
