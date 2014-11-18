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
public class Mcoferta extends Produto{
    
    
    Hamburguer hamburger ; 
    Batatafrita batata ; 
    Bebida bebida ;
    
    public Hamburguer getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburguer hamburger) {
        this.hamburger = hamburger;
    }

    public Batatafrita getBatata() {
        return batata;
    }

    public void setBatata(Batatafrita batata) {
        this.batata = batata;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }


   
      public Double valorEconomia (){
        return (this.batata.getPreco() + this.bebida.getPreco() +  this.hamburger.getPreco()) - this.getPreco(); 
    }
    
    public String descricaoOferta (){
        
        return this.batata.getNome() + " " + this.batata.getTamanho() + "\n" + this.bebida.getNome()+" "+ this.bebida.getQtd()+""+this.bebida.getUnidademedida()+" \n"+this.hamburger.getNome();
        
    }
    
  
}
