/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_v1;

import java.util.Scanner;

/**
 *
 * @author patyf
 */
public class GestaoAcademicaApp1 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("==================");
        System.out.println("(1) Listar os números e nomes de todos os estudantes.");
        System.out.println("(2) Listar os códigos de todas as disciplinas.");
        System.out.println("(3) Listar todas as informações	dos estudantes matriculados em uma determinada disciplina.");
        System.out.println("(4) Listar todas as informações das disciplinas em que um determinado estudante está matriculado.");
        int escolha = entrada.nextInt();
        int e = 1, d = 1;
        System.out.println(""); 
        switch(escolha){
            case 1: 
                Centro_Universitario dados_1 = new Centro_Universitario("");
                System.out.println("LISTA DE TODOS OS ESTUDANTES");
                System.out.println("=============================");
                for (int i=0; i<dados_1.estudantes.size(); i=i+3){
                    System.out.println("Estudante "+e+": ");
                    System.out.println("   NOME: "+dados_1.estudantes.get(i+1).toString());
                    System.out.println("   NÚMERO: "+dados_1.estudantes.get(i).toString()); 
                    System.out.println(""); 
                    e++;
                }
                break;
            case 2: 
                Centro_Universitario dados_2 = new Centro_Universitario("");
                System.out.println("LISTA DE CÓDIGOS DE TODAS AS DISCIPLINAS");
                System.out.println("=========================================");
                for (int i=0; i<dados_2.disciplinas.size(); i=i+2){
                    System.out.println("Disciplina "+d+": "+dados_2.disciplinas.get(i).toString());
                    System.out.println(""); 
                    d++;
                }
                break;
            case 3: 
                System.out.println("Forneça o Código da Disciplina:");
                String codigo = entrada.next();
                Disciplina materia = new Disciplina(codigo);
                break;
            case 4:  
                System.out.println("Forneça o Número do Aluno:");
                long aluno = entrada.nextInt();
                Estudante pessoa = new Estudante(aluno);
                break;
            default: System.out.println("Opção inválida!"); break;
        }
    }
}    

