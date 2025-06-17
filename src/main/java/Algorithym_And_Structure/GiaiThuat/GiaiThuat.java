package Algorithym_And_Structure.GiaiThuat;

import java.lang.reflect.Array;
import java.util.*;

public class GiaiThuat {
    //2. Trình bày thuật toán tính trung bình cộng dãy số a1,a2, a3,...., an
    public double trungBinhCong() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhập vào độ dài của mảng");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }


        double trungBinhCong = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Dãy số trong mảng " + arr[i]);
            trungBinhCong += arr[i];
        }
        return trungBinhCong /= arr.length;
    }

    //Trình bày thuật toán tính trung bình cộng các số lẻ và chia cho 3 trong dãy số a1, a2, a3,....,an
    public double trungBinhCongCacSoLe() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhập vào độ dài của mảng");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }


        double trungBinhCong = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Dãy số trong mảng " + arr[i]);
            if (arr[i] % 2 != 0) {
                trungBinhCong += arr[i];
            }
        }
        return trungBinhCong /= 3;
    }

    //4. Trình bày thuật toán nhập vào 3 điểm A(X,ya), A(Xa,ya), A(Xaiya) có là lập thành hình tam giác
    //hay không, nếu có kiểm tra xem tam giác trên có phải là tam giác cân hay không?
    public void kiemTraTamGiac() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 điểm của TAM GIÁC");
        System.out.println("Tọa độ điểm A");
        System.out.println("Điểm A01");
        int a1 = sc.nextInt();
        System.out.println("Điểm A02");
        int a2 = sc.nextInt();
        System.out.println("Tọa độ điểm B");
        System.out.println("Điểm B01");
        int b1 = sc.nextInt();
        System.out.println("Điểm B02");
        int b2 = sc.nextInt();
        System.out.println("Tọa độ điểm C");
        System.out.println("Điểm C01");
        int c1 = sc.nextInt();
        System.out.println("Điểm C02");
        int c2 = sc.nextInt();
        double resultTamGiac = 0.5 * Math.abs(a1 * (b2 - c2) + b1 * (c2 - a2) + c1 * (a2 - b2));

        double ab = Math.sqrt(Math.pow(b1 - a1, 2) + Math.pow(b2 - a2, 2));
        double bc = Math.sqrt(Math.pow(c1 - b1, 2) + Math.pow(c2 - b2, 2));
        double ac = Math.sqrt(Math.pow(c1 - a1, 2) + Math.pow(c2 - a2, 2));

        if (resultTamGiac != 0) {
            System.out.println("Là Tam Giác");
            if (ab == ac || ab == bc || ac == bc) {
                System.out.println("Là Tam Giác Cân");
            }
        } else {
            System.out.println("Không phải Là Tam Giác");
        }

    }

    //Trình bày thuật toán nhập dãy số a1,a2, a3,...., an, sắp xếp và in ra màn hình dãy số tăng dần.
    public int[] arrRandom() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void mangTangDan() {
        int[] arr = arrRandom();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Mảng khi sắp xếp");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void mangGiamDan() {
        int[] arr = arrRandom();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Mảng khi sắp xếp");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void maxShow() {
        int[] arr = arrRandom();
        int value = 0;
        int maxCount = 1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                value = arr[i];
            }
        }
        System.out.println("Số " + value + " Xuất hiện nhiều nhất " + maxCount);

    }

    public void showMaxSize() {
        int[] arr = arrRandom();
        int[] maxArray = new int[0];
        int maxChuoiTang = 1;
        for (int i = 0; i < arr.length; i++) {
            int chuoiTang = 1;
            ArrayList<Integer> arrayItem = new ArrayList<>();
            arrayItem.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[j - 1]) {
                    chuoiTang++;
                    arrayItem.add(arr[j]);
                } else {
                    break;
                }
            }

            if (chuoiTang > maxChuoiTang) {
                maxChuoiTang = chuoiTang;
                maxArray = new int[arrayItem.size()];
                for (int j = 0; j < arrayItem.size(); j++) {
                    maxArray[j] = arrayItem.get(j);
                }
            }
        }

        System.out.println(" Các chuỗi tăng dài nhất là: " + maxChuoiTang);
        for (int j = 0; j < maxArray.length; j++) {
            System.out.println(" " + maxArray[j]);
        }
    }

    public void SoAmLonNhat() {
        int[] arr = arrRandom();
        ArrayList<Integer> maxArray = new ArrayList<>();
        int maxChuoiTang = 1;
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < 0) {
                    if (arr[i] < arr[j]) {
                        count += 1;
                        value = arr[i];
                    } else if (arr[i] > arr[j]) {
                        value = arr[i];
                    }
                }
            }
            if (count == 1) {
                maxArray.add(value);
            }
            value = 0;
        }

        System.out.println(" Các chuỗi tăng dài nhất là: ");
        for (int i = 0; i < maxArray.size(); i++) {
            System.out.println(" " + maxArray.get(i));

        }
    }

    //Viết chương trình nhập vào 3 số nguyên a, b, c; in ra số lớn nhất, nếu 3 số bằng nhau thì in dấu "="
    public static Object maxNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 số nguyên");
        int[] n = new int[3];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        int maxNumber = 0;
        int sameNumber = 0;
        for (int i = 0; i < n.length; i++) {
            if (maxNumber < n[i]) {
                maxNumber = n[i];
            }
            if (maxNumber == n[i]) {
                sameNumber++;
            }

        }

        if (n.length == sameNumber) {
            return "=";
        } else {
            return maxNumber;
        }

    }

    //Viết chương trình nhập vào 1 số nguyên dương n. In ra số lượng số chia hết cho 3 trong các số từ 1 đến n
    public static int chiaHetCho3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên");
        int n = sc.nextInt();
        int countMunti3 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                countMunti3++;
            }
        }
        return countMunti3;
    }

    //Nhập vào 1 mảng số nguyên a có n phần tử. Tìm số nguyên lớn nhì trong mảng
    public static int soLonThu2() {
        int[] arr = mangSoNguyen();
        int maxNumeber = 0;
        int lonThuHai = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNumeber < arr[i]) {
                maxNumeber = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (lonThuHai < arr[i] && arr[i] < maxNumeber) {
                lonThuHai = arr[i];
            }
        }
        return lonThuHai;

    }

    //Nhập vào 1 mảng số nguyên a có n phần tử. Tìm số nguyên lớn thứ ba trong mảng.
    public static int soLonThu3() {
        int[] arr = mangSoNguyen();
        int maxNumeber = 0;
        int lonThuHai = 0;
        int lonThuBa = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumeber) {
                maxNumeber = arr[i];
            } else if (arr[i] < maxNumeber && arr[i] > lonThuHai) {
                lonThuHai = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (lonThuBa < arr[i] && lonThuHai > arr[i]) {
                lonThuBa = arr[i];
            }
        }
        return lonThuBa;
    }

    //.Nhập vào 1 mảng số nguyên a. Đếm xem trong mảng có bao nhiêu số nguyên khác nhau.
    public static int diffNumber() {
        int[] arr = mangSoNguyen();
        int count = 0;
        int index = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != index) {
                index = arr[i];
                count++;
            }
        }
        return count;
    }

    //.Nhập vào 1 mảng số nguyên a có n phần tử. Đếm số lần xuất hiện của từng số trong mảng.
    public static Map<Integer, Integer> countShowNumber() {
        int[] arr = mangSoNguyen();
        int count = 1;
        Map<Integer, Integer> printShowNumber = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (!printShowNumber.containsKey(arr[i]) && arr[i] == arr[j]) {
                    count++;
                }
            }
            if (!printShowNumber.containsKey(arr[i])) {
                printShowNumber.put(arr[i], count);
            }
            count = 0;
        }
        return printShowNumber;
    }

    //.Nhập vào 1 mảng số nguyên a có n phần tử. Tìm số nguyên xuất hiện nhiều lần nhất trong mảng
    // (nếu có nhiều số cùng xuất hiện nhiều nhất thì lấy số đầu tiên xuất hiện nhiều nhất).
    public static void countMaxShowNumber() {
        int[] arr = mangSoNguyen();
        int count = 1;
        Map<Integer, Integer> printShowNumber = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (!printShowNumber.containsKey(arr[i]) && arr[i] == arr[j]) {
                    count++;
                }
            }
            if (!printShowNumber.containsKey(arr[i])) {
                printShowNumber.put(arr[i], count);
            }
            count = 0;
        }

        int maxCount = 0;
        int maxNumber = arr[0];
        for (Map.Entry<Integer, Integer> entry : printShowNumber.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxNumber = entry.getKey();
            }
        }
        System.out.println("Số xuất hiện nhiều nhất là: " + maxNumber + " (xuất hiện " + maxCount + " lần)");
    }

    //.Viết chương trình nhập vào 1 chuỗi. In chuỗi đó với mỗi ký tự trên 1 dòng.
    public static void fillterString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String neededFillter = sc.nextLine();

         neededFillter = neededFillter.trim().replaceAll("\\s+", " ");

         for (int i = 0; i < neededFillter.length(); i++) {
            System.out.print(neededFillter.charAt(i));
        }
    }

    //.Viết chương trình nhập vào 1 chuỗi. Đếm xem trong chuỗi đó có bao nhiêu từ.
     public static void countWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String neededFillter = sc.nextLine();
        neededFillter = neededFillter.trim().replaceAll("\\s+"," ");
        int count =1;
        for (int i = 0; i < neededFillter.length(); i++) {
            if(neededFillter.charAt(i) == ' '){
                count++;
            }
         }
         System.out.print("  chuỗi có: "+ count + "từ" );
     }

    //Viết chương trình đảo ngược các ký tự từng từ trong câu vừa nhập. vd: tôi đi học -->iot id coh.
    public static void reverseWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String neededReversed = sc.nextLine();
        System.out.println("Chuỗi sao khi đảo ngược");
        StringBuilder tranfomToBuider = new StringBuilder(neededReversed);

        Stack<Character> arrayRevered = new Stack<>();
        for (int i = 0; i < tranfomToBuider.length(); i++) {
            arrayRevered.push(tranfomToBuider.charAt(i));
        }
        while (!arrayRevered.isEmpty()) {
            System.out.print(arrayRevered.pop());
        }
    }

    //.Viết chương trình nhập vào 1 chuỗi s1. Đếm xem chuỗi s2 xuất hiện trong chuỗi s1 bao nhiêu lần.
    public static void countString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s1 = sc.nextLine();
        String s2 = "ab";
        System.out.println("Chuỗi sao khi đảo ngược");
        int count = 0;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
                 if(s1.substring(i,i+s2.length()).equals(s2)){
                    count++;

            }
        }
        System.out.println("chuỗi s2 xuất hiện "+ count+" lần");
    }

    //.Viết chương trình nhập vào 1 chuỗi s. Đếm xem trong chuỗi s có bao nhiêu ký tự khác nhau.
    public static void countChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s1 = sc.nextLine();
         Map<Character, Integer> countCharMap = new HashMap<>();
        for (int i = 0; i < s1.length() ;i++) {
            if(countCharMap.containsKey(s1.charAt(i))){
                char key = s1.charAt(i);
                Integer value = countCharMap.get(key);
                countCharMap.put(key, value+1);
            }else{
                countCharMap.put(s1.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countCharMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            System.out.println("Key: " + key + ", Value: " + value);
        }



    }

    //.Viết chương trình nhập vào 1 chuỗi s. Tìm ký tự xuất hiện nhiều lần nhất trong chuỗi(không phân biệt chữ in hay thường,
    // không tính khoảng trắng, nếu có nhiều ký tự xuất hiện nhiều nhất thì lấy ký tự đầu tiên tính từ trái sang).
    public static void maxCountChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s1 = sc.nextLine();
        Map<Character, Integer> countCharMap = new HashMap<>();
        for (int i = 0; i < s1.length() ;i++) {
            if(countCharMap.containsKey(s1.charAt(i))){
                char key = s1.charAt(i);
                Integer value = countCharMap.get(key);
                countCharMap.put(key, value+1);
            }else{
                countCharMap.put(s1.charAt(i), 1);
            }
        }
        char maxChar = 0;
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : countCharMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Ký tự xuất hiện nhiều nhất: " + maxChar);
        System.out.println("Số lần xuất hiện: " + maxCount);

    }

    //.Viết chương trình nhập vào 1 chuỗi s. Tìm vị trí thứ 2 mà ký tự x xuất hiện trong chuỗi s.
    public static void maxSecondCountChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s1 = sc.nextLine();
        Map<Character, Integer> countCharMap = new HashMap<>();
        for (int i = 0; i < s1.length() ;i++) {
            if(countCharMap.containsKey(s1.charAt(i))){
                char key = s1.charAt(i);
                Integer value = countCharMap.get(key);
                countCharMap.put(key, value+1);
            }else{
                countCharMap.put(s1.charAt(i), 1);
            }
        }
        char maxChar = 0;
        int maxCount = 0;
        char maxSecondChar = 0;
        int maxSecondCount = 0;
        for (Map.Entry<Character, Integer> entry : countCharMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        for (Map.Entry<Character, Integer> entry : countCharMap.entrySet()) {
            if (entry.getValue() < maxCount && entry.getValue() >  maxSecondCount) {
                maxSecondCount = entry.getValue();
                maxSecondChar = entry.getKey();
            }
        }


        System.out.println("Ký tự xuất hiện nhiều thứ hai: " + maxSecondChar);
        System.out.println("Số lần xuất hiện: " + maxSecondCount);

    }

    //.Viết chương trình nhập vào 1 xâu s. Đếm xem trong xâu có bao nhiêu ký tự in hoa.
    public static void countUppercase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s1 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(Character.isUpperCase(s1.charAt(i))){
                count++;
            }
        }
        System.out.println("Số kí tự in hoa là: " + count);

    }

    //.Viết chương trình nhập vào họ và tên của 1 người. In ra tên của người đó.
    public static void printName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s1 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(Character.isUpperCase(s1.charAt(i))){
                count++;
            }
        }
        System.out.println("Số kí tự in hoa là: " + count);

    }

    public static void main(String[] args) {
        countUppercase();
    }

    //nhập mảng số nguyên
    public static int[] mangSoNguyen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhâp vào độ dài của mảng");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhâp vào phần tử thứ" + i + "của mảng");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
