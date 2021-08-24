package ArrayVetor;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        
        String texto = " Alex, Curso Java, 30, 50, 20";

        String[] valoresArray = texto.split(",");

        // item by item
        System.out.println("Nome Aluno = " + valoresArray[0]);
        System.out.println("Curso Aluno = "+ valoresArray[1]);
        System.out.println("Nota N°1 = "+ valoresArray[2]);
        System.out.println("Nota N°2 = "+ valoresArray[3]);
        System.out.println("Nota N°3 = "+ valoresArray[4]);
        System.out.println("+++++++++++++++++++++++++++++++++++");

        // Scroll through by. for
        /*for(int i = 0; i < valoresArray.length; i++){
            System.out.println(valoresArray[i]);

        }*/
        //Converting a Array to an List
        List<String> list = Arrays.asList(valoresArray);

        System.out.println(" Converting a Array to an List ");
        for (String valorString : list) {
            System.out.println("( " + valorString+ " )");
            
        }

        String[] conversaoArray = list.toArray(new String[valoresArray.length]);

        System.out.println(" Converting a List to an Array ");
        for(int i = 0; i < conversaoArray.length; i++){
            System.out.println(conversaoArray[i]);
        }

    }









    
    
}
