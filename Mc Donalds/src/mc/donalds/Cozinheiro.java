package mc.donalds;

public class Cozinheiro 
{
    private String nome,data_nas,cpf,turno_traba;

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

    public String getTurno_traba() {
        return turno_traba;
    }

    public void setTurno_traba(String turno_traba) {
        this.turno_traba = turno_traba;
    }
    
    public Double retonarSalario()
    {
        if (turno_traba.equals ("Noturno") )
        {
           return 1700.0; 
        }
        else{
            return 1300.0;
        }
    }
    
}
