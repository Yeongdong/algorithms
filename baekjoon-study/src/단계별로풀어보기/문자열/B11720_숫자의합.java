package 단계별로풀어보기.문자열;

import java.util.Scanner;

public class B11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.next();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a.charAt(i) - '0';   //charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0'
        }
        System.out.println(sum);
    }
}
