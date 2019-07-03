package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;
    @Before
    public void setUp(){

        chessBoard= new ChessBoard();
    }
    @After
    public void tearDown(){
        chessBoard=null;
    }

    @Test
    public void printChessBoard(){
        // arr = new int[]{5, 4, 3, 2, 1};
        String string = chessBoard.print();
        assertEquals("WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "WW BB WW BB WW BB WW BB \n" +
                "BB WW BB WW BB WW BB WW",string);
    }


}