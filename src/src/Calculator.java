package src;

public class Calculator {

	public int solve(String expression) {
		expression = expression.replaceAll(" ", "");
		
		String operands[] = expression.split("\\+");
		int result = 0;
		for(String operand:operands){
			result = result + Integer.parseInt(operand);
		}
		return result;
	}

}
