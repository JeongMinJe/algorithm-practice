package brute_force;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_42840 {
    public int[] solution(int[] answers) {

        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];


        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) {
                scores[0]++;
            }

            if (answers[i] == pattern2[i % pattern2.length]) {
                scores[1]++;
            }

            if (answers[i] == pattern3[i % pattern3.length]) {
                scores[2]++;
            }
        }

        int maxScore = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        List<Integer> winners = new ArrayList<>();
        if (scores[0] == maxScore) {
            winners.add(1);
        }
        if (scores[1] == maxScore) {
            winners.add(2);
        }
        if (scores[2] == maxScore) {
            winners.add(3);
        }

        int[] answer = new int[winners.size()];
        for (int i = 0; i < winners.size(); i++) {
            answer[i] = winners.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_42840 sol = new Programmers_42840();

        int[] answers1 = {1, 2, 3, 4, 5};
        System.out.println("예제 1 결과: " + Arrays.toString(sol.solution(answers1)));

        int[] answers2 = {1, 3, 2, 4, 2};
        // 기대 결과: [1, 2, 3]
        System.out.println("예제 2 결과: " + Arrays.toString(sol.solution(answers2)));

    }
}