public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = daysSkipped >= 5 ? 0.85 : 1.00;
        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        int bonus = productsSold >= 20 ? 13 : 10;
        return bonus;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000.00;
        double afterSalaryMultiplier = salaryMultiplier(daysSkipped) * baseSalary;
        double finalSalary = afterSalaryMultiplier + bonusForProductsSold(productsSold);
        return finalSalary > 2000.00 ? 2000.00 : finalSalary;
    } 
}
