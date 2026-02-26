class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation.equals("")){
            throw new IllegalArgumentException("Operation cannot be empty");
        } else if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")){
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        
        switch (operation){
        case "+":
            return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
        case "-":
            return operand1 + " - " + operand2 + " = " + (operand1 - operand2);
        case "*":
            return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
        case "/":
            try {
                return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
            } catch (ArithmeticException e){
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
            
        default:
            throw new IllegalArgumentException("Unknown operation: " + operation);
        }
        
        
    }
}
