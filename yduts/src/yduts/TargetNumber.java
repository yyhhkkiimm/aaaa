package yduts;

import java.util.ArrayList;
import java.util.List;

public class TargetNumber {

	public static void main(String[] args) {
		TargetNumber t = new TargetNumber();
		
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 2;

		t.solution(numbers, target);
	}
	
	
	int solution(int[] numbers, int target) {
		List<Integer> list = new ArrayList<Integer>();
	    int answer = 0;
	    
	    int num = 0;
//	    while(true) {
	    	for (int i=0; i<numbers.length; i++) {
	    		System.out.println("i="+i);
	    		for (int j=0; j<numbers.length; j++) {
//	    			int minus = 0;
//	    			minus = -numbers[i];
	    			if (i == j) {
	    				num += -numbers[i];
	    			} else {
	    				num += numbers[j];
	    			}
    			}
	    		System.out.println(num);
	    		if (num == target) {
	    			answer++;
	    		}
	    		num = 0;
    		}
//	    }
	    
	    System.out.println("answer="+answer);	    
	    return answer;
	}

}
