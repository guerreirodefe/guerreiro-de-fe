/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheldoncooper;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Bandeira
 */
public class Filme {
    
    private String nome;
    
    List <Bonecos> personagens = new ArrayList <Bonecos>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    public String listarTodos()
    {
        String saida ;
        saida = "Filme: " + nome + "\n"+"Personagens:\n";
        
        for (Bonecos boneco : personagens){
            saida = saida + boneco.descricaoBonecos() + "\n";
        }
        
        return saida;
    }
    
}
