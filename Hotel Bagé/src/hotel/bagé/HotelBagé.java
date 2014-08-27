/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel.bagé;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Bandeira
 */
public class HotelBagé {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nome,loc,dia;
        Float diaria,total;
        Integer telefone,ano;
        Hotel h = new Hotel ();
        
        nome = JOptionPane.showInputDialog("Digite o nome do Hotel: ");
        h.atribuirnome(nome);
        
        loc = JOptionPane.showInputDialog("Digite a localização do Hotel: ");
        h.atribuirloc(loc);
        
        diaria = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da diaria do Hotel: "));
        h.atribuirvalor(diaria);
        
        telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do Hotel: "));
        h.atribuirtelefone(telefone);
        
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que o hotel foi fundado: "));
        h.atribuirano(ano);
        
        JOptionPane.showMessageDialog(null,"   Informações do hotel:   \n"+" Nome do hotel: "+ nome +"\n Localização do hotel: "+loc+"\n Valor da diaria: "+diaria+" R$"+"\n Telefone do hotel: "+telefone+"\n Ano de fundação: "+ ano);
        
        dia = JOptionPane.showInputDialog("Digite quantos dias pretende ficar");
        total=h.preco(dia);
        
        JOptionPane.showMessageDialog(null,"          Preço total das diarias:         \n Em dolares: "+(total * 2) + "\n Em euro: "+ (total * 3));
    }
    
}
