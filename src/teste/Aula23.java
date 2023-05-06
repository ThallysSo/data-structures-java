package teste;

import java.util.Stack;

public class Aula23 {

    public static void main(String[] args) {

        System.out.println(verificaExpressao("((A+B)")); //false
        System.out.println(verificaExpressao("(A+B)")); //true
        System.out.println(verificaExpressao("A+B")); //true
        System.out.println(verificaExpressao("{A+B}")); //true
        System.out.println(verificaExpressao("[A+B]"));//true
        System.out.println(verificaExpressao("{A+B]"));//false
        System.out.println(verificaExpressao("(A+B))"));//false
        System.out.println(verificaExpressao("A+B)"));//false
        System.out.println(verificaExpressao(")A+B( -C)"));//false
        System.out.println(verificaExpressao("(A+B)) - (C+D"));//false
        System.out.println(verificaExpressao("((A+B)+D)"));//true

    }

    public static boolean verificaExpressao(String expressao){
        Stack<Character> stack = new Stack<>();

        final String ABRE = "([{";
        final String FECHA = ")]}";

        int index = 0;
        while (index < expressao.length()){
            char simbolo = expressao.charAt(index);
            if(FECHA.indexOf(simbolo) >= 0 && stack.empty()){
                return false;
            } else if (ABRE.indexOf(simbolo) >= 0) {
                stack.push(simbolo);
            } else if (FECHA.indexOf(simbolo) >= 0) {
                if (ABRE.indexOf(stack.peek()) == FECHA.indexOf(simbolo)){
                    stack.pop();
                }
            }
         index++;
        }

        return stack.empty();
    }


}
//
//    public static boolean verificaExpressao(String expressao) {
//
//        Stack<Character> pilha = new Stack<>();
//
//        char abre = '(';
//        char fecha = ')';
//        byte qtParenteses = 0;
//
//
//
//        for (int i = 0; i < expressao.length(); i++) {
//            char expressaoDividida = expressao.charAt(i);
//            if (expressaoDividida == abre) {
//                qtParenteses++;
//            } else if (expressaoDividida == fecha && qtParenteses > 0) {
//                qtParenteses--;
//            } else if (expressaoDividida == fecha && qtParenteses == 0){
//                return false;
//            }
//        }
//        return qtParenteses == 0;
//    }