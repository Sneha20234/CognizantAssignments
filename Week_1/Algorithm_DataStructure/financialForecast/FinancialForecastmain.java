package financialForecast;

import java.util.*;

public class FinancialForecastmain {
	private Map<Integer, Double> memo = new HashMap<>();

    // Recursive method with memoization
    public double calculateFutureValue(double initialAmount, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return initialAmount;
        }

        // Check if result is already computed
        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        // Recursive case
        double futureValue = calculateFutureValue(initialAmount * (1 + growthRate), growthRate, years - 1);
        memo.put(years, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();
        
        double initialAmount = 1000; // Initial investment amount
        double growthRate = 0.05; // Annual growth rate (5%)
        int years = 10; // Number of years to forecast

        double futureValue = forecast.calculateFutureValue(initialAmount, growthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);
    }
}
