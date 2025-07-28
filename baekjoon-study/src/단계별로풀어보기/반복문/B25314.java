package 단계별로풀어보기.반복문;

import java.util.Scanner;

public class B25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt() / 4;

        for (int i = 0; i < n; i++) {
            System.out.print("long ");
        }

        System.out.print("int");
    }
}
