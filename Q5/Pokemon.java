package Q5;

public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;
    private int hp;
    private String status;

    public static final String DORMINDO = "Dormindo";
    public static final String PARALISADO = "Paralisado";
    public static final String CONFUSO = "Confuso";
    public static final String QUEIMADO = "Queimado";
    public static final String ENVENENADO = "Envenenado";
    public static final String NORMAL = "Normal";

    public static final String TIPO_NORMAL = "Normal";
    public static final String TIPO_FOGO = "Fogo";
    public static final String TIPO_AGUA = "Água";
    public static final String TIPO_GRAMA = "Grama";
    public static final String TIPO_VOADOR = "Voador";
    public static final String TIPO_LUTADOR = "Lutador";
    public static final String TIPO_VENENO = "Veneno";
    public static final String TIPO_ELETRICO = "Elétrico";
    public static final String TIPO_TERRA = "Terra";
    public static final String TIPO_PEDRA = "Pedra";
    public static final String TIPO_PSIQUICO = "Psíquico";
    public static final String TIPO_GELO = "Gelo";
    public static final String TIPO_INSETO = "Inseto";
    public static final String TIPO_FANTASMA = "Fantasma";
    public static final String TIPO_FERRO = "Ferro";
    public static final String TIPO_DRAGAO = "Dragão";
    public static final String TIPO_SOMBRIO = "Sombrio";
    public static final String TIPO_FADA = "Fada";

    public Pokemon(String nome, String tipo, int nivel, int hp) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.hp = hp;
        this.status = NORMAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nível: " + nivel);
        System.out.println("HP: " + hp);
        System.out.println("Status: " + status);
    }
}
