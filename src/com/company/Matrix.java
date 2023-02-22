package com.company;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int numberOfLines;
    private int numberOfColumns;
    private int matrix[][];

    protected Matrix(int numberOfLines, int numberOfColumns) {
        this.numberOfLines = numberOfLines;
        this.numberOfColumns = numberOfColumns;
        int matrix1[][] = new int[numberOfColumns][numberOfLines];
        Random random = new Random();
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                matrix1[i][j] = random.nextInt(50);
            }
        }
        this.matrix = matrix1;
    }

    protected Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public void summ(Matrix myMatrix) {
        System.out.println("Сумма матриц:");
        int summMatrix[][] = new int[numberOfColumns][numberOfLines];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                summMatrix[i][j] = myMatrix.getMatrix()[i][j] + matrix[i][j];
                System.out.format("%5d", summMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public void multiplicationByNumber(int number) {
        System.out.println("Результат умножения матрицы на число:");
        int matrix[][] = new int[numberOfColumns][numberOfLines];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                matrix[i][j] = this.matrix[i][j] * number;
                System.out.format("%20s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void multiplicationMatrix(Matrix matrix1) {
        System.out.println("Произведение матриц матриц:");
        int matrixResult[][] = new int[numberOfColumns][matrix1.numberOfLines];
        if (numberOfColumns != matrix1.numberOfLines || numberOfLines != matrix1.numberOfColumns) {
            System.out.format("Количество строк в одной матрице не равно количеству столбцов в другой");
            return;
        }
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < matrix1.numberOfLines; j++) {
                for (int u = 0; u < numberOfLines; u++) {
                    matrixResult[i][j] += this.matrix[i][u] * matrix1.getMatrix()[u][j];
                }
            }
        }

        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < matrix1.numberOfLines; j++) {
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        StringBuilder myMatrix = new StringBuilder();
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                String temp = Integer.toString(matrix[i][j]);
                myMatrix = myMatrix.append(temp + "   ");
            }
            myMatrix = myMatrix.append('\n');
        }
        return myMatrix.toString();
    }
}
