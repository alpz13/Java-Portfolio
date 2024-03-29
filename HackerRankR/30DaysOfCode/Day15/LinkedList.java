
import java.util.Scanner;

public class LinkedList {
	
    public static Node insert(Node head,int data) {
        //Complete this method
    	if(head == null) {
    		head = new Node(data);
    	} else {
    		Node curr = head;
    		while(curr.next != null) {
    			curr = curr.next;
    		}
    		curr.next = new Node(data);
    	}
    	return head;
    }

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}
