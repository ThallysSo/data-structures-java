package teste;

import vetores.Pilha;

public class Aula20 {

    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);
        System.out.println("before: " + pilha);
        empilhaLivrosData(pilha);
        System.out.println("After: " + pilha);

        System.out.println("Desempilhado: " + pilha.topo());
        pilha.desempilhar();


        System.out.println(pilha);

    }

    public static void empilhaLivrosData(Pilha<Livro> pilha) {
        pilha.empilha(new Livro("Nome", "isbn", 2000, "NomeAutor"));
        pilha.empilha(new Livro("Nome1", "isbn1", 2001, "NomeAutor1"));
        pilha.empilha(new Livro("Nome2", "isbn2", 2002, "NomeAutor2"));
        pilha.empilha(new Livro("Nome3", "isbn3", 2003, "NomeAutor3"));
        pilha.empilha(new Livro("Nome4", "isbn4", 2004, "NomeAutor4"));
        pilha.empilha(new Livro("Nome5", "isbn5", 2005, "NomeAutor5"));
    }

}

