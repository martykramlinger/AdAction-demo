package org.example.AdActionFizzBuzz.services;

import org.example.AdActionFizzBuzz.StringUtil;

//going with static methods since the only dependency injection I've done in Java is spring,
//which is not supported in Intellij Community
public class FizzBuzzOutputService {

    private static final String FIZZ_BUZZ = "fizzbuzz";
    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String LUCKY = "lucky";
    private static final String INTEGER = "integer";
    private static int fizzCounter;
    private static int buzzCounter;
    private static int fizzBuzzCounter;
    private static int luckyCounter;
    private static int leftOverIntegerCounter;

    //the range will always start at 1, going up to and stopping at topOfRange
    public static void printOutput(Integer topOfRange) {
        for (int i = 1; i <= topOfRange; i++) {
            System.out.print(getOutPutString(i) + " ");
        }
        printOutPutReport();
    }

    public static String getOutPutString(Integer number) {

        if (StringUtil.integerHas3(number)) {
            luckyCounter++;
            return LUCKY;
        }

        if (number % 15 == 0) {
            fizzBuzzCounter++;
            return FIZZ_BUZZ;
        }
        if (number % 5 == 0) {
            buzzCounter++;
            return BUZZ;
        }
        if (number % 3 == 0) {
            fizzCounter++;
            return FIZZ;
        }
        leftOverIntegerCounter++;
        return number.toString();
    }

    public static void printOutPutReport() {
        System.out.println("");
        System.out.println(getIndividualOutputString(FIZZ, fizzCounter));
        System.out.println(getIndividualOutputString(BUZZ, buzzCounter));
        System.out.println(getIndividualOutputString(FIZZ_BUZZ, fizzBuzzCounter));
        System.out.println(getIndividualOutputString(LUCKY, luckyCounter));
        System.out.println(getIndividualOutputString(INTEGER, leftOverIntegerCounter));
    }

    public static String getIndividualOutputString(String prefix, Integer counter) {
        return prefix + ": " + counter.toString();
    }

}
