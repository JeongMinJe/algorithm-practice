package heap;

import java.util.PriorityQueue;

public class Programmers_42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 1. 모든 음식의 스코빌 지수를 힙에 넣음.
        for (int s : scoville) {
            minHeap.offer(s);
        }

        // 2. 힙의 가장 작은 값이 K보다 작고, 힙에 음식이 2개 이상 있는 동안 반복.
        while (minHeap.peek() < K && minHeap.size() >= 2) {
            // 2-1. 가장 맵지 않은 음식 두 개를 꺼냅니다.
            int firstMin = minHeap.poll();
            int secondMin = minHeap.poll();

            // 2-2. 두 음식을 섞어 새로운 음식을 만듭니다.
            int newScoville = firstMin + (secondMin * 2);

            // 2-3. 새로운 음식을 다시 힙에 넣습니다.
            minHeap.offer(newScoville);

            // 2-4. 섞은 횟수를 증가시킵니다.
            answer++;
        }

        // 3. 최종적으로 모든 음식의 스코빌 지수가 K 이상인지 확인.
        if (minHeap.peek() < K) {
            return -1; // 불가능한 경우
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_42626 sol = new Programmers_42626();

        // 기대결과 : 2
        System.out.println(sol.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
