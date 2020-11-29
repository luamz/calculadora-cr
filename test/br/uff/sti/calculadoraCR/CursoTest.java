
package br.uff.sti.calculadoraCR;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/* @author Luam */

public class CursoTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final ByteArrayOutputStream err = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    
    @Before
    public void setStreams() {
        System.setOut(new PrintStream(out));
        System.setErr(new PrintStream(err));
    }

    @After
    public void restoreInitialStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    /* Test of calcularMediaCRs method, of class Curso. */
    @Test
    public void testCalcularMediaCRs() {
        Aluno a = new Aluno(100,4);
        Disciplina d = new Disciplina("SEN00209",82, 60, 20171);
        ArrayList<Disciplina> historico =  new ArrayList(Arrays.asList(d));
        a.setHistorico(historico);
        a.calcularCR();
        
        Curso c = new Curso(4);
        c.alunos.add(a);
        c.calcularMediaCRs();
        assertEquals(82f,c.mediaCRCurso,0);
        
    }

    /* Test of imprimirMediaCRs method, of class Curso. */
    @Test
    public void testImprimirMediaCRs() {
        Aluno a = new Aluno(100,4);
        Disciplina d = new Disciplina("SEN00209",82, 60, 20171);
        ArrayList<Disciplina> historico =  new ArrayList(Arrays.asList(d));
        a.setHistorico(historico);
        a.calcularCR();
        
        Curso c = new Curso(4);
        c.alunos.add(a);
        c.calcularMediaCRs();
        c.imprimirMediaCRs();
        assertEquals( "4 - 82 \n",out.toString());
    }

   
}
