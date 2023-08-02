public class Endereco {
    private String rua;
    private String bairro;
    private int numCasa;


    public Endereco (){}
    public Endereco(String rua, String bairro, int numCasa) {
        this.rua = rua;
        this.bairro = bairro;
        this.numCasa = numCasa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }
}