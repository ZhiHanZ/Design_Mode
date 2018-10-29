package Adapter;

public class Main {

	public static void main(String[] args) {
		String string = "Hello World!";
		Print target = new PrintBanner(string);
		target.printWeek();
		target.printStrong();

	}

}
