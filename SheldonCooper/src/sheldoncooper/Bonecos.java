/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheldoncooper;

/**
 *
 * @author Aluno
 */
public class Bonecos {
    
    private String nome,editora,datap,poder;
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDatap() {
        return datap;
    }

    public void setDatap(String datap) {
        this.datap = datap;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
    
     public String descricaoBonecos ()
    {
        String retorno;
        retorno =  nome + " - " + editora ;
        return retorno;
    }
    
}
