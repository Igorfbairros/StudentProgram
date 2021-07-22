package program;

import javax.swing.JOptionPane;

import entities.Aluno;
import entities.Disciplina;


public class Program {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Your Name: ");
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
        
        
        System.out.println(aluno0);
        System.out.println("Media Aluno = " + aluno0.getMediaNotas());
        System.out.println("Aproved or not = " + aluno0.getAlunoAprovado());
        System.out.println("Disciplinas = " + aluno0.getDisciplinas());
        





        


        System.out.println(aluno0.toString());
    }

    
    
}
