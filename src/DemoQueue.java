import java.util.ArrayDeque;

public class DemoQueue {

    public static void main(String[] args) {

        ArrayDeque<Double> myQueue = new ArrayDeque<>();
        //poll() = pop()

        myQueue.add(0.12);
        myQueue.add(0.34);
        myQueue.add(2.234);

        System.out.println(myQueue);

        System.out.println(myQueue.peek());
        System.out.println(myQueue);

        System.out.println(myQueue.pop());
        System.out.println(myQueue);

        System.out.println(myQueue.poll());
        System.out.println(myQueue);

        System.out.println(myQueue.pop());
        System.out.println(myQueue);

        System.out.println(myQueue.poll());
        System.out.println(myQueue);
    }
}
