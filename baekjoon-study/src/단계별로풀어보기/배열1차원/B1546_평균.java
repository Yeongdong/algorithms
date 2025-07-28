package 단계별로풀어보기.배열1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] scores = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(scores);

        for (int i = 0; i < scores.length; i++) {
            sum += (scores[i] / scores[scores.length - 1] * 100);
        }
        System.out.println(sum / scores.length);
    }
}
