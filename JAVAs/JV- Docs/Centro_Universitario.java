/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_v1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patyf
 */
public class Centro_Universitario {
    
    String nome;
    List<String> estudantes = new ArrayList<String>();
    List<String> disciplinas = new ArrayList<String>();
    List<String> matriculas = new ArrayList<String>();
    Centro_Universitario(String nome){
        this.nome = nome;
        String Estudantes = "C:\\Users\\patyf\\OneDrive\\Imagens\\Documentos\\NetBeansProjects\\PO1\\src\\Projeto_v1\\Estudantes.txt";
        String Disciplinas = "C:\\Users\\patyf\\OneDrive\\Imagens\\Documentos\\NetBeansProjects\\PO1\\src\\Projeto_v1\\\\Disciplinas.txt";
        String Matriculas = "C:\\Users\\patyf\\OneDrive\\Imagens\\Documentos\\NetBeansProjects\\PO1\\src\\Projeto_v1\\Matriculas.txt";
        carregaDados(Estudantes, Disciplinas, Matriculas);
    }
    public void carregaDados(String Estudantes, String Disciplinas, String Matriculas){
        try{ 
            String linha;
            FileReader E = new FileReader(Estudantes);
            FileReader D = new FileReader(Disciplinas);
            FileReader M = new FileReader(Matriculas);
            BufferedReader leitor_1 = new BufferedReader(E);
            BufferedReader leitor_2 = new BufferedReader(D);
            BufferedReader leitor_3 = new BufferedReader(M);
            String linhas_E[] = new String[3];
            String linhas_D[] = new String[3];
            String linhas_M[] = new String[3];
            while ((linha = leitor_1.readLine()) != null) {                    
                linhas_E = linha.split(":");
                estudantes.add(linhas_E[0]);
                estudantes.add(linhas_E[1]);
                estudantes.add(linhas_E[2]);
            }
            leitor_1.close(); 
            while ((linha = leitor_2.readLine()) != null) {                    
                linhas_D = linha.split(":");
                disciplinas.add(linhas_D[0]);
                disciplinas.add(linhas_D[1]);
            }
            leitor_2.close();
            while ((linha = leitor_3.readLine()) != null) {                    
                linhas_M = linha.split(":");
                matriculas.add(linhas_M[0]);
                matriculas.add(linhas_M[1]);
            }
            leitor_3.close(); 
        }
        catch (Exception e){
            System.exit(-1);
        }
    }
}
    

