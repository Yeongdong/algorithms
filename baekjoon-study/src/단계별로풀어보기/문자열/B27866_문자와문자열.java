package 단계별로풀어보기.문자열;

import java.util.Scanner;

public class B27866_문자와문자열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = scanner.nextInt() - 1;

        System.out.println(s.charAt(a));
    }
}
