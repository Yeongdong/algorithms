package 단계별로풀어보기.조건문;

import java.util.Scanner;

public class B2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // 현재 시간
        int b = sc.nextInt();   // 현재 분
        int c = sc.nextInt();   // 요리 분

        // 종료 시간 계산
        b += c; // 요리 분 추가
        a += b/60;  // 완료 시간
        b %= 60;    // 완료 분

        if(a>=24) {
            a -= 24;
        }
        System.out.println(a + " " + b);
    }
}
