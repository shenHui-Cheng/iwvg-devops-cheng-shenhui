package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void setUp() {
        this.fraction = new Fraction(1,5);
    }

    @Test
    void testEmptyFractionConstructor() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        assertEquals(1, this.fraction.getNumerator());
    }

    @Test
    void testSetNumerator() {
        this.fraction.setNumerator(7);
        assertEquals(7, this.fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(5, this.fraction.getDenominator());
    }

    @Test
    void testSetDenominator() {
        this.fraction.setDenominator(9);
        assertEquals(9, this.fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.2, this.fraction.decimal());
    }

    @Test
    void testIsPoper(){
        assertEquals(true, this.fraction.isProper());
    }

    @Test
    void testIsImproper(){
        this.fraction.setNumerator(7);
        assertEquals(true, this.fraction.isImproper());
    }

    @Test
    void testIsEquivalent(){
            Fraction fraction1 = new Fraction(5,6);
            Fraction fraction2 = new Fraction(50, 60);
            assertEquals(true, this.fraction.isEquivalent(fraction1,fraction2));
    }
}
