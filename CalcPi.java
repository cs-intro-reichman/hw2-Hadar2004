// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	int num = Integer.parseInt(args[0]);
	System.out.println("pi according to Java: " + Math.PI);
	
	double sum = 0.0;
	double denominator = 1.0;
	double sign = 1.0;

	for (int i = 0; i < num; i++) {
    sum = sum + (sign / denominator);	
	denominator = denominator + 2;
	sign = -sign; 
		
	}

	System.out.println("pi, approximated:     " + (4 * sum));
	}
}
