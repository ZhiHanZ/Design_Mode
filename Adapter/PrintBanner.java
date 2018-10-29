package Adapter;

public class PrintBanner  extends Banner implements Print {
	public PrintBanner(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	public void printWeek() {
		showWithParen();
	}
	public void printStrong() {
		showWithAster();
	}
}
