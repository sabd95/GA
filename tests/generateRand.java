public class generateRand {
	
	public static void main(String[] args) {
		
		double curr;
		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;

		for(int i = 0; i < 1000; i++) {

			curr = (Double)(Math.random() * 1.00);
			if(curr > 0 && curr <= 0.25) {q1++;}
			else if(curr > 0.25 && curr <= 0.5) {q2++;}
			else if(curr > 0.5 && curr <= 0.75) {q3++;}
			else {q4++;}
		}

		System.out.println("q1: " + q1 + " q2: " + q2 + " q3: " + q3 + " q4: " + q4);
	}
}