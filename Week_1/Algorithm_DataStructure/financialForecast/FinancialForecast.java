package financialForecast;

public class FinancialForecast {
	// Recursive method to calculate future value
    public double calculateFutureValue(double initialAmount, double growthRate, int years) {
        // Base case: if years is 0, return the initial amount
        if (years == 0) {
            return initialAmount;
        }
        // Recursive case: calculate future value for one less year
        return calculateFutureValue(initialAmount * (1 + growthRate), growthRate, years - 1);
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
