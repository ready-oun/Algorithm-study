import java.util.Scanner;

public class P100998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > 0 && A < 10 && B > 0 && B < 10)
            System.out.println(A*B);
        else
            System.out.println("입력값 A, B 모두 0보다 크고 10보다 작아야 합니다.");

        sc.close();
    }


}
