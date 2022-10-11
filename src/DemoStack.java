import java.util.Stack;

public class DemoStack {

    public static void main(String[] args) {
        Stack<Character> myStack = new Stack<>();
        myStack.push('c');
        myStack.push('a');
        myStack.push('r');

        System.out.println(myStack);

        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack);
    }
}
