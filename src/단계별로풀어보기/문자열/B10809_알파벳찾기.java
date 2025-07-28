package 단계별로풀어보기.문자열;

import java.util.Arrays;
import java.util.Scanner;

public class B10809_알파벳찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[26];

        String S = scanner.nextLine();

        Arrays.fill(nums, -1);

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (nums[c - 'a'] == -1)
                nums[c - 'a'] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
