package pesoidealencapsulado;

import javax.swing.JOptionPane;

public class Calcula {

    private String sexo;
    private double altura;
    private double peso;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void calculaPesoIdeal() {
        if (sexo.equals("MASCULINO")) {
            peso = (72.7 * altura) - 58;
        } else if (sexo.equals("FEMININO")) {
            peso = (62.1 * altura) - 44.7;
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inserido não está dentro das opções");
        }
    }
}
