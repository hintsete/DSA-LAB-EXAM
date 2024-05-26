package dsa_lab_exam;

import java.util.Stack;

public class Question5 {
    public static String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string is null.");
        }

        Stack<Character> stack = new Stack<>();


        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();


        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversedString = reverseString(input);
        System.out.println(reversedString);
    }
}
