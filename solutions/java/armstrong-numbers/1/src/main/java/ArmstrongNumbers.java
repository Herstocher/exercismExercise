class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String digits = String.valueOf(numberToCheck);
        int amountOfDigits = String.valueOf(numberToCheck).length();
        int afterArmstrong = 0;
        char temp;
        for (int i = 0; i < amountOfDigits; i++){
            temp = digits.charAt(i);
            afterArmstrong += Math.pow(Character.getNumericValue(temp), amountOfDigits);
        }
        if (numberToCheck == afterArmstrong){
            return true;
        } else return false;
    }
}
