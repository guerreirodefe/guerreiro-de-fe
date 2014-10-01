/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringdaniel;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Bandeira
 */
public class StringDaniel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String escalacao = "   Júlio César, D. Alves, D. Luiz, T. Silva, Maxwell, L. Gustavo, Paulinho, Oscar, Neymar, Fred, Hulk   ";
        int num,c ;
        String escalan;
        
        num = escalacao.length();
        System.out.println("Tamnho da string: "+num);
        
        escalacao = escalacao.replace("Fred","Jô");
        System.out.println("Substituição: "+escalacao);
        
        if(escalacao.contains("Ronaldinho"))
        {
            System.out.println("Ronaldinho está no time: Sim");
        }
        else{
            System.out.println("Ronaldinho está no time: Não");
        }
        
        escalan = escalacao.trim();
        System.out.println("Retirada dos espaçamentos:"+escalan);
        
        String[] novo = escalan.split(",");
        
        for(int i = 0; i<novo.length; i++){
            c= i +1;
            
            JOptionPane.showMessageDialog(null, ""+c+"."+novo[i]);
           
        }          
        
        
    
    }
}
