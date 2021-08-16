package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import cursojava.constantes.StatusAluno;

import entities.Aluno;
import entities.Disciplina;
import entities.Secretario;


public class Program {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Entre com a login");
        String senha = JOptionPane.showInputDialog("Entre com a senha");


        Secretario secretario = new Secretario();/* working directly with the object */
        secretario.setLogin(login);
        secretario.setSenha(senha);

        if(secretario.autenticar()){

            


        List<Aluno> alunos = new ArrayList<Aluno>();

        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


        /*
        List<Aluno> alunosAprovados = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados = new ArrayList<Aluno>();
        */

        
        for(int qtd = 1; qtd <= 5; qtd++){

        

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
        maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
        maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
        maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

        for(Aluno aluno: alunos){
            
            if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)){
                maps.get(StatusAluno.APROVADO).add(aluno);
            }else if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
                maps.get(StatusAluno.RECUPERACAO).add(aluno);
            }else{
                maps.get(StatusAluno.REPROVADO).add(aluno);
            }
        }

        System.out.println("------------Alunos Aprovados---------------------");
        for(Aluno aluno: maps.get(StatusAluno.APROVADO)){
            System.out.println("Aprovados = " + aluno.getNome()+" Media = " + aluno.getMediaNotas());
        }
        System.out.println("------------Alunos em Recuperação-----------------");
        for(Aluno aluno: maps.get(StatusAluno.RECUPERACAO)){
            System.out.println("Recuperação = "+ aluno.getNome()+"Media = "+ aluno.getMediaNotas());
        }
        for(Aluno aluno: maps.get(StatusAluno.REPROVADO)){
            System.out.println("Reprovado = " + aluno.getNome()+ "Media = "+ aluno.getMediaNotas());
        }
    
    }else{
        JOptionPane.showMessageDialog(null, "Acesso não permetido");
    }
}   
}
    
        


