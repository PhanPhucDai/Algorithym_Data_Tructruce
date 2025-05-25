package Algorithym_And_Structure.Mang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mang1Chieu {

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
