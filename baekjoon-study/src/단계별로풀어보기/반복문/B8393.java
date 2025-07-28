package 단계별로풀어보기.반복문;

import java.util.Scanner;

public class B8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
