public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int minutes){
        int timer = expectedMinutesInOven() - minutes;
        return timer;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers){
        int prepTime = layers * 2;
        return prepTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layers, int timer){
        int count = preparationTimeInMinutes(layers) + timer;
        return count;
    }
}
