package 단계별로풀어보기.배열1차원;

import java.util.Scanner;

public class B2562_최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (max < arr[i]) {
                max = arr[i];
                pos = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(pos);
    }
}
