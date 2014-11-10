package mc.donalds;

import java.util.ArrayList;
import java.util.List;

public class Filial 
{
    
    private String cidade;
    private List <Caixa> caixas;
    private Gerente gerente;
    private List <Cozinheiro> cozinheiros;
    private Double preco_medio_lanches,faturamento;
    private Integer qtde_vendida;
    
    Filial()
    {
          cozinheiros = new ArrayList<Cozinheiro>(); 
          caixas = new ArrayList<Caixa>();
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

  

    public Double getPreco_medio_lanches() {
        return preco_medio_lanches;
    }

    public void setPreco_medio_lanches(Double preco_medio_lanches) {
        this.preco_medio_lanches = preco_medio_lanches;
    }

    public Integer getQtde_vendida() {
        return qtde_vendida;
    }

    public void setQtde_vendida(Integer qtde_vendida) {
        this.qtde_vendida = qtde_vendida;
    }

    public List<Caixa> getCaixas() {
        return caixas;
    }

    public void setCaixas(List<Caixa> caixas) {
        this.caixas = caixas;
    }

    public List<Cozinheiro> getCozinheiros() {
        return cozinheiros;
    }

    public void setCozinheiros(List<Cozinheiro> cozinheiros) {
        this.cozinheiros = cozinheiros;
    }
    
    public Double faturamento_medio()
    {
        faturamento = preco_medio_lanches *qtde_vendida; 
        return faturamento;
    }
    
    
}
