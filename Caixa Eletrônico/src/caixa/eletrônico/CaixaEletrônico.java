/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixa.eletrônico;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CaixaEletrônico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = new Conta();
        Banco b = new Banco();
        
        Boolean deucerto;
        String nome,numero,imovel,carro,eimovel,ecarro;
        
        c.abrirconta("Daniel","123456","7690000");
        
        deucerto = c.depositar(13.0);
        
        if(deucerto == true)
        {
            JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
        }
        else {
            JOptionPane.showMessageDialog(null, "Deposito não realizado");
        }
        
        deucerto = c.sacar(5.0);
        if (deucerto==true)
        {
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
        }
        else{
            JOptionPane.showMessageDialog(null, "Saque não realizado");
        }
       
        
       nome=JOptionPane.showInputDialog("Digite o nome do banco: ");
       b.setNome(nome);
       
       numero=JOptionPane.showInputDialog("Digite o numero do banco: ");
       b.setNumero(numero);
       
       imovel = JOptionPane.showInputDialog("Oferece emprestimo imovel(S/N):");
       
       if(imovel.equals("S")){
           b.setEmprestimo(true);
       }
       else{
           b.setEmprestimo(false);
       }
       
       if(b.isEmprestimo()==true){
           eimovel = "Sim";
       }
       else{
           eimovel = "Não";
       }
       
       carro = JOptionPane.showInputDialog("Oferece emprestimo carro(S/N):");
       
       if(carro.equals("S")){
          b.setEmprestcar(true);
       }
       else{
           b.setEmprestcar(false);
       }
       
       if(b.isEmprestcar()==true){
          ecarro = "Sim";
       }
       else{
           ecarro = "Não";
           
           JOptionPane.showMessageDialog(null, "Nome do banco: "+b.getNome()+ "\n Numero do banco: "+b.getNumero()+"\n Emprestimo imovel: "+eimovel+"\n Empresta carro: "+ecarro);
       }
    }
    
}
