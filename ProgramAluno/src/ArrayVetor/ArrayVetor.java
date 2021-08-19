package ArrayVetor;

import javax.swing.JOptionPane;

public class ArrayVetor {

    public static void main(String[] args) {

        /* Array can be any kind datas and object too*/
            String posicoes = JOptionPane.showInputDialog("Quantas Posições o Array deve ter? ");
            /**Array always should have defined quantities position */
            double [] notas = new double[Integer.parseInt(posicoes)];
            
            for(int i = 0; i< notas.length; i++){
            String valor = JOptionPane.showInputDialog("Qual o valor da posição? N°"+ (i+1) );
            notas[i] = Double.valueOf(valor);


        }

        

        for(int i = 0; i <= notas.length; i++){
            System.out.println("N"+ (i+1) +"° = "+notas[i]);

        }

        
    }
    
}
