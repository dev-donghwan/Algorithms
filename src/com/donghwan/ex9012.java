package com.donghwan;

import java.io.*;

public class ex9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            int cnt = 0;
            String example = br.readLine();

            for (char ch : example.toCharArray()) {
                if (ch == '(') {
                    cnt += 1;
                } else {
                    cnt -= 1;
                }

                if (cnt < 0) {
                    break;
                }
            }

            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
