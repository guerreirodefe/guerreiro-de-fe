/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package danielpessoa;

import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author Aluno
 */
public class DanielPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pessoa pessoa = new Pessoa();
        
        //Tratamento de erros inesperados
        while(pessoa.getCodigo()== null)
        {
        try
        {
            // aqui é o que estou executando
             pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código: ")));
        }
        catch(Exception ex)
        {
            // aqui é o que quero fazer quando der 
            
            JOptionPane.showMessageDialog(null, "É NUMERO O CÓDIGO");
        }
        }
       
        pessoa.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        pessoa.setSexo(JOptionPane.showInputDialog("Digite o sexo: "));
        
        //AGORA EXIBIR NA TELA
        
        JOptionPane.showMessageDialog(null, pessoa.getCodigo()+ "\n" +
                                            pessoa.getNome()+"\n"+
                                            pessoa.getSexo());
        
    }
    
}
