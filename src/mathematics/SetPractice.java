package mathematics;

import java.util.HashSet;

public class SetPractice {
    public static void main(String[] args) {

        System.out.println("== HashSet 연습 ==");
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        System.out.println("set1 = " + set1); // 출력: set1 = [1, 2]
    }
}