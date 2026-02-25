public class Lasagna {
    public static int expectedMinutesInOven(){
        return 40;
    }
    public static int remainingMinutesInOven(int minutes){
        int timer = expectedMinutesInOven() - minutes;
        return timer;
    }
    public static int preparationTimeInMinutes(int layers){
        int prepTime = layers * 2;
        return prepTime;
    }
    public static int totalTimeInMinutes(int layers, int timer){
        int count = preparationTimeInMinutes(layers) + timer;
        return count;
    }
}
