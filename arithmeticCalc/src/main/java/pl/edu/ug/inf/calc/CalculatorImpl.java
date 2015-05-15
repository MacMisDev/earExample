package pl.edu.ug.inf.calc;


import java.math.BigDecimal;

public class CalculatorImpl implements Calculator{

    @Override
    public BigDecimal sum(double number1, double number2) {
        double result = number1 + number2;
        BigDecimal resultRounded = new BigDecimal(result);
        return resultRounded.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal subtract(double number1, double number2) {
        double result = number1 - number2;
        BigDecimal resultRounded = new BigDecimal(result);
        return resultRounded.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal divide(double number1, double number2) {
        double result = number1 / number2;
        BigDecimal resultRounded = new BigDecimal(result);
        return resultRounded.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal multiply(double number1, double number2) {
        double result = number1 * number2;
        BigDecimal resultRounded = new BigDecimal(result);
        return resultRounded.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
