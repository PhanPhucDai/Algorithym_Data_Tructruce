package Algorithym_And_Structure.Stack;

public class StringReversal {
    public static String reverseString(String input) {
        ArrayStack<Character> stack = new ArrayStack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder stringReversed = new StringBuilder();
        while(!stack.isEmpty()){
            stringReversed.append(stack.pop());
        }
        return stringReversed.toString();
    }
}
