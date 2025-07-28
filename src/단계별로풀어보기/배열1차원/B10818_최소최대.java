package 단계별로풀어보기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class B10818_최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = Integer.parseInt(st.nextToken());
        }

        int min = values[0];
        int max = values[0];
        for (int i = 0; i < N; i++) {
            if (min > values[i]) {
                min = values[i];
            }
            if (max < values[i]) {
                max = values[i];
            }
        }
        br.close();
        bw.write(min + " " + max);
        bw.close();
    }
}
