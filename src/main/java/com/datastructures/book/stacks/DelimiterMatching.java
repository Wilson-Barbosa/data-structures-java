package com.datastructures.book.stacks;

import java.util.Scanner;

public class DelimiterMatching {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("enter an expression: ");
            String expression = scanner.nextLine();

            if(isExpBalanced(expression)) {
                System.out.println("Expression is VALID");
            }

        }

    }

    /**
     * Receives an expressions and checks if the braces are balanced. If they aren't
     * 
     * 
     * @param expression the expression to be parsed and evaluated
     */
    public static boolean isExpBalanced(String expression) {

        StackCharArray stack = new StackCharArray(expression.length());

        for (int i = 0; i <= expression.length() - 1; i++) {

            char c = expression.charAt(i);

            // first I push all opening ones to the stack
            if (isOpeningBracer(c)) {
                stack.push(c);
            } else if (isClosingBracer(c)) {
                System.out.println("chars compared are: " + stack.peek() + c);
                /*
                 * then if I find one closing I unstack the last one and compare to the the c
                 * if they are equal then they are, for now, balanced, or else they're unbalanced
                 */
                if (!areCharsTheSameType(stack.pop(), c)) {
                    System.out.println("Error at " + c + " on position " + (i+1));
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean isOpeningBracer(char c) {
        return (c == '[' || c == '{' || c == '(');
    }

    public static boolean isClosingBracer(char c) {
        return (c == ']' || c == '}' || c == ')');
    }

    public static boolean areCharsTheSameType(char openingChar, char closingChar) {

        if (openingChar == '[' && closingChar == ']') {
            return true;
        } else if (openingChar == '{' && closingChar == '}') {
            return true;
        } else if (openingChar == '(' && closingChar == ')') {
            return true;
        }

        return false;
    }

}
