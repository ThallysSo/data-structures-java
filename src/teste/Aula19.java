package teste;

import com.sun.security.jgss.GSSUtil;
import vetores.Pilha;

import java.util.Scanner;

public class Aula19 {

    public static void main(String[] args) {

        Pilha<Integer> impar = new Pilha<>();
        Pilha<Integer> par = new Pilha<>();

        Scanner scanner = new Scanner(System.in);

        String message = "Não foi possível desempilhar o número ";
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado == 0) {
                if (par.isEmpty() || impar.isEmpty()){
                    System.out.println(message);
                }else {
                    System.out.println("Desempilhado:" + par.topo());
                    par.desempilhar();
                    System.out.println("Par: " + par);
                    System.out.println("Desempilhado:" + impar.topo());
                    impar.desempilhar();
                    System.out.println("Impar: " + impar);
                }
            } else {
                if (numeroDigitado % 2 == 0) {
                    par.empilha(numeroDigitado);
                    System.out.println(par);
                } else {
                    impar.empilha(numeroDigitado);
                    System.out.println(impar);
                }
            }
        }

        desempilhador(par);
        desempilhador(impar);

        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);

    }

    public static void desempilhador(Pilha<Integer> pilha){
        if(!(pilha.isEmpty())){
            for (int i = pilha.getTamanho(); i > 0; i--) {
                System.out.print(pilha.topo() + " ");
                pilha.desempilhar();
            }
        }
        System.out.println();
    }
}

