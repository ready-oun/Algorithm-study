/* 알파벳 대소문자로 된 단어가 주어지면,
이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
단, 대문자와 소문자를 구분하지 않는다.
 */


import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alphabet = sc.nextLine().toUpperCase();

        int[] alphabetCount = new int[26]; // 저장할 알파벳 개수(빈도수라서 중복x)만큼 배열 크기 생성
        for (char c : alphabet.toCharArray()) { // toCharArray() : 문자열을 문자 배열로 변환하여 각 문자를 개별적으로 다룰 수 있게

        }


    }
}

/*
1. 입력 문자열을 모두 대문자 또는 소문자로 변환 -> 대소문자 구분 없이 처리 주의
2. 각 알파벳 빈도 수 세기 위해 '배열' 사용
3. 빈도수 비교해서 가장 많이 사용된 알파벳 찾기
4. if 가장 많이 사용된 알파벳이 여러 개 -> printf "?"

# toCharArray() vs CharAt()

toCharArray()는 문자열을 배열로 복사하여 새로 할당된 메모리 공간에 저장함
변환된 배열을 한 번 순회하는 동안 각 문자를 효율적으로 접근할 수 있음

CharAt()은 문자열 자체를 참조하므로 추가 메모리 할당이 필요 없으나,
문자열의 각 문자에 접근할 때마다 메서드를 호출해야 하므로 호출 오버헤드가 발생할 수 있음

문자열이 매우 길거나 자주 변환되는 경우 toCharArray()가 더 효율적일 수 있으며,
작은 문자열이나 메모리 사용이 중요한 경우 charAt()가 더 효율적

*요약
toCharArray()는 문자열을 한 번에 배열로 변환하여 처리하는 방식으로,
추가 메모리 사용이 있지만 CPU 효율성이 더 좋을 수 있습니다.
charAt()는 문자열의 특정 인덱스에 직접 접근하는 방식으로,
메모리를 덜 사용하지만, 메서드 호출 오버헤드가 발생할 수 있음

긴 문자열을 처리할 때 메모리 사용을 최적화할 수 있는 다른 방법
: `BufferedReader` : 긴 문자열을 작은 조각으로 나누어 부분 처리, 반복 사용되는 문자열 캐싱해 메모리 사용 줄임(메모리 풀링)
 */