package entities;

import java.util.ArrayList;


public class Aluno{

    private String nome;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
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




    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return this.registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return this.numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
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
                    return "Aluno está Aprovado";
                }else{
                    return "Aluno está em Recuperação";
                }

            }else{
                return "Aluno está reprovado";
            }
        

    }



    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            ", registroGeral='" + getRegistroGeral() + "'" +
            ", numeroCpf='" + getNumeroCpf() + "'" +
            ", nomeMae='" + getNomeMae() + "'" +
            ", nomePai='" + getNomePai() + "'" +
            ", dataMatricula='" + getDataMatricula() + "'" +
            ", nomeEscola='" + getNomeEscola() + "'" +
            ", serieMatriculado='" + getSerieMatriculado() + "'" +
            ", disciplina='" + "'" +
            "}";
    }
    
    }



  
    
 
