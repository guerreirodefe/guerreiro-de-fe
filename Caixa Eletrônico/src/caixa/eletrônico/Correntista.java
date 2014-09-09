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
public class Correntista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        Cliente c = new Cliente ();
        
        c.setNome("Daniel");
        c.setCpf("0123456");
        clientes.add(c);
        
        c=new Cliente ();
        
        c.setNome("Renan");
        c.setCpf("0123156");
        clientes.add(c);
        
        c=new Cliente ();
        
        c.setNome("Maydana");
        c.setCpf("1326510");
        clientes.add(c);
        
        for (Cliente cliente : clientes){
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());
        }
        
        
    }
    
}
