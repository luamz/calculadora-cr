package br.uff.sti.calculadoraCR;

import java.util.ArrayList;

/* @author Luam */

public class Aluno implements possuiCR{
    int matricula;
    int codCurso;
    ArrayList<Disciplina> historico =  new ArrayList();
    int totalCargaHoraria;
    float mediaHora;
    float cr;

    public Aluno(int matricula, int codCurso) {
        this.matricula = matricula;
        this.codCurso = codCurso;
        this.totalCargaHoraria = 0;
        this.mediaHora = 0;
        this.cr = 0;
    }
    
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
    
    @Override
    public void imprimirAluno(){
        System.out.printf("Aluno com matricula:%s Curso: %s \n", this.matricula, this.codCurso);
        System.out.printf("CR: %.2f Disciplinas: \n",this.cr);
        for(Disciplina disciplina: historico){
            disciplina.imprimirDisciplina();
        }
        System.out.println("\n");
    }

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
