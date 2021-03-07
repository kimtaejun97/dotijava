package CollectionEX.ArrayListEX;

import java.util.ArrayList;

class MyStack<T>{
    private ArrayList<T> arrayListStack = new ArrayList<>();

    public void push(T data){
        arrayListStack.add(data);
        System.out.println("push : "+data);
    }

    public T pop(){
        int len = arrayListStack.size();
        if (arrayListStack.size() == 0) {
            System.out.println("Empty");
            return null;
        }
        return arrayListStack.remove(len-1);
    }

    public T peek(){
        int len = arrayListStack.size();
        if (arrayListStack.size() == 0) {
            System.out.println("Empty");
            return null;
        }
        return arrayListStack.get(len-1);
    }
}

public class StackTest {
    public static void main(String[] args){
        MyStack stack = new MyStack();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push(1);
        System.out.println("peek : "+stack.peek());

        System.out.println("pop : "+stack.pop());
        System.out.println("peek : "+stack.peek());
        System.out.println("pop : "+stack.pop());
        System.out.println("peek : "+stack.peek());
        System.out.println("pop : "+stack.pop());
        System.out.println("peek : "+stack.peek());
    }
}
