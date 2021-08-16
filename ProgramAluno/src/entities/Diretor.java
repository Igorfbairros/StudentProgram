package entities;
public class Diretor extends Pessoa{

    private String registroEducacao;
    private int tempoDirecão;
    private String Titulacao;


    public Diretor(String registroEducacao, int tempoDirecão, String Titulacao) {
        this.registroEducacao = registroEducacao;
        this.tempoDirecão = tempoDirecão;
        this.Titulacao = Titulacao;
    }

    public Diretor() {
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

   




}