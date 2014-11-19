 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mc.donald;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Cardapioo {
    
    List <Produto> lista;

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }
    
    public Cardapioo () {
        
        lista = new ArrayList <Produto> () ;
        
    }
    
    public String ListarTodos () {
        String saida = "";
        
        for (Produto produto : lista){
            saida = saida + produto.descricaoCardapio() + "\n";
        }
        
        return saida;
    }
    
}
