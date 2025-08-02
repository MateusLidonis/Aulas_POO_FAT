package ppr11;

public class PPR11 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bolt", 8, "Branco", "Pastor Branco");
        Ave ave = new Ave("Piu-piu", 3, "Amarelo", true);
        Peixe peixe = new Peixe("Nemo", 5, "Laranja", "Salgada");
        
        System.out.println(cachorro);
        System.out.println(ave);
        System.out.println(peixe);
        
        System.out.println("\n--- Ações dos animais ---");
        
        cachorro.comer();
        cachorro.dormir();
        cachorro.latir();
        
        ave.comer();
        ave.dormir();
        ave.cantar();
        
        peixe.comer();
        peixe.dormir();
        peixe.nadar();
    }
    
}
