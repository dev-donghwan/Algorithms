package com.donghwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10828 {
    public static void main(String[] args) throws IOException {
        int stack[] = new int[10000];
        int size = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String text = br.readLine();
            if (text.startsWith("push")) {
                stack[size++] = Integer.parseInt(text.replace("push ", ""));
            } else if (text.startsWith("pop")) {
                if (size > 0) {
                    System.out.println(stack[size - 1]);
                    stack[size - 1] = 0;
                    size--;
                } else {
                    System.out.println(-1);
                }
            } else if (text.startsWith("size")) {
                System.out.println(size);
            } else if (text.startsWith("empty")) {
                if (size == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (text.startsWith("top")) {
                if (size > 0) {
                    System.out.println(stack[size - 1]);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
