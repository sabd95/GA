public class Individual {
	
	static int defaultGeneLength = 3;
	private int genes[] = new int[defaultGeneLength];
	// Cache
	private int fitness = 0;

	// Create a random individual
	public void generateIndividual() {
		for(int i = 0; i < size(); i++) {
			int gene = (int) Math.round(Math.random() * 10);
			genes[i] = gene;
		}
	}

	/* Getters and setters */
    // Use this if you want to create individuals with different gene lengths
    public static void setDefaultGeneLength(int length) {
        defaultGeneLength = length;
    }
    
    public int getGene(int index) {
        return genes[index];
    }

    public void setGene(int index, int value) {
        genes[index] = value;
        fitness = 0;
    }

    /* Public methods */
    public int size() {
        return genes.length;
    }

    public int getFitness() {
        if (fitness == 0) {
            fitness = FitnessCalc.getFitness(this);
        }
        return fitness;
    }

}