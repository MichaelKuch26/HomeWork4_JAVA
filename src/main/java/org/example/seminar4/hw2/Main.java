package org.example.seminar4.hw2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String text1 = "()";
        String text2 = "()[]{}";
        String text3 = "(]";
        System.out.println(bulValue(text1));
        System.out.println(bulValue(text2));
        System.out.println(bulValue(text3));
    }


    public static boolean bulValue(String path) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < path.length(); i++) {
            if ((path.charAt(i) == '(') || (path.charAt(i) == '{') || (path.charAt(i) == '[')){
                st.push(path.charAt(i));
            }
            else {
                if (st.empty()) {
                    return false;
                }
                if ((path.charAt(i) == ')') && (st.peek() != '(')) {
                    return false;
                }
                if ((path.charAt(i) == '}') && (st.peek() != '{')) {
                    return false;
                }
                if ((path.charAt(i) == ']') && (st.peek() != '[')) {
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }
}
