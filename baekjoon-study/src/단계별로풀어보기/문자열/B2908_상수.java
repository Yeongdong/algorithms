package 단계별로풀어보기.문자열;

import java.util.Scanner;

public class B2908_상수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int i = Integer.parseInt(new StringBuilder().append(n).reverse().toString());
        int j = Integer.parseInt(new StringBuilder().append(m).reverse().toString());

        if (i > j) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }
    }
}
