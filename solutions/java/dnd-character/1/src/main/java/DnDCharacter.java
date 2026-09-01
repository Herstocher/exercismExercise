import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    List <Integer> dice = new ArrayList<>();
    Random random = new Random();
    int die;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    int hitpoints;

    int ability(List<Integer> scores) {
        int lowestNumber = 6;
        int sum = 0;

        for (int i = 0; i < 4; i++){
            sum += scores.get(i);
            if (lowestNumber > scores.get(i)){
                lowestNumber = scores.get(i);
            }
        }
        return sum - lowestNumber;
        
    }

    List<Integer> rollDice() {
        dice.clear();
        for (int i = 0; i < 4; i++){
            die = random.nextInt(6) + 1;
            dice.add(die);
        }
        return dice;
    }

    DnDCharacter(){
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
        hitpoints = modifier(constitution) + 10;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
