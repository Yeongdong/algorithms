package 단계별로풀어보기.문자열;

import java.io.*;
import java.util.StringTokenizer;

public class B1152_단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        br.close();
        System.out.println(str.countTokens());
    }
}
