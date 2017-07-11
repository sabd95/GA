public class testGeneratePopulation {

	public static void main(String[] args) {
		
		int genes[] = new int[3];

		for(int i = 0; i < genes.length; i++) {
			genes[i] = (int)(Math.round(Math.random() * 10));
		}

		for(int i = 0; i < genes.length; i++) {
			System.out.print(genes[i] + " ");
		}
	}

}