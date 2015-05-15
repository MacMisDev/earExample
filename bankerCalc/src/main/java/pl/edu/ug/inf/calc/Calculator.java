package pl.edu.ug.inf.calc;

import java.math.BigDecimal;

public interface Calculator {

    public BigDecimal sum(double number1, double number2);
    public BigDecimal subtract(double number1, double number2);
    public BigDecimal divide(double number1, double number2);
    public BigDecimal multiply(double number1, double number2);
}
