import java.util.Scanner;

public class P10869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("덧셈 결과: " + (A + B));
        System.out.println("뺄셈 결과: " + (A - B));
        System.out.println("곱셈 결과: " + (A * B));
        System.out.println("나눗셈 결과: " + (A / B));
        System.out.println("나머지 결과: " + (A % B));

        sc.close();
    }

}
