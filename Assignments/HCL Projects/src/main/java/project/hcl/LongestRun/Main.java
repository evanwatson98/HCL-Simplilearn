package project.hcl.LongestRun;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		ArrayList<Integer> test = new ArrayList<Integer>();
//		int num1 = 10; int num2 = 1;int num3 = 20;int num4 = 40;int num5 = 22;int num6 = 33;int num7 = 36;int num8 = 44;int num9 = 65;int num10 = 30;
//		test.add(num1); test.add(num2); test.add(num3); test.add(num4); test.add(num5); test.add(num6); test.add(num7); test.add(num8); test.add(num9); test.add(num10); 
		
		LongestRun longestRun = new LongestRun();
		longestRun.getSeqInput();
//		longestRun.getSequence().printSeq();
		longestRun.searchSequence();
	}

}
