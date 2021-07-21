package program;

import javax.swing.JOptionPane;

import entities.Aluno;
import entities.Disciplina;


public class Program {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Your Name: ");
        String dataDeNascimento = JOptionPane.showInputDialog("Born Date: ");
        String registroGeral = JOptionPane.showInputDialog("Tax Id: ");
        String numCpf = JOptionPane.showInputDialog("Cpf: ");
        String nomeMae = JOptionPane.showInputDialog("Mother name: ");
        String nomePai = JOptionPane.showInputDialog("Father name: ");
        String dataMatricula = JOptionPane.showInputDialog("Start Date: ");
        String nomeEscola = JOptionPane.showInputDialog("School name: ");
        String serieMatriculado = JOptionPane.showInputDialog("Class Year: ");

        

        Aluno aluno0 = new Aluno();
        aluno0.setNome(name);
        aluno0.setDataNascimento(dataDeNascimento);
        aluno0.setRegistroGeral(registroGeral);
        aluno0.setNumeroCpf(numCpf);
        aluno0.setNomeMae(nomeMae);
        aluno0.setNomePai(nomePai);
        aluno0.setDataMatricula(dataMatricula);
        aluno0.setNomeEscola(nomeEscola);
        aluno0.setDataMatricula(serieMatriculado);
        

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Bonco de dados");
        disciplina1.setNota(90.0);

        aluno0.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Matematica");
        disciplina2.setNota(80.0);

        aluno0.getDisciplinas().add(disciplina2);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Geografia");
        disciplina3.setNota(60.0);

        aluno0.getDisciplinas().add(disciplina3);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Java web");
        disciplina4.setNota(40.0);

        aluno0.getDisciplinas().add(disciplina4);


        


        System.out.println(aluno0.toString());
    }

    
    
}
