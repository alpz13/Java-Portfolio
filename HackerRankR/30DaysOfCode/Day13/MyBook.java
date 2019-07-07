
public class MyBook extends Book {

	int price;
	
	MyBook(String title, String author, int price){
		super(title, author);
		this.price = price;
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: "+ title +"\nAuthor: "+author+"\nPrice: "+price);
	}
	
	

}
