package 단계별로풀어보기.반복문;

import java.util.Scanner;

public class B25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int N = scanner.nextInt();

        int totalPrice = 0;

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            totalPrice += a * b;
        }
        if (X == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
