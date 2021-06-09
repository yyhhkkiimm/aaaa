package yduts;

import yduts.d0609.FailRate;

public class Main {
	public static void main(String[] args) {
//		KthNum kn = new KthNum();
//		
//		int[] array = {1, 5, 2, 6, 3, 7, 4};
//		int[][] commands = 	{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//		System.out.print(Arrays.toString(kn.solution(array, commands)));
		
//		int[] numbers = {3, 30, 34, 5, 9};
//		BigNum2 bn = new BigNum2();
//		System.out.print(bn.solution(numbers));
		
//		int[] numbers = {339, 1000, 4, 58, 9};
//		String a = null;
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(i+"==="+numbers[i]/1000);
//			System.out.println(i+"==="+numbers[i]/100);
//			System.out.println(i+"==="+numbers[i]/10);
//			System.out.println(i+"==="+numbers[i]);
//		}
		
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		FailRate fr = new FailRate();
		fr.solution(N, stages);
	}
}
