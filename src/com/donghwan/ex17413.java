package com.donghwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String targetString = br.readLine();
        StringBuffer result = new StringBuffer();
        Stack reverse = new Stack();

        boolean isTag = false;
        for (char ch : targetString.toCharArray()) {
            if (ch == '<') {
                while (!reverse.empty()) {
                    result.append(reverse.pop());
                }
                result.append(ch);
                isTag = true;
            } else if (ch == '>') {
                result.append(ch);
                isTag = false;
            } else if (isTag) {
                result.append(ch);
            } else {
                if (ch == ' ') {
                    while (!reverse.empty()) {
                        result.append(reverse.pop());
                    }
                    result.append(ch);
                } else {
                    reverse.push(ch);
                }
            }
        }

        while (!reverse.empty()) {
            result.append(reverse.pop());
        }

        System.out.println(result.toString());
    }
}
