class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder builder = new StringBuilder();
        char[] asArray = identifier.toCharArray();
        boolean makeUpper = false;


        for (int i = 0; i < asArray.length; i++){
            if (asArray[i] == '-'){
                makeUpper = true;
            } else if (Character.isWhitespace(asArray[i])){
                builder.append('_');
            } else if (Character.isLetter(asArray[i])){
                if (makeUpper){
                    builder.append(Character.toUpperCase(asArray[i]));
                    makeUpper = false;
                } else {
                    builder.append(asArray[i]);
                }
            } else if (asArray[i] == '4'){
                builder.append('a');
            } else if (asArray[i] == '3'){
                builder.append('e');
            } else if (asArray[i] == '0'){
                builder.append('o');
            } else if (asArray[i] == '1'){
                builder.append('l');
            } else if (asArray[i] == '7'){
                builder.append('t');
            }
        }
        return builder.toString();
    }
}
