package postoipirangaencapsulado;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BombaPosto {

    private double litros;
    private String tipoCombustivel;
    private double precoAlcool = 3.30;
    private double precoGasolina = 2.90;
    private double resultado, resultadoComDesconto;
    private double desconto;

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {//
        this.litros = litros;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {//
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getPrecoAlcool() {//
        return precoAlcool;
    }

    public double getPrecoGasolina() {//
        return precoGasolina;
    }

    public double getResultadoComDesconto() {
        return resultadoComDesconto;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void calculaGasolina() {
        setResultado(litros * precoGasolina);
        desconto = (litros <= 20) ? 0.04 : 0.06;
        //desconto = (if) ? true : false;
        resultadoComDesconto = getResultado() - (getResultado() * desconto);
    }

    public void calculaAlcool() {
        setResultado(litros * precoAlcool);
        desconto = (litros <= 20) ? 0.03 : 0.05;
        resultadoComDesconto = getResultado() - (getResultado() * desconto);
    }

    public void calcula() {
        if (tipoCombustivel.equals("ALCOOL")) {
            calculaAlcool();
        } else if (tipoCombustivel.equals("GASOLINA")) {
            calculaGasolina();
        } else {
            //Opção inválida
            JOptionPane.showMessageDialog(null, "Tipo de combustível inválido.");
        }
    }
}
