package exemplointerface;

public class Emissora {
    private String nomemis, endemis;
    private boolean tv;  
    
    Emissora()
    {
        nomemis = null;
        endemis = null;
        tv = false;
    }
    public String getNomemis() {
        return nomemis;
    }

    public void setNomemis(String nomemis) {
        this.nomemis = nomemis;
    }

    public String getEndemis() {
        return endemis;
    }

    public void setEndemis(String endemis) {
        this.endemis = endemis;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }
    
    
}
