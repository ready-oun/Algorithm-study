import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = br.readLine();
            int score = Integer.parseInt(input);

            if (score < 0 || score > 100) {
                System.out.println("On a scale of 0 to 100");
            } else {
                String grade = switch (score/10) { // // score를 10으로 나눈 몫을 기준으로 switch 문 사용
                    case 10, 9 -> "A"; // 90~ 100
                    case 8 -> "B"; // 80~89
                    case 7 -> "C"; // 70~79
                    case 6 -> "D"; // 60~69
                    default -> "F"; // 나머지 점수
                };

                System.out.println(grade);
            }



        } catch (IOException e) { // 입출력 오류 시 비정상 종료 방지
            System.out.println("Input Error");
        } catch (NumberFormatException e) { // 잘못된 형식의 입력을 만났을 때 비정상적으로 종료 방지
            System.out.println("Wrong NumberFormat");
        }
    }
}
