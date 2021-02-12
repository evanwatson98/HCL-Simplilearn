package project.hcl.LongestRun;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestRun {
	private Sequence sequence;
	private ArrayList<ArrayList<Integer>> longestRuns; 
	
//	public void setSeq(Sequence s) {
//		seq = s;
//	}
	
	public Sequence getSequence() {
		return sequence;
	}
	
	public void getSeqInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ArrayList Size (Input 0 for a random size)");
		System.out.println("Size: ");
		int s = scan.nextInt();
		
		sequence = new Sequence(s);
		sequence.buildSequence();
	}
	
	public void searchSequence() {
		System.out.println("Sequence: " + sequence.getSequence());
		int seqSize = sequence.getSize();
		int tempStart = 0;
		int start = 0;
		int end = 0;
		int tempLongestSeq = 0;
		int longestSeq = 0;
		ArrayList<Integer> seq = sequence.getSequence();
		
		//Add boolean to not hit the second if?
		
		//what if the last number in the list is a part of the sequence
		for(int i = 1; i< seqSize; i++) {
			
			if(seq.get(i) > seq.get(i-1)) {
				if(tempLongestSeq == 0) {
					tempStart = i;
				}
				tempLongestSeq++;				
			}else if(tempLongestSeq > longestSeq) {
				start = tempStart;
				longestSeq = tempLongestSeq;
				tempLongestSeq = 0;
				end=i;
			} else {
				tempLongestSeq = 0;
			}
		}
		System.out.println("Longest SubSequence\n-------------------- \nStarts at index: " + (start-1) + " \nEnds at index: " + end);
		System.out.println("Longest Subsequence: " + seq.subList(start-1, end));
	}
	
}
