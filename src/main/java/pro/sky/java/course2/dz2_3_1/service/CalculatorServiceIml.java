package pro.sky.java.course2.dz2_3_1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceIml{

    public double plus(double num1, double num2) {
        return num1 + num2;
    }
    public double minus(double num1, double num2) {
        return num1 - num2;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}
