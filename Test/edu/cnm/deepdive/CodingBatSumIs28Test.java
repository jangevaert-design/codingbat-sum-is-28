package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatSumIs28Test {

  private int[][] sumParams = {
      {2, 3, 2, 2, 4, 2},
      {2, 3, 2, 2, 4, 2, 2},
      {1, 2, 3, 4},
      {2, 2, 2, 2},
      {1, 2, 2, 2, 2, 4},
      {},
      {2},
      {8},
      {2, 2, 2},
      {2, 2, 2, 2, 2},
      {1, 2, 2, 1, 2, 2},
      {5, 2, 2, 2, 4, 2}
  };

  private boolean[] sumExpected = {true, false, false, true, true, false, false, false, false,
      false,
      true, true};

  @Test
  void sumTest() {
    for (int i = 0; i < sumParams.length; i++) {
      boolean actual = CodingBatSumIs28.sum28(sumParams[i]);
      Assertions.assertEquals(actual, sumExpected[i]);
    }
  }

}