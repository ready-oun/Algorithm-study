import java.util.Scanner;

/* 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
정규 표현식이 아닌 enhanced for loop로 풀어보잣
 */

public class P1152_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        if (str.isEmpty())
            System.out.println(0);
        else {
            String[] words = str.split(" ");

            int w = 0;
            for (String word : words) {
                if (!word.isEmpty())
                    w++;
            }

            System.out.println(w);
        }

        sc.close();
    }
}