class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int batteryCharge = 100;
    private int distance;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (batteryCharge < batteryDrain){
            return true;
        } else return false;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (batteryCharge >= batteryDrain){
            distance += speed;
            batteryCharge -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);
        return nitro;
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
       while (true){
           car.drive();
           if (car.distanceDriven() >= distance){
               return true;
           } else if (car.batteryDrained()){
               return false;
           } 
       }
    }
}
