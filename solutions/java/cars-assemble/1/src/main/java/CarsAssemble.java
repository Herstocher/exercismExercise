public class CarsAssemble {

    private int oneHourProductionRate = 221;
    
    
    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4){
            return speed * oneHourProductionRate;
        } else if (speed > 4 && speed < 9){
            return speed * oneHourProductionRate * 0.9;
        } else if (speed == 9){
            return speed * oneHourProductionRate * 0.8;
        } else {
            return speed * oneHourProductionRate * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
