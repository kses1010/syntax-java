package syntax.chapter11.page606;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack);

        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.empty());
        System.out.println(myStack.search(1));
        System.out.println(myStack.peek());
    }
}
