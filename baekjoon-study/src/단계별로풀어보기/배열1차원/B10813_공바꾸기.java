package 단계별로풀어보기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class B10813_공바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        // 바구니 만들기
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        // 공 바꾸기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }

        // 출력하기
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
