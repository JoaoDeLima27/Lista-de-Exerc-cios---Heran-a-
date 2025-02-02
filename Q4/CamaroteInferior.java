package Q4;

public class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double adicional, String localizacao) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização: " + localizacao);
    }
}