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
public class Bebida extends Produto {
    
 
    private Double unidademedida ;
    private Integer  qtd ;

   

    public Double getUnidademedida() {
        return unidademedida;
    }

    public void setUnidademedida(Double unidademedida) {
        this.unidademedida = unidademedida;
    }

    

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
    
    
    
    public String Cardapio () {
    
    return super.descricaoCardapio() + this.getQtd() + ".."+this.getUnidademedida();
    
    }
    
}
