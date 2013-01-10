package com.studio945.fluen_t.base

class Ratio {
    def numerator;
    def denominator;

    public static Ratio of(BigDecimal numerator, BigDecimal denominator) {
        return new Ratio(numerator, denominator);
    }

//    public static Ratio of(long numerator, long denominator) {
//        return new Ratio(BigDecimal.valueOf(numerator), BigDecimal.valueOf(denominator));
//    }

//    public static Ratio of(BigDecimal fractional) {
//        return new Ratio(fractional, BigDecimal.valueOf(1));
//    }
//
    public Ratio(BigDecimal numerator, BigDecimal denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    def decimalValue(int scale, int roundingRule) {
        return numerator.divide(denominator, scale, roundingRule);
    }

//    public boolean equals(Object anObject) {
//        try {
//            return equals((Ratio)anObject);
//        } catch(ClassCastException ex) {
//            return false;
//        }
//    }
//    public boolean equals(Ratio other) {
//        return
//        other != null &&
//                this.numerator.equals(other.numerator) && this.denominator.equals(other.denominator);
//    }
//
//    public int hashCode() {
//        return numerator.hashCode();
//    }
//
//    public Ratio times(BigDecimal multiplier) {
//        return Ratio.of(numerator.multiply(multiplier), denominator);
//    }
//
//    public Ratio times(Ratio multiplier) {
//        return Ratio.of(numerator.multiply(multiplier.numerator), denominator.multiply(multiplier.denominator));
//    }
//
//    public String toString() {
//        return numerator.toString() + "/" + denominator;
//    }
}
