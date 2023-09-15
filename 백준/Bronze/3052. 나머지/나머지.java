import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
 
        int[] num = new int[10]; 
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt(); // 10개의 수를 입력받아 배열에 저장
        }
 
        int[] remainder = new int[10];
        for (int i = 0; i < remainder.length; i++) {
            remainder[i] = num[i] % 42; // 10개의 수를 42로 나눈 나머지를 배열에 저장
        }
 
        TreeSet ts = new TreeSet(); // TreeSet 선언
        for (int i = 0; i < remainder.length; i++) {
            ts.add(remainder[i]); // TreeSet에 나머지를 저장한 배열의 원소를 추가 (중복 값은 저장되지 않는다)
        }
 
        Iterator it = ts.iterator(); // Iterator 선언
 
        int cnt = 0; // 카운터 변수 선언 후 0으로 초기화
        while (it.hasNext()) { // Iterator가 다음 요소를 가지고 있을 때까지 while문이 실행된다
            it.next(); // Iterator에 다음 요소를 반환
            cnt++; // 요소를 가지고 있을 때마다 증가 (TreeSet 요소의 개수만큼 증가하므로 중복이 걸러진 나머지의 개수를 알 수 있다)
        }
 
        System.out.println(cnt);
 
    }
 
}
