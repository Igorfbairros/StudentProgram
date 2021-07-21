package entities;


/*Essa classe Disciplina servirá para todos os objetos e instancias de notas e materias */
public class Disciplina {

    private double nota;
    private String disciplina;


    public Disciplina(double nota, String disciplina) {
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


    public Disciplina() {
    }

    public Disciplina nota(double nota) {
        setNota(nota);
        return this;
    }

    public Disciplina disciplina(String disciplina) {
        setDisciplina(disciplina);
        return this;
    }
    

    @Override
    public String toString() {
        return "{" +
            " nota='" + getNota() + "'" +
            ", disciplina='" + getDisciplina() + "'" +
            "}";
    }
    

}
