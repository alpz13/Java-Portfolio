package Creationals.Factory_Method.button;


public class HtmlButton implements Button {

    public void render() {
        System.out.println("I am a HTMLbutton");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says 'Hello world' ");
    }
}