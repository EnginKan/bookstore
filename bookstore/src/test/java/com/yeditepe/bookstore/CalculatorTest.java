package com.yeditepe.bookstore;


import com.yeditepe.bookstore.model.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

@Test
    public void test1(){
    int input1=4;
    int input2=5;
    int expected=9;
    int actual= Calculator.add(input1,input2);
    assertEquals(expected,actual);

}

}
