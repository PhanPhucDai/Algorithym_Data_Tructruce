package Algorithym_And_Structure.Stack;

public class Test {
    public static void main(String[] args) {
        int input = 25;
        System.out.println("Trước khi đảo ngược " + NhiPhan.tinhNhiPhan(input));
        System.out.println("Sau khi đảo ngược " + StringReversal.reverseString(String.valueOf(NhiPhan.tinhNhiPhan(input))));

    }
}
