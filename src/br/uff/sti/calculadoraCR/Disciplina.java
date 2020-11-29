package br.uff.sti.calculadoraCR;

/* @author Luam  */
public class Disciplina {
    protected String codDisciplina;
    protected float nota;
    protected int cargaHoraria;
    protected int anoSemestre;

    public Disciplina(String codDisciplina, float nota, int cargaHoraria, int anoSemestre) {
        this.codDisciplina= codDisciplina;
        this.nota = nota;
        this.cargaHoraria = cargaHoraria;
        this.anoSemestre = anoSemestre;
    }
    
    // Getters and Setters
    public float getMedia(){
        return this.nota*cargaHoraria;
    }

    public String getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(String codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getAnoSemestre() {
        return anoSemestre;
    }

    public void setAnoSemestre(int anoSemestre) {
        this.anoSemestre = anoSemestre;
    }
    
    
}
