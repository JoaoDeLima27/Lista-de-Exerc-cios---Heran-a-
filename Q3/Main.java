package Q3;

public class Main {
    public static void main(String args[]) {
        Animal camelo = new Animal("Camelo", 150, 4, "amarelo", "terra", 2);
        System.out.println(camelo.toString());

        Peixe tubarao = new Peixe("Tubarão", 5, 0, "Cinza", "Mar", 10, "Barbatanas");
        System.out.println(tubarao.toString());

        Mamifero urso = new Mamifero("Urso", 2, 4, "Marrom", "Floresta", 3, "Mel");
        System.out.println(urso.toString());
    }
}
