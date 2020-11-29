package br.uff.sti.calculadoraCR;

import java.util.ArrayList;

/* @author Luam */
public class Curso implements possuiMediaCRs {
    private int codCurso;
    public ArrayList<Aluno> alunos = new ArrayList();
    protected float somaCRs;
    protected float mediaCRCurso;

    public Curso(int codCurso) {
        this.codCurso = codCurso;
    }
    
    // Implementação dos métodos da interface
    @Override
    
    public void calcularMediaCRs() {
         for (Aluno aluno: alunos){
            this.somaCRs = this.somaCRs + aluno.cr;
        }
        this.mediaCRCurso = somaCRs/alunos.size();
    }

    @Override
    public void imprimirMediaCRs() {
       System.out.printf("%d - %.0f \n", this.codCurso, this.mediaCRCurso); 
    }
    
    // Getters and setters

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public float getSomaCRs() {
        return somaCRs;
    }

    public void setSomaCRs(float somaCRs) {
        this.somaCRs = somaCRs;
    }

    public float getMediaCRCurso() {
        return mediaCRCurso;
    }

    public void setMediaCRCurso(float mediaCRCurso) {
        this.mediaCRCurso = mediaCRCurso;
    }
    
}
