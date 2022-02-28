package collectionExample;

import java.util.Stack;

public class StackVectorExample {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(500);
		st.push(600);
		st.push(1000);
		System.out.println(st.push(502));
		System.out.println(st.pop());

	}

}
