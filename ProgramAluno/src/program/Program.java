package program;

import javax.swing.JOptionPane;

import entities.Aluno;


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

        String disciplina1 = JOptionPane.showInputDialog("Disciplina1");
        String nota1 = JOptionPane.showInputDialog("Nota1");
        String disciplina2 = JOptionPane.showInputDialog("Disciplina2");
        String nota2 = JOptionPane.showInputDialog("Nota2");
        String disciplina3 = JOptionPane.showInputDialog("Disciplina3");
        String nota3 = JOptionPane.showInputDialog("Nota3");
        String disciplina4 = JOptionPane.showInputDialog("Disciplina4");
        String nota4 = JOptionPane.showInputDialog("Nota4");


        
        aluno0.getDisciplinas().setNota1(Double.parseDouble(nota1));
        aluno0.getDisciplinas().setNota1(Double.parseDouble(nota2));
        aluno0.getDisciplinas().setNota3(Double.parseDouble(nota3));
        aluno0.getDisciplinas().setNota4(Double.parseDouble(nota4));

        aluno0.getDisciplinas().setDisciplina1(disciplina1);
        aluno0.getDisciplinas().setDisciplina2(disciplina2);
        aluno0.getDisciplinas().setDisciplina3(disciplina3);
        aluno0.getDisciplinas().setDisciplina4(disciplina4);

        
        
        


        

        System.out.println(aluno0.toString());
    }

    
    
}
