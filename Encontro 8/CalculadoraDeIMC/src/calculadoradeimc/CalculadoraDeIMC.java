package calculadoradeimc;

public class CalculadoraDeIMC {
    public static void main(String[] args) {
        CalculaIMC imc = new CalculaIMC();
        
        imc.recebeDados();
        imc.calculaIMC();
        imc.exibeResultado();
    }
    
}
