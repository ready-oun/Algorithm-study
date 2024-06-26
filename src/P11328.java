import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 테스트 케이스 받을 개수 입력값 배열에 저장
        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];

        // 2. 전체 문자열의 문자 빈도수 비교하기
        // 2.1. 그전에 입력값에서 띄어쓰기를 스킵하고 문자 하나씩 추출?하기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String test1 = st.nextToken();
            String test2 = st.nextToken();

            // 2.2. 먼저 조건 충족하는지 먼저 확인
            if (test1.length() != test2.length()) {
                arr[i] = "Impossible";
                continue;
            }

            // 2.3. 두 문자열의 문자 빈도수 비교
            int[] count = new int[26]; // 알파벳은 총 26개~! count 배열에 각 알파벳의 빈도수를 저장할거임
            for (int j =0; j < test1.length(); j++) {
                count[test1.charAt(j) - 97 ]++; // ASCII CODE 'A'=65 'a'=97
                count[test2.charAt(j) - 97 ]--; // a를 빼면 -97이 돼서 a-a=0로 a는 0이 되고, b-a=1로 b는 1이 되고, c-a=2 ... z까지 해서 0~25 인덱스로 매핑
            }

            // 2.4. 모두 0인지 확인 => 0이어야 Possible이즤
            boolean isPossible = true;
            for (int ct : count) {
                if (ct != 0) {
                    isPossible = false;
                    break;
                }
            }

            // 3. isPossible이 true이면 Possible 저장, 아니면 Impossible 저장
            arr[i] = isPossible ? "Possible" : "Impossible";
        }
        // 4. 배열 출력!
        for (String a : arr) {
            System.out.println(a);
        }

    }
}

/*
    입력을 BufferedReader로 받고,
    StringTokenizer로 String을 Token화해서 문자열을 분리 -> 띄어쓰기 구분자를 스킵하고 문자 하나를 추출 : nextToken()
    비교할 문자열을 배열에 담음
    ASCII CODE 활용해서 문자열 빈도수 비교
    --- 여기까지 같이 본 거 같음
    문자열 길이 서로 다르면 바로 빠꾸
    전체 비교는 역시 향상for문이지
    <심화> 두 배열에서 같은 문자면 각각 소거해서 비교 <- 해시맵 쓰던데 담에 해볼게..........
 */