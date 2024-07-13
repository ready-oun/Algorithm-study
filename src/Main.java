import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * P1085 직사각형 탈출
 *
 * 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고,
 * 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 x, y, w, h가 주어진다.
 *
 * 출력
 * 첫째 줄에 문제의 정답을 출력한다.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // split one line of input taken with space
        String[] arr = br.readLine().split(" ");

        // convert values to int
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int w = Integer.parseInt(arr[2]);
        int h = Integer.parseInt(arr[3]);

        // find the smallest val out of 4 distances
        int dstnToLeft = x; // L
        int dstnToRight = w - x; // from L to R
        int dstnToBottom = y; // from T to B
        int dstnToTop = h - y; // from B to T

        // find the smallest one by Math.min()
        int minDstn = Math.min(
                Math.min(dstnToLeft, dstnToRight),
                Math.min(dstnToBottom, dstnToTop)
        );

        System.out.println(minDstn);

        br.close();
    }
}