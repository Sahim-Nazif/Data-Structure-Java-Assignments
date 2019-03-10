package TransferStacks;

import java.util.Stack;

import java.util.Stack;

public class Transfer {

    public static Stack<Integer> stackPush(Stack<Integer> stack){
        System.out.println("First stack elements ");
        for(int i = 0; i < 5; i++){

            Integer push = (Integer) stack.push(i);

           
            System.out.println(push);
        }
        return stack;

    }

    public static void pop(Stack<Integer> stack){

        for(int i = 0; i < 5; i++){

            Integer pop = (Integer) stack.pop();
            System.out.println(pop);


        }

    }


    public static void peek(Stack<Integer> stack){

        Integer peek = (Integer) stack.peek();

        System.out.println("Top of the element is: " + peek);

    }


    public static void search(Stack<Integer> stack, int element){

        System.out.println("Element searched is: ");

        Integer search = (Integer) stack.search(element);

        if(element == -1){

            System.out.println("Stack is empty.");
        }
        else{
            System.out.println("Element is: " + search);
        }


    }

    public static Stack<Integer> transfer(Stack<Integer> S_stack, Stack<Integer> T_stack){


        T_stack = stackPush(S_stack);
        System.out.println("Transformation from S_stack to T_stack ");
        System.out.println("Stack transfered successfully: "+ T_stack);

        return T_stack;

    }

    public static void main(String[] args) {

        Stack<Integer> S_stack = new Stack<>();
        Stack<Integer> T_stack= new Stack<>();

        Stack<Integer> Resultstack = transfer(S_stack, T_stack);

        

    }



}