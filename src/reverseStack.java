import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseStack {
    private static void reverseQueue(Queue<Integer> queue) {
        int n = queue.size();
        Stack<Integer> stack = new Stack<>();
        // Remove all the elements from queue and push them to stack
        for (int i = 0; i < n; i++) {
            int curr = queue.poll();
            stack.push(curr);
        }
        // Pop out elements from the stack and push them back to queue
        for (int i = 0; i < n; i++) {
            int curr = stack.pop();
            queue.add(curr);
        }
        // Print the reversed queue
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Example 1
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(8);
        q1.add(4);
        q1.add(23);
        reverseQueue(q1);
        // Example 2
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(11);
        q2.add(98);
        q2.add(31);
        q2.add(42);
        q2.add(73);
        q2.add(6);
        reverseQueue(q2);
    }
}