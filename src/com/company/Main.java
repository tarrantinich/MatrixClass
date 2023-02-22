package com.company;
public class Main {

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2,3);
        Matrix matrix2 = new Matrix(2,3);
        matrix1.setMatrix(matrix1.getMatrix());
        matrix2.setMatrix(matrix2.getMatrix());
        System.out.println(matrix1 );
        System.out.println(matrix2);
        matrix1.summ(matrix2);
//       matrix1.multiplicationByNumber(5);
    }
}
