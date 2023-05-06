package teste;

import java.util.Stack;

public class Aula24 {

    public static void main(String[] args) {
        System.out.println(convertBinaryToDecimal(10));
        System.out.println(convertBinaryToDecimal(45));
        System.out.println(convertBinaryToDecimal(59));
        System.out.println(convertBinaryToDecimal(101));
        System.out.println(convertBinaryToDecimal(2));


    }

    public static Stack<Integer> convertBinaryToDecimal(Integer value) {
        Stack<Integer> stack = new Stack<>();
        while (value != 0) {
            if(value % 2 == 0){
                stack.push(0);
            }else {
                stack.push(1);
            }
            value /= 2;
        }

        return inverseOrder(stack);
    }

    public static Stack<Integer> inverseOrder(Stack<Integer> binary){
        Stack<Integer> stack = new Stack<>();

        for (int i = binary.size()-1; i > -1; i--) {
            stack.push(binary.get(i));
        }
        return stack;
    }

}
