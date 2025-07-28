package 단계별로풀어보기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class B10871_X보다_작은_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                bw.write(arr[i] + " ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
