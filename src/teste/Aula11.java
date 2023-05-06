package teste;


import vetores.Lista;

public class Aula11 {

    public static void main(String[] args) {

        Lista<String> vetor = new Lista<>(5);
        vetor.adiciona("Thallys");
        vetor.adiciona("Ronald");
        System.out.println(vetor);
    }
}
