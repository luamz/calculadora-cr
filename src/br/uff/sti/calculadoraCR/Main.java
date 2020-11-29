package br.uff.sti.calculadoraCR;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* @author Luam */


public class Main {
    
    public static void main(String[] args){
        Map<Integer, Aluno> mapaAlunos = leitorCSV();
        for (Map.Entry<Integer,Aluno> aluno : mapaAlunos.entrySet()) {
            Aluno a= aluno.getValue();
            a.calcularCR();
            a.imprimirAluno();
        }
   }
 
    
    public static Map<Integer, Aluno> leitorCSV() {
        BufferedReader br = null;
        String linha = "";
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();
        
        try {

            br = new BufferedReader(new FileReader("notas.csv"));
            br.readLine();
            
            while ((linha = br.readLine()) != null) {
                
                String[] aluno = linha.split(",");
                if (mapaAlunos.containsKey(Integer.parseInt(aluno[0]))){
                    Aluno a = mapaAlunos.get(Integer.parseInt(aluno[0]));
                    a.historico.add(new Disciplina(aluno[1], Integer.parseInt(aluno[3]),
                            Integer.parseInt(aluno[4]), Integer.parseInt(aluno[5])));
                    mapaAlunos.replace(Integer.parseInt(aluno[0]), a);
                }                
                else{
                    Aluno novo = new Aluno(Integer.parseInt(aluno[0]),Integer.parseInt(aluno[2]));
                    novo.historico.add(new Disciplina(aluno[1], Integer.parseInt(aluno[3]),
                            Integer.parseInt(aluno[4]), Integer.parseInt(aluno[5])));
                    mapaAlunos.put(Integer.parseInt(aluno[0]), novo);
                }
            }
            return mapaAlunos;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }   
        }
        return null;
      }
}