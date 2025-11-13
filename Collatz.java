// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int maxSeed = Integer.parseInt(args[0]);
	String cv = args[1];

	boolean verbose = cv.equalsIgnoreCase("v");
	int count;

	for (int seed = 1; seed <= maxSeed; seed++) {
	 if (verbose && seed ==1) {
	 System.out.println("1 4 2 1 (4)");	
	 continue; 
	 }

	 long num = seed;
	 count = 1;
	 String sequence = "" + num; 

	 while ( num != 1) { 
	 
		if (num %2 ==0) {
		num = num / 2;	
		}
		else {
		num = (num * 3) +1;
		}
		sequence = sequence + " " + num;
		count++;
	 }

	 if (verbose) {
	 System.out.println(sequence + " (" + count + ") ");	 
	 }
	
	}
	System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
	}
}
