package entities;


// Classe PAI, MASTER, SuperCLass(Atributos comum em todos os Projetos)
public abstract class Pessoa{
    protected String nome;
    protected int idade;
    protected String dateNascimento;
    protected String registroGeral;
    protected String numeroCPF;
    protected String nomePai;
    protected  String nomeMae;
    /*Abstract method is required in the parent class and is required for child classes */
    public abstract double salario();


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDateNascimento() {
        return this.dateNascimento;
    }

    public void setDateNascimento(String dateNascimento) {
        this.dateNascimento = dateNascimento;
    }

    public String getRegistroGeral() {
        return this.registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCPF() {
        return this.numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public boolean pessoaMaiorDeIdade(){
        return idade >= 18;
    }


}