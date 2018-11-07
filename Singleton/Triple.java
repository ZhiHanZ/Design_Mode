package Singleton;

public class Triple {
	private int num = 0;
	private static Triple[] triple = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2)	
	};
	private Triple(int id){
		System.out.println("num = " + num);	
	}
	public static Triple getInstance(int id) {
		return triple[id];
		
	}

}
