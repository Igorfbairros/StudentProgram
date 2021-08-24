package ArrayVetor;

public class Matriz {

    public static void main(String[] args) {
        
        int notas[][] = new int[2][3];

        notas[0][0] = 10 ;
        notas[0][1] = 20 ;
        notas[0][2] = 30 ;
         
        notas[1][0] = 40 ;
        notas[1][1] = 50 ;
        notas[1][2] = 60 ;

        
    for(int l = 0; l <= notas.length; l++){// Scroll through the lines
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(int c = 0; c <= notas.length; c++){ //Scroll through the colums
            //System.out.println(notas[l][0]); 
            //System.out.println(notas[l][1]);
            System.out.println(" + Linha: " + (l + 1)+ ", Coluna: "+ (c + 1) + " = Valor da Matriz: "+ notas[l][c] + "   +");

        }
    }

    }
    
}
