package Q3;

public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidade, String caracteristica){
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + getNome() + ", comprimento=" + getComprimento() + ", numPatas=" + getNumPatas() + ", cor=" + getCor()
                + ", ambiente=" + getAmbiente() + ", velocidade=" + getVelocidade() + ", Caracteristica" + getCaracteristica() + "]";
    }
}