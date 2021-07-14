package entities;

public class Disciplinas {

    private double nota1;
    private String disciplina1;
    private double nota2;
    private String disciplina2;
    private double nota3;
    private String disciplina3;
    private double nota4;
    private String disciplina4;


    public Disciplinas() {
    }

    public Disciplinas(double nota1, String disciplina1, double nota2, String disciplina2, double nota3, String disciplina3, double nota4, String disciplina4) {
        this.nota1 = nota1;
        this.disciplina1 = disciplina1;
        this.nota2 = nota2;
        this.disciplina2 = disciplina2;
        this.nota3 = nota3;
        this.disciplina3 = disciplina3;
        this.nota4 = nota4;
        this.disciplina4 = disciplina4;
    }


    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getDisciplina1() {
        return this.disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getDisciplina2() {
        return this.disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public double getNota3() {
        return this.nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getDisciplina3() {
        return this.disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public double getNota4() {
        return this.nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public String getDisciplina4() {
        return this.disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }

    
    

    @Override
    public String toString() {
        return "{" +
            " nota1='" + getNota1() + "'" +
            ", disciplina1='" + getDisciplina1() + "'" +
            ", nota2='" + getNota2() + "'" +
            ", disciplina2='" + getDisciplina2() + "'" +
            ", nota3='" + getNota3() + "'" +
            ", disciplina3='" + getDisciplina3() + "'" +
            ", nota4='" + getNota4() + "'" +
            ", disciplina4='" + getDisciplina4() + "'" +
            "}";
    }



    
}
