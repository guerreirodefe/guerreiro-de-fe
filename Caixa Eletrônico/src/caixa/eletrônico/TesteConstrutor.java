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
public class TesteConstrutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = new Conta();
        
        System.out.println("Agencia " + c.getAgencia());
        System.out.println("Saldo " + c.getSaldo());
        System.out.println("Ativa " + c.isAtiva());
    }
    
}
