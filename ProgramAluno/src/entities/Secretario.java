package entities;

import interfaces.PermitirAcesso;

public class Secretario  extends Pessoa implements PermitirAcesso{

    private String registro;
    private String nivelCargo;
    private String experiencia;

    private String login;
    private String senha;


    public Secretario() {
    }
    public Secretario( String login, String senha) {
        this.login = login;
        this.senha = senha;
    }



    public Secretario(String registro, String nivelCargo, String experiencia) {
        this.registro = registro;
        this.nivelCargo = nivelCargo;
        this.experiencia = experiencia;
    }
    


    public String getRegistro() {
        return this.registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return this.nivelCargo;
    }


    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }



    @Override
    public String toString() {
        return "Secretario [experiencia=" + experiencia + ", nivelCargo=" + nivelCargo + ", registro=" + registro + "]";
    }

    public double salario(){
        return 1800.00;
    }

    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return autenticar();
    }

    @Override
    public boolean autenticar(){
        return login.equals("admin") && senha.equals("admin");
    }



    

    
    

    
}
