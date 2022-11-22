package stack;

class Node{
	int data;
	// self referential structure
	Node next;
	
	Node(int x){
		this.data = x;
		this.next = null;
	}
}

// constant time - time complexity of every function in O(1)
class MyStack{
	Node head;
	int size;
	
	MyStack(){
		this.head = null;
		this.size = 0;
	}
	
	protected void push(int value) {
		Node temp = new Node(value);
		temp.next = this.head;
		head = temp;
		this.size++;
		// 30->20->10->05
	}
	
	protected int pop() {
		if(head==null) {return Integer.MAX_VALUE;}
		int res = head.data;
		head = head.next;
		size--;
		return res;
	}
	
	protected int size() {
		return size;
	}
	
	protected boolean isEmpty() {
		return head==null;
	}
	
	protected int peak() {
		if(head==null) return Integer.MAX_VALUE;
		
		return head.data;
	}
}

public class StackLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
