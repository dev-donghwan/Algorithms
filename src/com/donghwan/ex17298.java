package com.donghwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex17298 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> temp = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] array = new int[size];
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        int index = 0;
        while (true) {
            if (index == 0) {
                temp.push(index++);
            } else if (index == size - 1) {
                break;
            } else {
                int num = array[index];
                if (num > array[temp.peek()]) {
                    result[temp.pop()] = num;
                }
                temp.push(index++);
            }
        }

        while (!temp.empty()) {
            result[temp.pop()] = array[index];
        }
        result[index] = -1;

        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
