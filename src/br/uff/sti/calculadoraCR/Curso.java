package br.uff.sti.calculadoraCR;

import java.util.ArrayList;

/* @author Luam */
public class Curso implements possuiMediaCRs {
    private int codCurso;
    public ArrayList<Aluno> alunos = new ArrayList();
    protected float somaCRs;
    public float mediaCRCurso;

    public Curso(int codCurso) {
        this.codCurso = codCurso;
    }
    
  
    @Override
    public void calcularMediaCurso(){
        for (Aluno aluno: alunos){
            this.somaCRs = this.somaCRs + aluno.cr;
        }
        this.mediaCRCurso = somaCRs/alunos.size();
    }

    @Override
    public void calcularMediaCRs() {
         for (Aluno aluno: alunos){
            this.somaCRs = this.somaCRs + aluno.cr;
        }
        this.mediaCRCurso = somaCRs/alunos.size();
    }

    public void imprimirMediaCRs() {
       System.out.printf("%d - %.0f \n", this.codCurso, this.mediaCRCurso); 
    }
    
}
