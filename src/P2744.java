import java.util.Scanner;
/* 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
   각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 */

public class P2744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // StringBuilder 출격 드가자
        StringBuilder sb = new StringBuilder();

        // for문으로 문자열의 각 문자를 반복 검사해서 대소문자 변환
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // str의 index 증가 반복쓰
            // 대문자면 -> 소문자로
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
            // 소문자면 -> 대문자로
            else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                // 알파벳 아니면 ?
                System.out.println("알파벳만 받는다 꺼져");
            }
        }

        System.out.println(sb);

        sc.close();

    }
}
