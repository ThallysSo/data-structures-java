package teste;

import vetores.Pilha;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Aula18 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pilha.empilha(numero);
            } else if (pilha.isEmpty()) {
                System.out.println("Pilha vazia!");
            }else{
                pilha.desempilhar();
            }
        }

        if (!pilha.isEmpty()){
            System.out.println(pilha);
            IntStream.iterate(pilha.getTamanho(), i -> i > 0, i -> i - 1)
                    .forEach(i -> pilha.desempilhar());
            System.out.println(pilha);
        }
    }
}
