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
public class Vilao extends Bonecos{
    
    private String inimigo;

    public String getInimigo() {
        return inimigo;
    }

    public void setInimigo(String inimigo) {
        this.inimigo = inimigo;
    }
    
    public String descricaoBonecos() 
    {
    String retorno;
    retorno = super.descricaoBonecos() + "-" + this.getInimigo();
    return retorno;
}
    
}
