package boletin4_1;

import javax.swing.JOptionPane;

/**
 *
 * @author igonzalezcastro
 */
public class Boletin4_1 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero"));

        if (numero < 500) {
            JOptionPane.showMessageDialog(null, "É menor que 500 : "+numero+",Incremento : "+(numero*0.5)+",Cantidade Final :" + (numero + (numero * 0.5)));
        } else if (numero < 1000) {
            JOptionPane.showMessageDialog(null, "Entre 500 e 1000 : "+numero+",Incremento : "+(numero*0.07)+",Cantidade Final : "+ (numero + (numero * 0.07)));
        } else if (numero < 5000) {
            JOptionPane.showMessageDialog(null, "Entre 1000 e 5000 : "+ numero +",Incremento : "+(numero*0.15)+",Cantidade Final :" +(numero + (numero * 0.15)));
        } else {
            JOptionPane.showMessageDialog(null, "Maior 5000 : "+ numero +",Incremento : "+ (numero*0.03) + ",Cantidade Final : " +(numero + (numero * 0.03)));
        }
    }

}
