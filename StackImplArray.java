package stack;

import java.util.ArrayList;
import java.util.Arrays;

class MyStackArray{
	
	int arr[];
	
	// keep track of top index
	int top;
	
	// array size
	int cap;
	
	MyStackArray(int x){
		this.top = -1;
		this.cap = x;
		this.arr = new int[cap];
	}
	
	protected void push(int value) {
		this.top++;
		this.arr[top] = value;
//		return this.arr;
	}
	
	protected int pop() {
		int result = this.arr[this.top];
		this.arr[this.top] = 0;
		this.top--;
		return result;
	}
	
	protected int size() {
		return this.top+1;
	}
	
	protected int peak() {
		return this.arr[this.top];
	}
	
	protected boolean isEmpty() {
		return (top == -1);
	}
	
}

class MyStackArrayList{
	
	ArrayList<Integer> al = new ArrayList<>();
	
//	MyStackArrayList(){
//		
//	}
	
	protected void push(int value) {
		this.al.add(value);
	}
	
	protected int pop() {
		int result = this.al.get(this.al.size()-1);
		this.al.remove(this.al.size()-1);
		return result;
	}
	
	protected int peak() {
		return this.al.get(this.al.size()-1);
	}
	
	protected boolean isEmpty() {
		return this.al.isEmpty();
	}
	
	protected int size() {
		return this.al.size();
	}
}

public class StackImplArray {

	public static void main(String[] args) {
		MyStackArray m = new MyStackArray(10);
		m.push(05);
		m.push(10);
		m.push(20);
		
		System.out.println(Arrays.toString(m.arr));
		System.out.println(m.size());
		
		System.out.println(m.pop());
		
		System.out.println(Arrays.toString(m.arr));
		System.out.println(m.size());
		System.out.println(m.peak());
		
		System.out.println(Arrays.toString(m.arr));
		
		System.out.println(m.pop());
		System.out.println(m.isEmpty());
		System.out.println(m.pop());
		
		System.out.println(m.isEmpty());
		
		// *****************************************************************
		
	}

}
