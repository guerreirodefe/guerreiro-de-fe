/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixa.eletrônico;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CaixaEletrônico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = new Conta();
        Boolean deucerto;
        
        c.abrirconta("Daniel","123456","7690000");
        
        deucerto = c.depositar(13.0);
        
        if(deucerto == true)
        {
            JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
        }
        else {
            JOptionPane.showMessageDialog(null, "Deposito não realizado");
        }
                
    }
    
}
