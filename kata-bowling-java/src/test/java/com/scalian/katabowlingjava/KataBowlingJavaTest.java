package com.scalian.katabowlingjava;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("KataBowlingJava test")
class KataBowlingJavaTest {
	
	
	Bowling bowling;

    @BeforeEach                                         
    void setUp() {
        bowling = new Bowling();
    }

  @Test
  @DisplayName("test score for a new game")
  void testScoreNewGame() {
    assertEquals(0, bowling.getScore(), "new game -> score equals 0");
  }
}