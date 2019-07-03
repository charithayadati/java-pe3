package com.stackroute.junitdemo;

public class Matrix {


        public String sum(int row, int col, int matrix1[][], int matrix2[][]){
            String s="";
            int a[][]=new int[row][col];
            for(int i=0;i<row;i++) {
                for(int j=0;j<col;j++){
                    a[i][j]=matrix1[i][j]+ matrix2[i][j];
                    s=s+a[i][j]+" ";
                }
                s=s +"\n";
            }

            return s.trim();
        }
    }

