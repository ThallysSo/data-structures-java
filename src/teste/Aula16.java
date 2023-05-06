package teste;


import vetores.Pilha;

public class Aula16 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();


        System.out.println(pilha.topo());
        pilha.empilha(2);
        pilha.empilha(1);
        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
