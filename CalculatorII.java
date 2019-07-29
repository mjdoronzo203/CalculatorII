import java.util.ArrayList;

public class CalculatorII {
	ArrayList<Double> operands = new ArrayList<Double>();
	ArrayList<String> operators = new ArrayList<String>();
	private double result;
	
	
	public void performOperation(double num){
		operands.add(num);
	}
	
	public void performOperation(String operator) {
		operators.add(operator);
		if(operator == "=") {
			result = setResult();
		}
	}
	
	private double setResult() {
		double operandOne;
		double operandTwo;
		String operation;
		int counter = 0;
		for(int i=0; i<operators.size(); i++) {
			if(operators.get(i) == "+") {
				counter++;
			}
			if(operators.get(i) == "-") {
				counter++;
			}
			if(operators.get(i) == "*") {
				operation = "*";
				operandOne = operands.get();
			}
			if(operators.get(i) == "/") {
				operation = "/";
			}
		}
	}
	
	public double getResults() {
		return result;
	}
	
}
