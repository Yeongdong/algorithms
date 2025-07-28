package 단계별로풀어보기.배열1차원;

import java.util.Scanner;

public class B3052_나머지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[sc.nextInt() % 42] = true;
        }
        for (boolean value : arr) {
            if (value) count++;
        }
        System.out.println(count);
    }
}
