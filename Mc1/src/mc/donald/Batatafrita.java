/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mc.donald;

/**
 *
 * @author Daniel Bandeira
 */
public class Batatafrita extends Produto{
    
    private String tamanho  ;
   
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    
    public String Cardapio(){
        return super.descricaoCardapio() +  " " + this.getTamanho() ;
    }
    
}
