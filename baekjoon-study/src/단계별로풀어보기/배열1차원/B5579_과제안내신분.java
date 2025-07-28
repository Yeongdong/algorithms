package 단계별로풀어보기.배열1차원;

import java.util.Scanner;

public class B5579_과제안내신분 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] students = new int[30];

        for (int i = 0; i < 28; i++) {
            int submit = scanner.nextInt();
            students[submit-1] = 1;
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0)
                System.out.println(i + 1);
        }
    }
}
