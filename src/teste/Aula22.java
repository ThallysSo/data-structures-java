package teste;

import java.util.Stack;

public class Aula22 {

    public static void main(String[] args) {

        printResult("AMOR");
        printResult("ARARA");
        printResult("MARIA");
        printResult("VICTORIA");
        printResult("RADAR");

    }

    public static void printResult(String palavra){
        System.out.println(palavra + " é um palindromo? " + testaPalindromo(palavra));
    }
    public static boolean testaPalindromo(String palavra){
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }
        System.out.println(pilha);

        StringBuilder palavraInversa = new StringBuilder();
        while (!(pilha.empty())){
            palavraInversa.append(pilha.pop());
        }

        return palavra.equalsIgnoreCase(palavraInversa.toString());
    }

}


//        int count = palavraDividida.length;
//        int tamanhoString = count - 1;
//            for (int contador = (tamanhoString-1) >> 1; contador >= 0; contador--) {
//                int k = tamanhoString - contador;
//                String cj = palavraDividida[contador];
//                palavraDividida[contador] = palavraDividida[k];
//                palavraDividida[k] = cj;
//
