import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1085 {
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
