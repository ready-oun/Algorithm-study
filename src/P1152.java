import java.util.Scanner;

/* 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 */

public class P1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // next는 공백 입력 시 더 못 받으니까 nextLine & trim으로 단어 앞뒤 공백 제거
        // (단어가 공백으로 구분되며, 공백이 연속해서 나올 수도 있다 -> 여러 개의 공백 문자를 하나의 구분자로 처리)
        String str = sc.nextLine().trim();

        // 빈 문자열인지 확인 후
        if (str == "")
            System.out.println(0);
        else {
            // 공백 기준으로 문자열 분리 : split("\\s+") 해서 배열로 ( "\\s+"이딴 거 첨봄 )
            String[] words = str.split("\\s+");
            // 분리된 단어 개수(length) 세고 출력
            System.out.println(words.length);
        }

        sc.close();
    }
}

/*
\\s+는 정규 표현식(regular expression)의 일종으로, 문자열을 특정 패턴에 맞게 분리하거나 매칭할 때 사용

\\s: 공백 문자(whitespace character)를 의미합니다. 여기에는 스페이스, 탭, 줄바꿈 등의 공백 문자가 포함됩니다.
+: 앞의 패턴이 한 번 이상 반복됨을 의미합니다. 즉, 하나 이상의 공백 문자를 의미합니다.

따라서 \\s+는 "하나 이상의 공백 문자"를 의미하며, 문자열을 분리할 때 사용됩니다.
이 정규 표현식은 공백이 한 번 이상 나타나는 경우를 모두 인식합니다.
 */