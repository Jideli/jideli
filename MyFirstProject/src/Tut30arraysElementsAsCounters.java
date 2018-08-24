import java.util.Random; // insert random number generator

// using elements and storing them as counters
class Tut30arraysElementsAsCounters {
	public static void main(String[] args) {
		Random rand = new Random();
		int freq[]=new int[7];
		
		for(int roll=1;roll<1000;roll++) {
			++freq[1+rand.nextInt(6)]; // ++freq will add 1 to the index
			// roll numbers 0 to 5, move it to roll 1 to 6
		}
		System.out.println("Face\tFrequency");
		
		for(int face=1;face<freq.length;face++) { // start with 1, not 0
			System.out.println(face+"\t"+freq[face]);
			
		}
	}
}
