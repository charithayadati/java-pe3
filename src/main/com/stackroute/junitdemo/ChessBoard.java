package com.stackroute.junitdemo;
import java.util.*;
public class ChessBoard {
    public String print(){

    String[][] chessboard = new String[8][8];
    String string = "";
        for (int i = 0; i < 8; i++)
        {
        for (int j = 0; j < 8; j++) {
            chessboard[i][j] = (i + j) % 2 == 0 ? "WW" : "BB";
        }
    }
        for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            string = string + (chessboard[i][j] + " ");
        }
        string = string + "\n";
    }


        return string.trim();
}
}
