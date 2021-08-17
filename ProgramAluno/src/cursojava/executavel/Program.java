package cursojava.executavel;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import classeauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

import entities.Aluno;
import entities.Diretor;
import entities.Disciplina;
//import entities.Secretario;
//import interfaces.PermitirAcesso;


public class Program {
    public static void main(String[] args) {

        try{

            File fil = new File("c://lines.txt"); // take out c:// you'll see the Error
            Scanner sc = new Scanner(fil);
            

        String login = JOptionPane.showInputDialog("Entre com a login");
        String senha = JOptionPane.showInputDialog("Entre com a senha");

        
        // PermitirAcesso permitirAcesso = new Secretario(login, senha);
    

       // if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()){ //I will lock the contract to authorize only those who actually have the 100% legitimate contract
        if(new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()){


            

            // null to show nullPoiterExeption
        List<Aluno> alunos = new ArrayList<Aluno>();// null;// new ArrayList<Aluno>();

        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


        /*
        List<Aluno> alunosAprovados = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados = new ArrayList<Aluno>();
        */

        
        for(int qtd = 1; qtd <= 1; qtd++){

        

        String name = JOptionPane.showInputDialog("Your Name do aluno "+ qtd+ "°:");
        String idade = JOptionPane.showInputDialog("Qual a sua idade");
        /*
        String dataDeNascimento = JOptionPane.showInputDialog("Born Date: ");
        String registroGeral = JOptionPane.showInputDialog("Tax Id: ");
        String numCpf = JOptionPane.showInputDialog("Cpf: ");
        String nomeMae = JOptionPane.showInputDialog("Mother name: ");
        String nomePai = JOptionPane.showInputDialog("Father name: ");
        String dataMatricula = JOptionPane.showInputDialog("Start Date: ");
        String nomeEscola = JOptionPane.showInputDialog("School name: ");
        String serieMatriculado = JOptionPane.showInputDialog("Class Year: ");*/

        

        Aluno aluno0 = new Aluno();
        
        aluno0.setNome(name);
        aluno0.setIdade(Integer.valueOf(idade));
       /* aluno0.setDataNascimento(dataDeNascimento);
        aluno0.setRegistroGeral(registroGeral);
        aluno0.setNumeroCpf(numCpf);
        aluno0.setNomeMae(nomeMae);
        aluno0.setNomePai(nomePai);
        aluno0.setDataMatricula(dataMatricula);
        aluno0.setNomeEscola(nomeEscola);
        aluno0.setDataMatricula(serieMatriculado);*/
       // String numDisciplinas = JOptionPane.showInputDialog("How much class you would like add? ");
        
       // for(int pos = 1; pos <= Integer.valueOf(numDisciplinas); pos++){
        for(int pos = 1; pos <= 1; pos++){
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
        JOptionPane.showMessageDialog(null, "Access no allowd");
    }

}catch(NumberFormatException e){

    StringBuilder out = new StringBuilder();

    e.printStackTrace();/* Always put this because show up which line ocurred the error
     Print Error java consol */
    for(int pos = 0; pos < e.getStackTrace().length; pos++){
        
        out.append("\n Classe de Erro = " + e.getStackTrace()[pos].getClassName());
        out.append("\n Metodo de Erro = " + e.getStackTrace()[pos].getMethodName());
        out.append("\n Linha de Erro = " + e.getStackTrace()[pos].getLineNumber());
        out.append("\n Class = " + e.getClass().getName());

    }
    JOptionPane.showMessageDialog(null,"Erro ao processar notas = " + out.toString());
    //JOptionPane.showMessageDialog(null,"Erro ao processar notas = " + e.getMessage()); // This isn't good way to do this
    
}catch(NullPointerException e) {

    //StringBuilder out = new StringBuilder();
    JOptionPane.showMessageDialog(null,"Opá um Null Pointer Exception = " + e.getClass());
  //  JOptionPane.showMessageDialog(null,"Opá um Null Pointer Exception = " + out.toString());
}catch(Exception e){

   e.getStackTrace();
    StringBuilder out = new StringBuilder(e.getMessage());

    JOptionPane.showMessageDialog(null,"Catch Erro Generic = " + out.toString() + "\n Class = "+ e.getClass().getName());
    
}finally{// always to be executed with error or not 
    //Finally is always used when you need to execute some process acour a error or not
    JOptionPane.showMessageDialog(null,"Thanks for learn Java with me");

}
}
}
    
        


