package entities;


import java.util.ArrayList;

import cursojava.constantes.StatusAluno;


public class Aluno extends Pessoa{

    
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    


    public void setDisciplinas(ArrayList<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }

    public ArrayList<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public Aluno(){/**Cria os dados na memoria - Sendo padrão java */

    }
    public Aluno(String nomePadrao){
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao){
        super.nome =  nomePadrao;
        this.idade =  idadePadrao;
    }
    




    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     public String getRegistroGeral() {
        return this.registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }
    

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return this.dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return this.nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return this.serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public double getMediaNotas(){

        double somaNotas = 0.0;
        for(Disciplina disciplina : disciplinas){
            somaNotas += disciplina.getNota();

        }
        return somaNotas / disciplinas.size();
    }

    /*public boolean getMediaAluno(){//getAlunoAprovado
        double media = this.getMediaNotas();
        if(media <= 70.0){
            return true;
        }else{
            return false;
        }*/

        public String getAlunoAprovado(){
            double media = this.getMediaNotas();
            if(media >= 50){
                if(media >= 70){
                    return StatusAluno.APROVADO;
                }else{
                    return StatusAluno.RECUPERACAO;
                }

            }else{
                return StatusAluno.REPROVADO;
            }
        

    }

        @Override
        public String toString() {
            return "Aluno [dataMatricula=" + dataMatricula + ", disciplinas=" + disciplinas + ", nomeEscola="
                    + nomeEscola + ", serieMatriculado=" + serieMatriculado + "]";
        }

    
        public boolean pessoaMaiorDeIdade() {
            // TODO Auto-generated method stub
            return idade >= 21;
        }

        public String msgMaiorIdade(){
            return this.pessoaMaiorDeIdade()? "Obaa Aluno é maior de idade": "Ixii Aluno é menor de idade ";
        }

        public double salario(){
            return 1500.00;
        }

    
    
    }



  
    
 
