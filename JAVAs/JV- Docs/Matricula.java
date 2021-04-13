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
public class Matricula {
    private List<String> lista;
    private String parBusca;
    private Integer type;
    List<String> listaEstudante = new ArrayList<String>();
    List<String> listaDisciplina = new ArrayList<String>();
    Matricula(List<String> lista, String parBusca, Integer type){
        this.lista = lista;
        this.parBusca = parBusca;
        this.type = type;
        for(int i = 0; i < this.lista.size(); i++){
            if(this.lista.get(i).equals(this.parBusca) && this.type == 2){
                listaEstudante.add(this.lista.get(i-1));
            }
            else if(this.lista.get(i).equals(this.parBusca) && this.type == 1){
                listaDisciplina.add(this.lista.get(i+1));
            }
        }
    }
}


