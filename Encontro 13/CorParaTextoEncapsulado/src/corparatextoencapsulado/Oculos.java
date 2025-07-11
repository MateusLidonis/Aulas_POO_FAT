package corparatextoencapsulado;

import javax.swing.JOptionPane;

public class Oculos {

    private int R;
    private int G;
    private int B;
    private int soma;
    private String RGB;

    private String[] nomesCores = {
        "Vermelho", //0
        "Verde", //1
        "Azul",//2
        "Preto"}; //3

    private String[] nomesCoresMisturadas = {
        "Vermelho esverdeado", //0
        "Vermelho azulado", //1
        "Verde avermelhado", //2
        "Verde azulado", //3
        "Azul avermelhado", //4
        "Azul esverdeado"};     //5

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getG() {
        return G;
    }

    public void setG(int G) {
        this.G = G;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }

    public String[] getNomesCores() {
        return nomesCores;
    }

    public String[] getNomesCoresMisturadas() {
        return nomesCoresMisturadas;
    }

    public void CorPredominante() {//Mostra a cor predominante - 1ª condição

        if (getR() > getG() && getR() > getB()) {
            JOptionPane.showMessageDialog(null, "A cor predominante é " + getNomesCores()[0]);
        } else if (getG() > getB()) {
            JOptionPane.showMessageDialog(null, "A cor predominante é " + getNomesCores()[1]);
        } else {
            JOptionPane.showMessageDialog(null, "A cor predominante é " + getNomesCores()[2]);
        }

    }

    public void CorPreto() {//Mostra se a cor predominante é preto - 2ª condição

        JOptionPane.showMessageDialog(null, "A cor predominante é " + getNomesCores()[3]);

    }

    public void CorMisturada() {//Se tiver mistra de cores, mostra a mistura respectiva - 3ª condição
        if (getR() > getG() && getG() > getB()) {
            JOptionPane.showMessageDialog(null, "A cor é " + getNomesCoresMisturadas()[0]);
        } else if (getR() > getB() && getB() > getG()) {
            JOptionPane.showMessageDialog(null, "A cor é " + getNomesCoresMisturadas()[1]);
        } else if (getG() > getR() && getR() > getB()) {
            JOptionPane.showMessageDialog(null, "A cor é " + getNomesCoresMisturadas()[2]);
        } else if (getG() > getB() && getB() > getR()) {
            JOptionPane.showMessageDialog(null, "A cor é " + getNomesCoresMisturadas()[3]);
        } else if (getB() > getR() && getR() > getG()) {
            JOptionPane.showMessageDialog(null, "A cor é " + getNomesCoresMisturadas()[4]);
        } else if (getB() > getG() && getG() > getR()) {
            JOptionPane.showMessageDialog(null, "A cor é " + getNomesCoresMisturadas()[5]);
        }
    }

    public void CalculaMistura() {
        String[] mistura = getRGB().split(" "); //Pego o valor digita na string e separo em cada "espaço" encontrado
        if (mistura.length == 3) {//Se após a separação eu tiver 3 "campos" eu sigo
            try {
                setR(Integer.parseInt(mistura[0]));//O índice 0 é referente ao vermelho
                setG(Integer.parseInt(mistura[1]));//O índice 1 é referente ao verde
                setB(Integer.parseInt(mistura[2]));//O índice 2 é referente ao azul

                if (getR() <= 100 && getG() <= 100 && getB() <= 100) {//Nenhuma cor pode ser maior do que 100

                    setSoma(getR() + getB() + getG());//Calculo a soma dos 3 valores para utilizar futuramente
                    if (getR() >= 60 || getG() >= 60 || getB() >= 60) {//1ª Condição
                        CorPredominante();
                    } else if (getSoma() < 40) {//2ª Condição
                        CorPreto();
                    } else {//3ª Condição
                        CorMisturada();
                    }

                } else {//100 é o limite por cor
                    JOptionPane.showMessageDialog(null, "Valor incorreto, deve ser menor ou igual à 100");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Você deve inserir apenas números inteiros", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {//Não pode ter mais de 3 valores
            JOptionPane.showMessageDialog(null, "Você deve inserir apenas 3 valores", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
