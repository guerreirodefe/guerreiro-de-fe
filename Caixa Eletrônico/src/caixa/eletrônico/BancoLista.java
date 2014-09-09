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
public class BancoLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Banco> bancos = new ArrayList<Banco>();
       
       Banco b = new Banco ();
       
       b.setNome("Itau");
       b.setNumero("012345");
       bancos.add(b);
       
       b=new Banco();
       
       b.setNome("Bradesco");
       b.setNumero("123456");
       bancos. add(b);
       
        for (Banco banco : bancos){
            System.out.println(banco.getNome());
            System.out.println(banco.getNumero());
        }
       
    }
    
}
