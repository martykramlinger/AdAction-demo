package org.example.AdActionFizzBuzz.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FizzBuzzOutputServiceTest {

    private FizzBuzzOutputService classToTest;

    @BeforeEach
    void setup() {
        classToTest = new FizzBuzzOutputService();
    }

    @Test
    void getOutPutStringOf15() {
        String result = classToTest.getOutPutString(15);

        assertEquals("fizzbuzz", result);
    }

    @Test
    void getOutPutStringOf30() {
        String result = classToTest.getOutPutString(30);

        assertEquals("lucky", result);
    }

    @Test
    void getOutPutStringOf5() {
        String result = classToTest.getOutPutString(5);

        assertEquals("buzz", result);
    }

    @Test
    void getOutPutStringOf10() {
        String result = classToTest.getOutPutString(10);

        assertEquals("buzz", result);
    }

    @Test
    void getOutPutStringOf3() {
        String result = classToTest.getOutPutString(3);

        assertEquals("lucky", result);
    }

    @Test
    void getOutPutStringOf6() {
        String result = classToTest.getOutPutString(6);

        assertEquals("fizz", result);
    }

    @Test
    void getOutPutStringOf1() {
        String result = classToTest.getOutPutString(1);

        assertEquals("1", result);
    }

    @Test
    void getOutPutStringOf17() {
        String result = classToTest.getOutPutString(17);

        assertEquals("17", result);
    }

    @Test
    void verifyEndIndexCorrect() {
        FizzBuzzOutputService outPutServiceSpy = Mockito.spy(classToTest);

        outPutServiceSpy.printOutput(20);

        verify(outPutServiceSpy, times(20)).getOutPutString(anyInt());
    }


}