/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplointerface;

/**
 *
 * @author marcelosiedler
 */
public class ExemploInterface10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Novela novela = new Novela();
        
        novela.setAutor("Manoel Carlos");
        //Montar a emissora
        Emissora emissora = new Emissora();
        emissora.setNomemis("Globo");
        emissora.setEndemis("Rua aaa");
        emissora.setTv(true);
        //Passando a emissora ao objeto
        novela.setEmissora(emissora);
        
        //exibir os dados da emissora da novela 
        System.out.println(novela.getEmissora().getNomemis());
    }
    
}
