package org.example.AdActionFizzBuzz.services;

import org.example.AdActionFizzBuzz.StringUtil;

//going with static methods since the only dependency injection I've done in Java is spring,
//which is not supported in Intellij Community
public class FizzBuzzOutputService {

    private static final String FIZZ_BUZZ = "fizzbuzz";
    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String LUCKY = "lucky";

    //the range will always start at 1, going up to and stopping at topOfRange
    public static void printOutput(Integer topOfRange) {
        for (int i = 1; i <= topOfRange; i++) {
            System.out.print(getOutPutString(i) + " ");
        }
    }

    public static String getOutPutString(Integer number) {

        if (StringUtil.integerHas3(number)) {
            return LUCKY;
        }

        if (number % 15 == 0) {
            return FIZZ_BUZZ;
        }
        if (number % 5 == 0) {
            return BUZZ;
        }
        if (number % 3 == 0) {
            return FIZZ;
        }
        return number.toString();
    }
}
