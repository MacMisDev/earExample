package pl.edu.ug.inf.calc;


import java.math.BigDecimal;

public class CalculatorImpl implements Calculator{

    @Override
    public BigDecimal sum(double number1, double number2) {
        double result = number1 + number2;
        return new BigDecimal(result).setScale(0, BigDecimal.ROUND_HALF_EVEN);
    }

    @Override
    public BigDecimal subtract(double number1, double number2) {
        double result = number1 - number2;
        return new BigDecimal(result).setScale(0, BigDecimal.ROUND_HALF_EVEN);
    }

    @Override
    public BigDecimal divide(double number1, double number2) {
        double result = number1 / number2;
        return new BigDecimal(result).setScale(0, BigDecimal.ROUND_HALF_EVEN);
    }

    @Override
    public BigDecimal multiply(double number1, double number2) {
        double result = number1 * number2;
        return new BigDecimal(result).setScale(0, BigDecimal.ROUND_HALF_EVEN);
    }
}
