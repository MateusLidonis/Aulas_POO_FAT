package exemplowhile;

import javax.swing.JOptionPane;

public class ExemploWhile {

    public static void main(String[] args) {
       int num;
       int i = 10;
  
        do {            
            JOptionPane.showMessageDialog(null,"Número: " + i);
            
            if(i == 0){
                JOptionPane.showMessageDialog(null,"Explodiu");
            }
            i--;
        } while (i >= 0 && i < 10);
//          } while (i >= -10);
//        while (i < 10) {            
//            JOptionPane.showMessageDialog(null,"Número: " + i);
//            i++;
//        }
    }
    
}
