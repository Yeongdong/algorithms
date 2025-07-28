package 단계별로풀어보기.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class B10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            String sum = String.valueOf(i + j);

            if (i == 0 && j == 0) {
                break;
            }

            bw.write(sum + "\n");

        }
        br.close();
        bw.flush();
        bw.close();
    }
}
