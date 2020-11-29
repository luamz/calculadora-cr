package br.uff.sti.calculadoraCR;

import java.util.ArrayList;

/* @author Luam */

public class Aluno implements possuiCR{
    protected int matricula;
    protected int codCurso;
    protected ArrayList<Disciplina> historico =  new ArrayList();
    protected int totalCargaHoraria;
    protected float mediaHora;
    protected float cr;

    public Aluno(int matricula, int codCurso) {
        this.matricula = matricula;
        this.codCurso = codCurso;
        this.totalCargaHoraria = 0;
        this.mediaHora = 0;
        this.cr = 0;
    }
    
    // Implementação dos métodos da interface
    @Override
    public void calcularCR(){
        for (Disciplina disciplina : historico){
            this.mediaHora = this.mediaHora + disciplina.getMedia();
            this.totalCargaHoraria = this.totalCargaHoraria + disciplina.getCargaHoraria();
        }
        this.cr = mediaHora/totalCargaHoraria;
    }
    
    @Override
    public void imprimirCR() {
        System.out.printf("%d - %.0f \n", this.matricula, this.cr);
    }
    
    // Getters and Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public ArrayList<Disciplina> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Disciplina> historico) {
        this.historico = historico;
    }

    public int getTotalCargaHoraria() {
        return totalCargaHoraria;
    }

    public void setTotalCargaHoraria(int totalCargaHoraria) {
        this.totalCargaHoraria = totalCargaHoraria;
    }

    
    
    
    
}
