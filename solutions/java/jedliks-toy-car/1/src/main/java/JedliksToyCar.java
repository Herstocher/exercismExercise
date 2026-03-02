public class JedliksToyCar {
    private int battery = 100;
    private int distance = 0;
    
    public static JedliksToyCar buy() {
        JedliksToyCar myCar = new JedliksToyCar();
        return myCar;
    }

    public String distanceDisplay() {
        String displayText = "Driven " + distance + " meters";
        return displayText;
    }
    
    public String batteryDisplay() {
        if (battery > 0){
            return "Battery at " + battery +"%";    
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
        if (battery > 0) {
        battery = battery - 1;
        distance = distance + 20;    
        } 
    }
}
