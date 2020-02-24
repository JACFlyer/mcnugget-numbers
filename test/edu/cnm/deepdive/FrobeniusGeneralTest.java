package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FrobeniusTest {

  @Test
  void isGeneralMcNugget() {

    @ParameterizedTest
    @CsvFileSource(resources = "general-mcnugget-data.cvs", numLinesToSkip = 1)
    void isMcNugget ( int value, boolean expected){
      assertArrayEquals();
      (expected, Frobenius.isMcNugget(value));

    }
  }
}