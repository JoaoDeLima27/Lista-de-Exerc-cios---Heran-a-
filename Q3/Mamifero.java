package Q3;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidade, String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + getNome() + ", comprimento=" + getComprimento() + ", numPatas=" + getNumPatas() + ", cor=" + getCor()
                + ", ambiente=" + getAmbiente() + ", velocidade=" + getVelocidade() + ", alimento" + getAlimento() + "]";
    }
}
