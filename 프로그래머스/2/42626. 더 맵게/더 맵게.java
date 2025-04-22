import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.offer(s);
        }

        int answer = 0;

        while (pq.size() > 1 && pq.peek() < K) {
            int a = pq.poll();
            int b = pq.poll();
            int c = a + (b * 2);
            pq.offer(c);
            answer++;
        }

        if (pq.peek() < K) return -1;

        return answer;
    }
}
