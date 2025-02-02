package Q4;

public class CamaroteSuperior extends VIP {
    public CamaroteSuperior(double valor, double adicional) {
        super(valor, adicional);
    }

    public double valorIngresso() {
        return valorVIP();
    }
}
