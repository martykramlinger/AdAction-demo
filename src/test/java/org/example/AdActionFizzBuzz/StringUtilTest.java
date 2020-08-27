package org.example.AdActionFizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void numberHasThree_input_3() {
        boolean result = StringUtil.integerHas3(3);

        assertTrue(result);
    }

    @Test
    void numberHasThree_input_13() {
        boolean result = StringUtil.integerHas3(13);

        assertTrue(result);
    }

    @Test
    void numberHasThree_input_5() {
        boolean result = StringUtil.integerHas3(5);

        assertFalse(result);
    }
}