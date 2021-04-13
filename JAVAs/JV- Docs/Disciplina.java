/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_v1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patyf
 */
public class Disciplina {
     String codigo;
    ArrayList<String> Lista = new ArrayList<String>();
    ArrayList<String> Alunos = new ArrayList<String>();
    Disciplina(String codigo){
        this.codigo = codigo;
        addMatricula();
        Matricula listaMat = getEstudantesMatriculados();
        System.out.println("");
        System.out.println("LISTA DE ESTUDANTES MATRICULADOS NA DISCIPLINA "+this.codigo);
        System.out.println("========================================================");
        for(String par : listaMat.listaEstudante){
            for(int i = 0; i < Alunos.size(); i++){
                if(par.equals(Alunos.get(i))){
                    System.out.println("NÚMERO: "+par.toString());
                    System.out.println("NOME: "+Alunos.get(i+1).toString());
                    System.out.println("EMAIL: "+Alunos.get(i+2).toString());
                    System.out.println("");
                }
            }
        }
        System.out.println("Total de Estudantes Matriculados: "+listaMat.listaEstudante.size());
        System.out.println("");
    }
    public void addMatricula(){
        Centro_Universitario dados = new Centro_Universitario("");
        Lista = new ArrayList<String>(dados.matriculas);
        Alunos = new ArrayList<String>(dados.estudantes);
    }
    public Matricula getEstudantesMatriculados(){
        Matricula listaMat = new Matricula(Lista,this.codigo,2);
        return listaMat;
    }
}
    

