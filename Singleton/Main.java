package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		TicketMaker s1 = TicketMaker.getInstance();
		TicketMaker s2 = TicketMaker.getInstance();
		System.out.println(s1.getNextTicketNumber());
		if (s1 == s2)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");

	}

}
