package com.studio945.fluen_t.base

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.Test

@TestMixin(GrailsUnitTestMixin)
class RatioTestTests {

    void setUp() {
        // Setup logic here
    }

    void tearDown() {
        // Tear down logic here
    }

    @Test
    void shouldReturnProperNumberWhenRoundingIsNotRequired() {
        def r3over2 = Ratio.of(new BigDecimal(3), new BigDecimal(2));
        def result = r3over2.decimalValue(1, Rounding.UNNECESSARY);
        assertEquals(new BigDecimal("1.5"), result);
    }

    @Test
    void shouldReturnProperNumberWhenRoundingDown() {
        def r10over3 = Ratio.of(new BigDecimal(10), new BigDecimal(3));
        def result = r10over3.decimalValue(3, Rounding.DOWN);
        assertEquals(new BigDecimal("3.333"), result);
    }

    @Test
    void shouldReturnProperNumberWhenRoundingUp() {
        def r10over3 = Ratio.of(new BigDecimal(10), new BigDecimal(3));
        def result = r10over3.decimalValue(3, Rounding.UP);
        assertEquals(new BigDecimal("3.334"), result);
    }

    @Test
    void shouldReturnProperNumberWhenRoundingUpToSixDecimalPositions() {
        def rManyDigits = Ratio.of(new BigDecimal("9.001"), new BigDecimal(3));
        def result = rManyDigits.decimalValue(6, Rounding.UP);
        assertEquals(new BigDecimal("3.000334"), result);
    }

    @Test
    void shouldReturnProperNumberWhenRoundingUpToSevenDecimalPlaces() {
        def rManyDigits = Ratio.of(new BigDecimal("9.001"), new BigDecimal(3));
        def result = rManyDigits.decimalValue(7, Rounding.UP);
        assertEquals(new BigDecimal("3.0003334"), result);
    }

    @Test
    void shouldReturnProperNumberWhenRoundingHalfUpToSevenDecimalPlaces() {
        def rManyDigits = Ratio.of(new BigDecimal("9.001"), new BigDecimal(3));
        def result = rManyDigits.decimalValue(7, Rounding.HALF_UP);
        assertEquals(new BigDecimal("3.0003333"), result);
    }
}
