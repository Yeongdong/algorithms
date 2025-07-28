package 단계별로풀어보기.배열1차원;

import java.util.Scanner;

public class B10807_개수_세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();

        for (int i : arr) {
            if (b == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}
