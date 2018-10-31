package template;


public class StringDisplay extends AbstractDisplay {
	String string;
	int width;
	int widtht;
	public StringDisplay(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
		this.width = string.getBytes().length;
		this.widtht = string.length();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("|" + string + "|");
	}

	public void open() {
		// TODO Auto-generated method stub
		System.out.print("+");
		for (int i = 0; i < widtht; i++)
	      {
	         System.out.print("-");
	      }
	    System.out.println("+");
	}

	public void close() {
		// TODO Auto-generated method stub
		printLine();
	}
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++)
	      {
	         System.out.print("-");
	      }
	    System.out.println("+");
	}

}
