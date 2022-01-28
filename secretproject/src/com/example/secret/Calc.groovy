package com.example.secret

/** Class Calc
* Possibly conflicting with com.example.utils.Calc
*/
class Calc {
    BigDecimal a, b, c
    BigDecimal doMath(BigDecimal x) {
        return a*x*x + b*x + c
    }
}
