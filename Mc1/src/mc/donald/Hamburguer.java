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
public class Hamburguer extends Produto{
 
    private boolean novo;

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }
     
    public String Cardapio(){
        if (novo==true )
        {
        return super.descricaoCardapio() +  " NOVO!!!";
        
    }
        else {
            return super.descricaoCardapio() + "ANTIGOOO !!!" ;
    
        }
    }
    
}
