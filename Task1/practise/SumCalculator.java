package practise;

public class SumCalculator {
	    double firstNumber;
	    double secondNumber;
	    
	    public double getFirstNumber(){
	       return this.firstNumber;
	    }
	    public double getSecondNumber(){
	       return this.secondNumber;
	    }
	    setFirstNumber(double firstNumber){
	       this.firstNumber=firstNumber;
	    }
	    getSecondNumber(){
	       this.secondNumber= secondNumber;
	    }
	    getAdditionResult(){
	       return firstNumber+ secondNumber;
	    }
	    getSubtractionResult(){
	       return secondNumber - firstNumber;
	    }
	    getMultiplicationResult(){
	       return firstNumber* secondNumber;
	    }
	    getDivisionResult(){
	        if (secondNumber=0){
	            return 0;
	        }
	        else{
	       return firstNumber / secondNumber;
	    }
	    }
}

