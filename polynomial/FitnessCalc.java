public class FitnessCalc {
	
	static int solution[] = new int[3];

	/* Public methods */
	// Set a candidate solution as an int array
	public static void setSolution (int[] solution) {
		solution = this.solution;
	}

	// Calculate individuals' fitness by comparing it to our candidate solution
	static int getFitness() {

		int fitness = 0;

		// Loop through our individuals' genes and compare them to our candidate's
		for(int i = 0; i < Individual.size() && i < solution.length; i++) {
			if(Individual.getGene(i) == solution[i]) {
				fitness++;
			}
		}

		return fitness;
	}

	// Get optimum fitness
	static int getMaxFitness() {
		int maxFitness = solution.length;
		return maxFitness;
	}
}