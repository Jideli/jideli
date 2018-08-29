// see how many subscribers
public class Tut23compundInterest {
	public static void main(String args[]) {
		// A=P(1+R)^n compound interest formula
		// A is amount, P principle 10'000, R is rate, to the power of N: number of years
		
		double amount;
		double principle = 10000;
		double rate = .01; // gaining subscribers by 1 percent per day
		
		for(int day=1;day<=20;day++) {
			amount=principle*Math.pow(1 + rate, day);
			System.out.println(day + "  " + amount);
		}
	}
}
