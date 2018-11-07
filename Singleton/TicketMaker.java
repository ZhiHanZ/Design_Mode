package Singleton;

public class TicketMaker {
	private static TicketMaker k = new TicketMaker();
	private int ticket = 1000;
	private TicketMaker() {
		System.out.println("ticket: " + ticket);
	}
	public static TicketMaker getInstance() {
		return k;
	}
	public int getNextTicketNumber() {
		return ticket++;
	}

}
