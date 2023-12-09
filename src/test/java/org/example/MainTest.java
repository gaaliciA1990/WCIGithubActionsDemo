package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/** Test class for {@Main} */
class MainTest {

  /** Test the concatenation of an array of number strings to a list of number strings */
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

  /** Test the print numbers class prints a list of numbers Uses contains to verify our result */
  @Test
  void printNumbersTest() {
    // ARRANGE
    PrintStream mockedPS = Mockito.mock(PrintStream.class);
    PrintStream old = System.out;
    System.setOut(mockedPS);

    String[] test = new String[5];
    test[0] = "5";
    test[1] = "10";
    test[2] = "63";
    test[3] = "2";

    String expected = "This is a list of numbers: ";

    // ACT
    List<String> result = Main.concatNumbersToList(test);
    Main.printNumbers(result);

    // ASSERT
    assertFalse(result.isEmpty());
    Mockito.verify(mockedPS).println(Mockito.contains(expected));
  }

  @Test
  void mainTest() {
    // ARRANGE
    PrintStream mockedPS = Mockito.mock(PrintStream.class);
    PrintStream old = System.out;
    System.setOut(mockedPS);

    String[] test = new String[5];
    test[0] = "23";
    test[1] = "5";
    test[2] = "13";
    test[3] = "64";

    String expected = "Hello world!";

    // ACT
    Main.main(test);

    // ASSERT
    Mockito.verify(mockedPS).println(Mockito.contains(expected));
  }
}
