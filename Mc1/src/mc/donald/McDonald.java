/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mc.donald;

/**
 *
 * @author Aluno
 */
public class McDonald {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cardapioo cardapio = new Cardapioo();
        Batatafrita bf = new Batatafrita();
        bf.setNome("Feliz");
        bf.setPreco(3.50);
        bf.setTamanho("Pequena");
        Bebida beb = new Bebida();
        beb.setNome("Coca");
        beb.setPreco(5.0);
        beb.setQtd(1);
        beb.setUnidademedida(2.0);
        Hamburguer h = new Hamburguer();
        h.setNome("fish");
        h.setPreco(7.0);
        h.setNovo(true);
        
        cardapio.getLista().add(bf);
        cardapio.getLista().add(beb);
        cardapio.getLista().add(h);
        
        System.out.println(cardapio.ListarTodos());
    }
    
}
