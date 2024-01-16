import java.util.Stack;

public class stk {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<10;i++){
            stk.push(i);
        }

        System.out.println(stk.peek());

        for(int i=0;i<5;i++){
            stk.pop();
        }

        System.out.println(stk.peek());        
    }
}
