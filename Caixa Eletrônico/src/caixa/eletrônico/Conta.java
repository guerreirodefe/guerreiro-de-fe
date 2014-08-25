/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixa.eletrônico;

/**
 *
 * @author Aluno
 */
public class Conta {
    
    String agencia,conta,correntista;
    Double saldo;
    Boolean ativa;
    
    
    void abrirconta (String ag, String cont, String correntist)
    {
       agencia = ag;
       conta = cont;
       correntista = correntist;
       
      saldo = 0.0;
      ativa = true;
    
    }
    
    Boolean sacar (Double valor)
    {
        return false;
    }
    
    Boolean depositar (Double valor)
    {
        return false;
    }
    
   
    
}
