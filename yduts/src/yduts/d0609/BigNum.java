package yduts.d0609;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
//
//예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
//
//0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
//
//제한 사항
//numbers의 길이는 1 이상 100,000 이하입니다.
//numbers의 원소는 0 이상 1,000 이하입니다.
//정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
//입출력 예
//numbers	return
//[6, 10, 2]	"6210"
//[3, 30, 34, 5, 9]	"9534330"
public class BigNum {
    
	public String solution(int[] numbers) {
        String answer = "";
        ArrayList<Integer> intArray = (ArrayList<Integer>) Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.reverse(intArray);
        List<Integer> numList = new ArrayList<Integer>();
//        System.out.println(list);
        for (int j = 9; j >= 1; j--) {
        	System.out.println("j==========================="+j);
        	for (int i = 0; i < numbers.length; i++) {
        		System.out.println("num 수 ="+numbers[i]);
        	
        		int oneNum = 0;
        		int twoNum = 0;
        		int threeNum = 0;
        		int len = (int)(Math.log10(numbers[i])+1);
//	        	if ( len == 4) {
//	        		oneNum = divNum(numbers[i], 4);
//	        		twoNum = divNum(numbers[i], 3);
//	        		threeNum = divNum(numbers[i], 2);
//	        		System.out.println(i+"번째 4=="+oneNum);
//	        	} else if (len == 3){
//	        		oneNum = divNum(numbers[i], 3);
//	        		twoNum = divNum(numbers[i], 2);
//	        		System.out.println(i+"번째 3=="+oneNum);
//	        	} else if (len == 2) {
//	        		oneNum = divNum(numbers[i], 2);
//	        		System.out.println(i+"번째 2=="+oneNum);
//	        	} else if (len == 1) {
//	        		oneNum = divNum(numbers[i], 1);
//	        		System.out.println(i+"번째 1=="+oneNum);
//	        	}
	        	
	        	int chkLen = 0;
	        	if (!numList.isEmpty()) {
        			for (int k=0; k<numList.size();k++) {
        				chkLen = (int)(Math.log10(numList.get(i))+1);
        	        	if ( chkLen == 4) {
        	        		oneNum = divNum(numList.get(i), 4);
        	        		twoNum = divNum(numList.get(i), 3);
        	        		threeNum = divNum(numList.get(i), 2);
        	        		System.out.println(i+"번째 4=="+oneNum);
        	        	} else if (chkLen == 3){
        	        		oneNum = divNum(numList.get(i), 3);
        	        		twoNum = divNum(numList.get(i), 2);
        	        		System.out.println(i+"번째 3=="+oneNum);
        	        	} else if (chkLen == 2) {
        	        		oneNum = divNum(numList.get(i), 2);
        	        		System.out.println(i+"번째 2=="+oneNum);
        	        	} else if (chkLen == 1) {
        	        		oneNum = divNum(numList.get(i), 1);
        	        		System.out.println(i+"번째 1=="+oneNum);
        	        	}
        			}	        			
        		}
	        	
	        	if (oneNum == j) {
	        		numList.add(numbers[i]);
	        	}
			}
        	Collections.sort(numList);
        	if (!numList.isEmpty()) {
        		for (int i=numList.size()-1; i>= 0; i--) {
        			answer = answer + numList.get(i);
        		}
        		numList.clear();        		
        	}
        	
        }
        System.out.println(answer);
        
        return answer;
    }
	
	public int divNum(int num, int div) {
		if (div == 4) {
			return num / 1000;
		} else if (div == 3) {
			return num / 100;
		} else if (div == 2) {
			return num / 10;
		} else if (div == 1) {
			return num;
		}
		return num;
	}
}


//1 2 3 4 5 6 7 8 9 10
//1 3 4 5 6 7 8 9 0 0
//
//20  9
//
//sub