package entities;

public class Disciplinas {

    private double nota;
    private String disciplina;


    public Disciplinas(double nota, String disciplina) {
        this.nota = nota;
        this.disciplina = disciplina;
    }

    

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    

}
