package Algorithym_And_Structure.BracketCheker.LinkdedStack;

import Algorithym_And_Structure.LinkdedStack.LinkedStack;

public class BracketChecker {
    public static boolean isBalanced(String code){
        LinkedStack<Character> stack = new LinkedStack<>();
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }else if(ch == '}' || ch == ')' || ch == ']'){
                if(stack.isEmpty()){
                    return  false;
                }
                char top = stack.pop();
                if((ch == ']' && top != '[')||(ch == ')' && top != '(')||(ch == '}' && top != '{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
