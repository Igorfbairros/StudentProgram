package cursojava.executavel;

import entities.Aluno;
import entities.Diretor;
import entities.Secretario;

public class TestandoClassesFilhas {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Alex JDev - Treinamento");

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("3j3j2444323j44kk");

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCPF("4j2j239444jjn");

        System.out.println(aluno);
        System.out.println("=====================================");
        System.out.println(diretor);
        System.out.println("=====================================");
        System.out.println(secretario);
        System.out.println("=====================================");
    }
    
}
