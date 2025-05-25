package Algorithym_And_Structure.Generic;

public class TinhTrungBinhCong {
    public <T > double tinhTrungBinhCong(T[] mang){
        double tong = 0;

        for (int i = 0; i < mang.length; i++) {
            double value = Double.valueOf(mang[i] + "");
            tong+=value;
        }
        return tong / mang.length;
    }

    public static void main(String[] args) {
        TinhTrungBinhCong trungBinhCong = new TinhTrungBinhCong();

        Integer[] mangInt = {5,55,2};
        String[] mangFloat = {"5.0f","55.00f","2.78f"};

        System.out.println(" Trung bình cộng int: " + trungBinhCong.tinhTrungBinhCong(mangInt));
        System.out.println(" Trung bình cộng float: " + trungBinhCong.tinhTrungBinhCong(mangFloat));

    }
}
