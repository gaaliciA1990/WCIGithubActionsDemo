package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MainTest {

    @Test
    void concatNumbersToListTest() {
        // ARRANGE
        String[] test = new String[5];
        test[0] = "5";
        test[1] = "10";
        test[2] = "63";
        test[3] = "2";

        List<String> result = new ArrayList<>();

        // ACT
        result = Main.concatNumbersToList(test);

        // ASSERT
        assertFalse(result.isEmpty());
        assertEquals("10", result.get(1));
    }
}
