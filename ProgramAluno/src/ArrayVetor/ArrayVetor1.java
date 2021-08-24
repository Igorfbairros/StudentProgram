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

        /*Criação do Aluno*/
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Igor F Bairros 2");
        aluno1.setNomeEscola("JEV Treinamentos");


        /*Criação da Disciplina*/
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Curso JAVA");
        disciplina2.setNota(notasJava);

        aluno1.getDisciplinas().add(disciplina2);


        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Logica de Programação");
        disciplina3.setNota(LogicaDeProgramacao);


        aluno1.getDisciplinas().add(disciplina3);

        Aluno[] arrayAluno = new Aluno[2];

        arrayAluno[0] = aluno0;
        arrayAluno[1] = aluno1;

        for(int i = 0; i < arrayAluno.length; i++){
          System.out.println("+++++++++++++++++++++++++++++++++++++");
          System.out.println("Nome do Aluno: "+ arrayAluno[i].getNome());

          for(Disciplina d: arrayAluno[i].getDisciplinas()){
            System.out.println("Disciplina do Aluno: " + d.getDisciplina());

            for(int posnota = 0; posnota < d.getNota().length; posnota++){
              System.out.println("A nota número: N°"+ (posnota + 1)+ " é igual " + d.getNota()[posnota]);

            }

          }
        }
        
      
      }

  }      
      
        
 
        
        


    
    

