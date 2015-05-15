package pl.edu.ug.inf.service;

import org.springframework.stereotype.Service;
import pl.edu.ug.inf.calc.Calculator;
import pl.edu.ug.inf.calc.CalculatorImpl;

import java.math.BigDecimal;

@Service
public class CalcServiceImpl implements CalcService{

    @Override
    public String count(double number1, double number2, String operation) {
        Calculator calc = new CalculatorImpl();
        BigDecimal result = new BigDecimal(0);

        if(operation.equals("+")){
            result = calc.sum(number1, number2);
        }else if(operation.equals("-")){
            result = calc.subtract(number1, number2);
        }else if(operation.equals("/")){
            result = calc.divide(number1, number2);
        }else if(operation.equals("*")){
            result = calc.multiply(number1, number2);
        }

        return result.toString();
    }

}
