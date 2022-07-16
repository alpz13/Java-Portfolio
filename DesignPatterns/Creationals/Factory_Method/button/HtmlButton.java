
public class HtmlButton implements Button {
	
	public void render() {
		System.out.println("I am a HTMLbutton");
		onClick();
	}

	public void onClick() {
		Systen.out.println("Click! Button says 'Hello world' ");
	}
}