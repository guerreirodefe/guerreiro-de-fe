/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package orientacaoobj;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    //atributos
    Integer a;
    Integer b;
    
    //metodos
    void atribuirA(Integer valor)
    {
     a = valor;
    }
    
    void atribuirB(Integer valor)
    {
     b = valor;
    }
    
    Integer somar()
    {
     return a + b;
    }
}
