package Algorithym_And_Structure.Generic;

public class Test {
    public static void main(String[] args) {
//        Dictionary<String, String> di = new Dictionary<String, String>("Hello", "Xin Chào");
//        System.out.println(di.toString());
//
//        Dictionary<String, String>[] tuDienAnhViet = new Dictionary[10];
//        tuDienAnhViet[0] = new Dictionary<String, String>("Hello", "Xin Chào");
//        tuDienAnhViet[1] = new Dictionary<String, String>("hi", "Xin Chào");
//        tuDienAnhViet[2] = new Dictionary<String, String>("device", "Thiêt bị");
//        tuDienAnhViet[3] = new Dictionary<String, String>("Name", "Tên");
//        tuDienAnhViet[4] = new Dictionary<String, String>("Structure", "Cấu trúc");
//        for (int i = 0; i < tuDienAnhViet.length; i++) {
//            System.out.println(tuDienAnhViet[i]);
//        }
        Dictionary<Integer, Character>[] bangMaASCII = new Dictionary[256];
        bangMaASCII[0] = new Dictionary<>(32 , ' ');
        bangMaASCII[1] = new Dictionary<>(32 , '!');
        for (int i = 0; i < bangMaASCII.length; i++) {
            System.out.println(bangMaASCII[i]);
        }
    }
}
