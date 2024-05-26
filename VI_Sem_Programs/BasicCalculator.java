import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        int result = 0;
        int sign = 1; 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            } else if (ch == '+') {
                result += sign * currentNumber;
                currentNumber = 0;
                sign = 1;
            } else if (ch == '-') {
                result += sign * currentNumber;
                currentNumber = 0;
                sign = -1;
            } else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (ch == ')') {
                result += sign * currentNumber;
                currentNumber = 0;
                result *= stack.pop();
                result += stack.pop(); 
            }
        }
        
        if (currentNumber != 0) {
            result += sign * currentNumber;
        }
        
        return result;
    }

    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        System.out.println(calculator.calculate("1 + 1")); 
        System.out.println(calculator.calculate(" 2-1 + 2 ")); 
        System.out.println(calculator.calculate("(1+(4+5+2)-3)+(6+8)")); 
    }
}
