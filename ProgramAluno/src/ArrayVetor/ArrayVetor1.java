package ArrayVetor;

import entities.Aluno;
import entities.Disciplina;

public class ArrayVetor1 {

    public static void main(String[] args) {

        double[] notasJava = {8.8, 9.7, 7.6, 6.8};
        double[] LogicaDeProgramacao = {1.0, 2.3, 8.61, 1.2};

        /*Criação do Aluno*/
        Aluno aluno0 = new Aluno();
        aluno0.setNome("Igor F Bairros");
        aluno0.setNomeEscola("JEV Treinamentos");


        /*Criação da Disciplina*/
        Disciplina disciplina0 = new Disciplina();
        disciplina0.setDisciplina("Curso JAVA");
        disciplina0.setNota(notasJava);

        aluno0.getDisciplinas().add(disciplina0);


        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Logica de Programação");
        disciplina1.setNota(LogicaDeProgramacao);


        aluno0.getDisciplinas().add(disciplina1);
        
      System.out.println("Nome do Aluno: "+ aluno0.getNome() + "\nNome da Escola: "+ aluno0.getNomeEscola());
      
      for(Disciplina d : aluno0.getDisciplinas()){
        System.out.println("=================== Disciplina do Aluno ================");

        System.out.println("Disciplina: " + d.getDisciplina());
        System.out.println("Notas das Discplinas são");

        for(int i = 0; i < d.getNota().length; i++){
          System.out.println("Notas: N°"+(i + 1)+ " = " + d.getNota()[i]);

        }

        
        

      }

  }      
      
        
 
        
        


    
    
}
