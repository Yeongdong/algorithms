package 단계별로풀어보기.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class B11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int sum = x + y;

            bw.write("Case #" + i + ": " + sum + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
