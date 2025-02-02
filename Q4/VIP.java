package Q4;

public class VIP extends Ingresso{
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double valorVIP() {
        return getValor() + adicional;
    }
}
