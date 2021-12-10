import java.util.Stack;

public class StackList {

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 2; i <= 10; i++) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
            System.out.print(",");
        }
        System.out.println("LIFT-OFF!!");
    }
}
