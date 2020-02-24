package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FrobeniusTest {

  @ParameterizedTest
  @CsvFileSource(resources = "mcnugget-data.csv", numLinesToSkip = 1)
  void isMcNugget(int value, boolean expected) {
    assertEquals(expected, Frobenius.isMcNugget(value));
  }
}

  @ParameterizedTest
  @CsvFileSource(resources = "general-mcnugget-data.cvs", numLinesToSkip = 1)
  void isGeneralMcNugget(int value, boolean expected) {
    assertArrayEquals(expected, );
      (expected, Frobenius.isMcNugget(value));

    }
  }
}