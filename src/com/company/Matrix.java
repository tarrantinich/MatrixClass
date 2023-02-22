package com.company;

import java.util.Random;

public class Matrix {
    private int numberOfLines;
    private int numberOfColumns;
    private int matrix[][];

    protected Matrix(int numberOfLines, int numberOfColumns) {
        this.numberOfLines = numberOfLines;
        this.numberOfColumns = numberOfColumns;
    }

    protected Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        int matrix[][] = new int[numberOfColumns][numberOfLines];
        Random random = new Random();
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
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

    public void summ(Matrix matrix1) {
        System.out.println("Сумма матриц:");
        int summMatrix[][] = new int[numberOfColumns][numberOfLines];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                summMatrix[i][j] = matrix1.getMatrix()[i][j] + matrix[i][j];
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
        int matrix[][] = new int[numberOfColumns][numberOfLines];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
//                matrix[i][j] = this.matrix[i][j] * number;
//                System.out.format("%20s", matrix[i][j]);
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
