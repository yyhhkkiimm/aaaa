package yduts.d0609;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//int N = 5;
//int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
public class FailRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Double> list = new ArrayList<Double>();
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        int cnt = 0;
        int fail = 0;
        for (int i=1; i<=N; i++) {
        	for (int j=0; j<stages.length; j++) {
        		System.out.println(stages[j]);
        		if (i < stages[j]) {
        			cnt++;
        		} else {
        			if (i <= stages[j]) {
        				cnt++;        				
        				fail++;
        			}
        		}
        	}
        	
        	System.out.println(i+"stage="+fail+"/"+cnt);
        	System.out.println( (double) fail / (double) cnt * 100.0 + "%");
        	if (cnt != 0) {
        		map.put(i, (double) fail / (double) cnt * 100.0);
        		list.add((double) fail / (double) cnt * 100.0);        		
        	} else {
        		map.put(i, 0.0);
        		list.add(0.0);
        	}
        	
        	cnt = 0;
        	fail = 0;
        }
        Collections.sort(list);
        Collections.reverse(list);
        
        for (int i = 0; i < list.size(); i++) {
        	for (int j = 0; j < map.size(); j++) {
        		System.out.println("map="+(j+1)+"   ==="+map.get(j+1));
        		System.out.println("list="+i+"   ==="+list.get(i));
        		if(String.valueOf(map.get(j+1)).equals(String.valueOf(list.get(i)))) {
        			map.put(j+1, -1.0);
       				answer[i] = j+1;
        			System.out.println("ooo="+i+"=oooooooooooooooo====="+(j+1)+"============ooooooooooooooooo");
        			break;
        		}
        	}
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

