package TransferStacks;

import java.util.Stack;

public class Transfer {

    public static Stack<Integer> stackPush(Stack<Integer> stack){

        for(int i = 0; i < 5; i++){

            Integer push = (Integer) stack.push(i);

            System.out.println(push);
        }
        return stack;

    }
}