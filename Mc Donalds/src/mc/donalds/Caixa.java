package mc.donalds;

public class Caixa 
{
    private String nome,data_nas,cpf,horario_trab;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nas() {
        return data_nas;
    }

    public void setData_nas(String data_nas) {
        this.data_nas = data_nas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getHorario_trab() {
        return horario_trab;
    }

    public void setHorario_trab(String horario_trab) {
        this.horario_trab = horario_trab;
    }
    
    public Double retornarSalario()
    {
        return 1200.0;
    }
}
