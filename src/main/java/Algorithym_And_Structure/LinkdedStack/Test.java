package Algorithym_And_Structure.LinkdedStack;

public class Test {
    public static void main(String[] args) {
        LinkedStack<Integer> stack=new LinkedStack<>();
        stack.push(15);
        stack.push(10);
        stack.push(5);

        int x = stack.pop();
        System.out.println(x);

        int y = stack.peek();
        System.out.println(y);

        int z = stack.pop();
        System.out.println(z);


    }
}
