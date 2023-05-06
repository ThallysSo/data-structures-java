package teste;

import java.util.Stack;

public class Aula21 {

    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();
        System.out.println("before: " + pilha);
        empilhaLivrosData(pilha);
        System.out.println("After: " + pilha);

        System.out.println("Desempilhado: " + pilha.peek());
        pilha.pop();


        System.out.println(pilha);

    }

    public static void empilhaLivrosData(Stack<Livro> pilha) {
        pilha.push(new Livro("Nome", "isbn", 2000, "NomeAutor"));
        pilha.push(new Livro("Nome1", "isbn1", 2001, "NomeAutor1"));
        pilha.push(new Livro("Nome2", "isbn2", 2002, "NomeAutor2"));
        pilha.push(new Livro("Nome3", "isbn3", 2003, "NomeAutor3"));
        pilha.push(new Livro("Nome4", "isbn4", 2004, "NomeAutor4"));
        pilha.push(new Livro("Nome5", "isbn5", 2005, "NomeAutor5"));
    }

}

