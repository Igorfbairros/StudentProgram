package entities;

public class Secretario  extends Pessoa{

    private String registro;
    private String nivelCargo;
    private String experiencia;


    public Secretario() {
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
    

    
}
