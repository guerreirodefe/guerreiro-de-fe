/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheldoncooper;

/**
 *
 * @author Daniel Bandeira
 */
public class Heroi extends Bonecos 
{
    
 private Boolean favorito;
 private String alterego;

    public Boolean isFavorito() {
        
        
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }

    public String getAlterego() {
        return alterego;
    }

    public void setAlterego(String alterego) {
        this.alterego = alterego;
    }
 
    
    public String descricaoBonecos()
    {
        String retorno;
    if(favorito == true ){
        retorno = (super.descricaoBonecos() + " - " +this.alterego  + " - " +"BAZINGAAA");
    }
        else
        {
                retorno = (super.descricaoBonecos()  +"-"+ this.alterego );
         }  
     return retorno;
    }
   
} 
    
    

