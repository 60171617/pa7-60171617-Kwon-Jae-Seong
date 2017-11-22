package pa7;

public class Text implements Drawable {
	String s;
	
	public Text(String s) {this.s=s;}
	
	public void draw() {
		System.out.println(s);
	}
}