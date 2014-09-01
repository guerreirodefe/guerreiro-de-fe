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
public class Banco {
    
    String nome, numero;
    Boolean emprestimo;
    Boolean emprestcar;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Boolean isEmprestcar() {
        return emprestcar;
    }

    public void setEmprestcar(Boolean emprestcar) {
        this.emprestcar = emprestcar;
    }
    
    
    
}
