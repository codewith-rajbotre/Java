
import java.util.Collections;
import java.util.PriorityQueue;

class PQueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(54);
        pq.add(3);
        pq.add(83);
       while (!pq.isEmpty()) { 
           System.out.println(pq.poll());   
       }
    }
}