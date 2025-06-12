package Algorithym_And_Structure.BracketCheker.LinkdedStack;

public class Test {
    public static void main(String[] args) {
        String code1 = "{([])}";
        String code2 = "{([)}";
        String code3 = "{([})}";
        String code4 =" public void push(T item);\n" +
                "    public T pop();\n" +
                "    public T peek();\n" +
                "    public boolean isEmpty();\n" +
                "    public int size();\n" +
                "    public  String toString();";

        System.out.println("Check code 1" + BracketChecker.isBalanced(code1));
        System.out.println("Check code 2" + BracketChecker.isBalanced(code2));
        System.out.println("Check code 3" + BracketChecker.isBalanced(code3));
        System.out.println("Check code 4" + BracketChecker.isBalanced(code4));


    }
}
