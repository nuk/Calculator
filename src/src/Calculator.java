package src;

public class Calculator {

	public int solve(String expression) {
		expression = expression.replaceAll(" ", "");
		
		int result = 0;
		if(expression.contains("+")){
			String operands[] = expression.split("\\+");
			for(String operand:operands){
				result = result + Integer.parseInt(operand);
			}
		}
		
		if(expression.contains("-")){
			String subOperands[] = expression.split("\\-");
			result += Integer.parseInt(subOperands[0]);
			for(int opIndex = 1; opIndex < subOperands.length; opIndex++ ){
				result -= Integer.parseInt(subOperands[opIndex]);
			}
		}
		
		return result;
	}

}
