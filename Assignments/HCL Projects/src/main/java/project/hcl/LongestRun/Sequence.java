package project.hcl.LongestRun;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Sequence {
	
	private int arraySize;
	private int min = 10;
	private int max = 100;
	private ArrayList<Integer> sequence;
	
	public Sequence(int len) {
		if(len == 0) {
			arraySize = ThreadLocalRandom.current().nextInt(min, max + 1);
		}else {
			arraySize = len;
		}
	}
	
	public void buildSequence(){
		sequence = new ArrayList<Integer>();
		
		for(int i = 0; i < arraySize; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			sequence.add(randomNum);
			
		}
	}
	
	public ArrayList<Integer> getSequence(){
		return sequence;
	}
	
	public int getSize() {
		return arraySize;
	}
	
	public void printSeq() {
		System.out.println(sequence.toString());
	}
}
