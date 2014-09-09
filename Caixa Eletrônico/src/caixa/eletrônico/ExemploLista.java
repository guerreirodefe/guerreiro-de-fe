/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixa.eletrônico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ExemploLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*List<String> jogadores = new ArrayList<String>();
       jogadores.add("Navalhada");
       jogadores.add("Darzone");
       jogadores.add("Caça rato");
       jogadores.add("Sandro Sotilli");
       jogadores.add("Dudu");
       jogadores.remove(0);
       
        for (int i = 0; i < jogadores.size(); i++) {
           System.out.println(jogadores.get(i));
        }
       
        for (String jog : jogadores) {
            System.out.println(jog);*/
        
        List<Conta> contas = new ArrayList<Conta>();
        
        Conta c = new Conta ();
        c.abrirconta("Marcelo", "222-2", "34566");
        
        contas.add(c);
        c=new Conta ();
         c.abrirconta("Ana", "444", "66666");
         
         contas.add(c);
        
        for(Conta conta : contas){
            System.out.println(conta.getCorrentista());
        }
            
        }
    }
    

