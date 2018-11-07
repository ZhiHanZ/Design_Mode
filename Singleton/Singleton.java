package Singleton;

public class Singleton {
	private static Singleton s = new Singleton();
	private Singleton() {
		System.out.println("wttyygg");
	}
	public static Singleton getSingleton() {
		return s;
	}

}
