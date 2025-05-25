package Algorithym_And_Structure.Mang;

import Algorithym_And_Structure.Application;
import org.springframework.boot.SpringApplication;

import java.util.Random;

public class Mang2Chieu {
    int n;
    int[][] matrixA, matrixB;

    public void Matrix(int n) {
        this.n = n;
        matrixA = new int[n][n];
        matrixB = new int[n][n];
        initValue();
    }

    public void initValue() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = random.nextInt(10);
                matrixB[i][j] = random.nextInt(10);
            }
        }
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    public void printMatrixA() {
        printMatrix(matrixA);
    }

    public void printMatrixB() {
        printMatrix(matrixB);
    }

    public int[][] sumMatrix() {
        int[][] matrixSum = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];

            }
        }
        return matrixSum;
    }

    public int[][] muntiplyMatrix() {
        int[][] resultMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    resultMatrix[i][j] += (matrixA[i][k] * matrixB[k][j]);
                }

            }
        }
        return resultMatrix;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Mang2Chieu mang2Chieu = new Mang2Chieu();
        mang2Chieu.Matrix(3);
        mang2Chieu.printMatrixA();
        mang2Chieu.printMatrixB();
//        System.out.println("A + B = ");
//        mang2Chieu.printMatrix(mang2Chieu.sumMatrix());
        System.out.println("A * B = ");
        mang2Chieu.printMatrix(mang2Chieu.muntiplyMatrix());
    }
}
