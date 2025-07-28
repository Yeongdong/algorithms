package 단계별로풀어보기.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11718_그대로출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //Scanner는 NoSuchElementException. BufferedReader은 Null 반환
        String next;

        while ((next = br.readLine()) != null) {
            System.out.println(next);
        }
    }
}
