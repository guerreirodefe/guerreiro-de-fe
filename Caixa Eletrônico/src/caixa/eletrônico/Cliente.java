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
public class Cliente {
    
    String cpf,nome,endereco,data;
    Boolean negativadospc;
    Boolean negaticadoserasa;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean isNegativadospc() {
        return negativadospc;
    }

    public void setNegativadospc(Boolean negativadospc) {
        this.negativadospc = negativadospc;
    }

    public Boolean isNegaticadoserasa() {
        return negaticadoserasa;
    }

    public void setNegaticadoserasa(Boolean negaticadoserasa) {
        this.negaticadoserasa = negaticadoserasa;
    }
    
    
    
}
