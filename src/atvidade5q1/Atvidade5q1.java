
package atvidade5q1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Atvidade5q1 {

    /**
     * 
     */
    public static void main(String[] args) {
        
    int numero , acumulador;
    Scanner teclado = new Scanner(System.in);
    
    numero = 1;
    acumulador = 0;
    
    while(numero != 0){
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite algum numero"
                + " ou digite 0(zero) para sair"));
        
        acumulador = acumulador + numero;    
}
    
    JOptionPane.showMessageDialog(null, "A somatoria total foi de: "+acumulador);
    }
    
}
