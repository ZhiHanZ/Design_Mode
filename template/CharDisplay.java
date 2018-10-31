package template;

public class CharDisplay extends AbstractDisplay {
	char ch;
	public CharDisplay(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(ch);
	}
	public void open() {
		// TODO Auto-generated method stub
		System.out.print("<<");
		
	}
	public void close() {
		// TODO Auto-generated method stub
		System.out.println(">>");
	}
	
}
