package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FrobeniusGeneralTest {

  @Test
  @ParameterizedTest
  @CsvFileSource(resources = "general-mcnugget-data.cvs", numLinesToSkip = 0)
  void isGeneralMcNugget() {
      assertEquals(value, Frobenius.isGeneralMcNugget(packSizes));
      }
  }