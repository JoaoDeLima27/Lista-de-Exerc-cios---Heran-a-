package Q5;

public class Main {
    public static void main(String[] args) {
        // Criando um Pikachu
        Pikachu pikachu = new Pikachu("Pikachu", 10, 100);
        pikachu.exibirInfo();

        Pokemon Bulbasauro = new Pokemon("Bulbasauro", Pokemon.TIPO_GRAMA, 10, 100);
        Bulbasauro.exibirInfo();
    }
}
