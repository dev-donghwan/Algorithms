package com.donghwan;

import java.io.*;
import java.util.Stack;

public class ex9093 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack();

        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            String text = br.readLine() + " ";
            for (char ch : text.toCharArray()) {
                if (ch == ' ') {
                    while (!stack.empty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                } else {
                    stack.push(ch);
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
