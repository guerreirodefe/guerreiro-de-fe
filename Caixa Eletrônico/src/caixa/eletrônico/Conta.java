/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixa.eletrônico;

/**
 *
 * @author Aluno
 */
public class Conta {
    
    private String agencia,conta,correntista;
    private Double saldo;
    private Boolean ativa;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public Boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
    
    public void abrirconta (String ag, String cont, String correntist)
    {
       agencia = ag;
       conta = cont;
       correntista = correntist;
       
      saldo = 0.0;
      ativa = true;
    
    }
    
    Boolean sacar (Double valor)
    {
        Boolean retorno = false;
        if(ativa == true)
        {
            if(valor<=saldo)
            {
                saldo = saldo - valor;
                retorno = true;
            }
            else{
                retorno = false;
            }
        }
        else{
        return false;
        }
       return retorno;
    }
    
    Boolean depositar (Double valor)
    {
        Boolean retorno = null;
        if(ativa == true)
        {
            saldo = saldo + valor;
            retorno = true;
        }
        else{
            retorno = false;
        }
        return retorno;
    }
    
    void fecharConta()
    {
        ativa = false;
    }
    Boolean retornarFecharConta ()
    {
        return ativa;
    }
    
    
   
    
}
