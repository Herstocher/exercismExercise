class ReverseString {

    String reverse(String inputString) {
        int n = inputString.length();
        String reversed = "";
        for (int i = n - 1; i >= 0; i--){
            reversed += inputString.charAt(i);
        }
        return reversed;
    }
  
}
