package Algorithym_And_Structure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        float[] SizeArray = returnArray();
        indexArray(SizeArray);
        System.out.println("Thêm phần tử vào cuối mảng");
        float[] newSizeArray = AddIndexArrayEnd(SizeArray);
        for (int i = 0; i < newSizeArray.length; i++) {
            System.out.print(newSizeArray[i] + " ");
        }
        System.out.println("Tổng 2 phần tử đầu tiên "+sum2First(SizeArray) );

        System.out.println("Tổng các phần tử trong mảng "+sumAll(SizeArray));
        System.out.println("Lấy một só tự nhiên trong mảng "+ showRandom( SizeArray));
        System.out.println("Lấy phần tử nhỏ nhất trong mảng "+  showSmallIndex(SizeArray));


    }

    static public float[] returnArray() {
        System.out.print("Nhập vào số lượng phần tử");
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        float[] array = new float[size];
        return array;
    }

    static public float[] indexArray(float[] index) {
        Random random = new Random();
        for (int i = 0; i < index.length; i++) {
            index[i] = random.nextFloat();
            System.out.print(index[i] + " ");
        }
        return index;
    }

    static public float[] AddIndexArrayEnd(float[] SizeArray) {
        Random random = new Random();
        float[] temp = Arrays.copyOf(SizeArray , SizeArray.length + 1);
        for (int i = 0; i < SizeArray.length; i++) {
            temp[1] = SizeArray[1];
        }
        temp[temp.length -1] = random.nextFloat();
        return temp;
    }

    static public float sum2First(float[] SizeArray) {
        float sum2First=0;
        for (int i = 0; i < 2 && i < SizeArray.length; i++) {
            sum2First = sum2First + SizeArray[i];
        }
         return sum2First;
    }

    static public float sumAll(float[] SizeArray) {
        float sumAll=0;
        for (int i = 0; i < SizeArray.length; i++) {
            sumAll = sumAll+SizeArray[i];
        }
        return sumAll;
    }

    static public float showRandom(float[] SizeArray) {
       Random random = new Random();
       int randomInt= random.nextInt(SizeArray.length);
       float index = 0;
        for (int i = 0; i < SizeArray.length; i++) {
            if(i == randomInt){
                index = SizeArray[i];
            }
        }
        return index;
    }

    static public float showSmallIndex(float[] SizeArray) {
        float index = SizeArray[0];
        for (int i = 1; i < SizeArray.length; i++) {
                if(index>SizeArray[i]){
                    index=SizeArray[i];
                }
        }
        return index;
    }
}
