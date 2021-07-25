package program;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Aluno;
import entities.Disciplina;


public class Program {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();

        
        for(int qtd = 1; qtd <= 2; qtd++){

        

        String name = JOptionPane.showInputDialog("Your Name do aluno "+ qtd+ "°:");
       /* String dataDeNascimento = JOptionPane.showInputDialog("Born Date: ");
        String registroGeral = JOptionPane.showInputDialog("Tax Id: ");
        String numCpf = JOptionPane.showInputDialog("Cpf: ");
        String nomeMae = JOptionPane.showInputDialog("Mother name: ");
        String nomePai = JOptionPane.showInputDialog("Father name: ");
        String dataMatricula = JOptionPane.showInputDialog("Start Date: ");
        String nomeEscola = JOptionPane.showInputDialog("School name: ");
        String serieMatriculado = JOptionPane.showInputDialog("Class Year: ");*/

        

        Aluno aluno0 = new Aluno();
        
        aluno0.setNome(name);
       /* aluno0.setDataNascimento(dataDeNascimento);
        aluno0.setRegistroGeral(registroGeral);
        aluno0.setNumeroCpf(numCpf);
        aluno0.setNomeMae(nomeMae);
        aluno0.setNomePai(nomePai);
        aluno0.setDataMatricula(dataMatricula);
        aluno0.setNomeEscola(nomeEscola);
        aluno0.setDataMatricula(serieMatriculado);*/
        String numDisciplinas = JOptionPane.showInputDialog("How much class you would like add? ");
        
        for(int pos = 1; pos <= Integer.valueOf(numDisciplinas); pos++){
            String nomeDiscplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+"?");
            String notaDiscplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+"?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDiscplina);
            disciplina.setNota(Double.valueOf(notaDiscplina));

            aluno0.getDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma discplina ? ");

        if(escolha == 0){

            int continuarRemover = 0;
            int posicao = 1;

            while(continuarRemover == 0){
                String discplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3, ou 4," );
                aluno0.getDisciplinas().remove(Integer.valueOf(discplinaRemover).intValue()-posicao);
                posicao++;
                continuarRemover = JOptionPane.showConfirmDialog(null, "Keep removing ?");
                
            }


        }
        alunos.add(aluno0);
    
        }

        for(int pos = 0; pos < alunos.size(); pos++){

            Aluno aluno = alunos.get(pos);

            if(aluno.getNome().equalsIgnoreCase("alex")){
                Aluno trocar = new Aluno();
                trocar.setNome("Aluno foi treocado");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina("Matematica");
                disciplina.setNota(89.9);

                trocar.getDisciplinas().add(disciplina);
               alunos.set(pos, trocar);
               aluno = alunos.get(pos);

            }

            System.out.println("Aluno = " + aluno.getNome());
            System.out.println("Media do Aluno = " + aluno.getMediaNotas());
            System.out.println("Resultado do Aluno = " + aluno.getAlunoAprovado());
            System.out.println("===================================================");

            for(Disciplina disc : aluno.getDisciplinas()){
                System.out.println("Disciplina = " + disc.getDisciplina() + "Nota =" + disc.getNota());
            }
        }
    
    }
   
}
    
        


