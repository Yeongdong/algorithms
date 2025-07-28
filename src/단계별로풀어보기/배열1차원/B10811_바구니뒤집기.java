package 단계별로풀어보기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class B10811_바구니뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 생성
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        // 순서 뒤집기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            while (x < y) {
                int temp = arr[x];
                arr[x++] = arr[y];
                arr[y] = temp;
                y--;
            }
        }
        for (int cnt : arr) {
            System.out.print(cnt + " ");
        }
    }
}
