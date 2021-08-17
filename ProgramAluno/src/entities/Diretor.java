package entities;

import interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{

    private String registroEducacao;
    private int tempoDirecão;
    private String Titulacao;

    private String login;
    private String senha;

    public Diretor(String login, String senha){
        this.login = login;
        this.senha = senha;

    }

    public Diretor(){
    }


    public Diretor(String registroEducacao, int tempoDirecão, String Titulacao) {
        this.registroEducacao = registroEducacao;
        this.tempoDirecão = tempoDirecão;
        this.Titulacao = Titulacao;
    }
    public String getRegistroEducacao() {
        return this.registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecão() {
        return this.tempoDirecão;
    }

    public void setTempoDirecão(int tempoDirecão) {
        this.tempoDirecão = tempoDirecão;
    }

    public String getTitulacao() {
        return this.Titulacao;
    }

    public void setTitulacao(String Titulacao) {
        this.Titulacao = Titulacao;
    }

    @Override
    public String toString() {
        return "Diretor [Titulacao=" + Titulacao + ", registroEducacao=" + registroEducacao + ", tempoDirecão="
                + tempoDirecão + "]";
    }

    public double salario(){
        return 3900.78;
    }

    @Override
    public boolean autenticar(String login, String senha){
        this.login = login;
        this.senha = senha;
        return autenticar();
    }

    @Override
    public boolean autenticar(){
        return login.equals("admin") && senha.equals("123");
    }

   




}