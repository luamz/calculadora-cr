package br.uff.sti.calculadoraCR;

import static br.uff.sti.calculadoraCR.Main.gerarMapaCursos;
import static br.uff.sti.calculadoraCR.Main.leitorCSV;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/* @author Luam */

public class MainTest {   
 
    /* Test of leitorCSV method, of class Main. */
    @Test
    public void testLeitorCSV() {
        Map<Integer, Aluno> mapaAlunos = leitorCSV();
        assertTrue(mapaAlunos!=null);
    }

    /* Test of gerarMapaCursos method, of class Main. */
    @Test
    public void testGerarMapaCursos() {
        Map<Integer, Aluno> mapaAlunos = leitorCSV();
        Map<Integer, Curso> mapaCursos  = gerarMapaCursos(mapaAlunos);
        assertTrue(mapaCursos!=null);
    }
    
}
