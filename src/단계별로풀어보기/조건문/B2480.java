package 단계별로풀어보기.조건문;

import java.util.Scanner;

public class B2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;

        if(a==b && b==c) {          // 모든 변수가 같은 경우
            result = 10000+a*1000;
            System.out.println(result);
        }else if(a==b || a==c) {    // 두 변수가 같은 경우1
            result = 1000+a*100;
            System.out.println(result);
        }else if(b==c) {            // 두 변수가 같은 경우2
            result = 1000+b*100;
            System.out.println(result);
        }
        else{                        // 모든 변수가 다른 경우
            int max = Math.max(a, Math.max(b, c));
            result = max*100;
            System.out.println(result);
        }
        sc.close();
    }
}
