package heap;

import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//time: o(nlogn)
	//space: o(n)
    public int lastStoneWeight(int[] stones) {
    	
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        
        for(int num:stones) {
        	pq.add(num);
        }
        
        while(pq.size()>=2) {
        	int stone1 = pq.poll();
        	int stone2 = pq.poll();
        	if(stone1>stone2) {
        		pq.add(stone1-stone2);
        	}
        }
        
        return pq.isEmpty()?0:pq.poll();
        
    }

}
