package executavel;

import entities.Aluno;
import entities.Diretor;
import entities.Pessoa;
import entities.Secretario;

public class TestandoClassesFilhas {
    public static void main(String[] args) {



        Aluno aluno = new Aluno();
        aluno.setNome("Alex JDev - Treinamento");
        aluno.setNome("Igor");
        aluno.setIdade(17);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("3j3j2444323j44kk");
        diretor.setRegistroEducacao(" 1234");
        diretor.setTitulacao("Bundão");
        diretor.setNome("Afonso");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setExperiencia(" Administração ");
        secretario.setNumeroCPF(" 4j2j239444jjn ");
        secretario.setNome(" Lari ");
        secretario.setIdade(26);

        

        System.out.println(aluno);
        System.out.println("=====================================");
        System.out.println(diretor + diretor.getRegistroEducacao());
        System.out.println("=====================================");
        System.out.println(secretario);
        System.out.println("=====================================");

        System.out.println(aluno.pessoaMaiorDeIdade() +" -> " + aluno.msgMaiorIdade());
        System.out.println("Registro Educação "+ diretor.getRegistroEducacao() + diretor.pessoaMaiorDeIdade());
        System.out.println(secretario.pessoaMaiorDeIdade());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Salario Diretor = "+ diretor.salario());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Salario Aluno = "+ aluno.salario());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Salario Secretario = " +  secretario.salario());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        teste(aluno);
        teste(secretario);
        teste(diretor);

        
    }

    public static void teste(Pessoa pessoa){
        System.out.println("Essa Pessoa é demais = " + pessoa.getNome() + " e o salario " + pessoa.salario());
    }
    
}
