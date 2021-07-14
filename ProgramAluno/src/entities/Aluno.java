package entities;

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

    private Disciplinas disciplina = new Disciplinas();

    public void setDisciplinas(Disciplinas disciplinas) {
        this.disciplina = disciplinas;
    }
    public Disciplinas getDisciplinas() {
        return disciplina;
    }


    public Aluno() {
    }

    public Aluno(String nome, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae, String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.registroGeral = registroGeral;
        this.numeroCpf = numeroCpf;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataMatricula = dataMatricula;
        this.nomeEscola = nomeEscola;
        this.serieMatriculado = serieMatriculado;


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

    public Double getMediaNotas(){
        return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;
    }

    public boolean getMediaAluno(){
        double media = this.getMediaNotas();
        if(media <= 70.0){
            return true;
        }else{
            return false;
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
            ", disciplina='" + getDisciplinas() + "'" +
            "}";
    }
    
    }



  
    
 
