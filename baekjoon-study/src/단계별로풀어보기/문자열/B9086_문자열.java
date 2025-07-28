package 단계별로풀어보기.문자열;

import java.util.Scanner;

public class B9086_문자열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String s[] = new String[n];

        for (int i = 0; i < s.length; i++) {
            String str = scanner.next();
            s[i] = str.charAt(0) + str.substring(str.length() - 1);
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
