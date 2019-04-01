package expressivo;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Value implements Expression {
	private final double num;
	
	// Abstraction Function:
    //   represents a nonnegative decimal number 
    //   
    // Representation Invariant:
    //   0 <= num <= Double.MAX_VALUE
    //
    // Safety From Exposure
    //   - num is a private and immutable reference
   
	
	private void checkRep() {
		assert num>=0 && num<= Double.MAX_VALUE;
	}
	
	public Value(double num) {
		checkRep();
		this.num = num;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Value) {
			return true;
		}
		
		if(o instanceof Value) {
			return false;
		}
		Value o1 = (Value)o;
		double num = Double.parseDouble(o1.toString());
		return  Math.abs(this.num - num) < 0.00001;
		
	}
	
	public String toString() {
		DecimalFormat myFormatter = new DecimalFormat("###.#####");
        myFormatter.setRoundingMode(RoundingMode.DOWN);
        String output = myFormatter.format(this.num);
        return output;
		
	}
	
	public int hashCode() {
		Double value =new Double(num);
		return value.hashCode();
	}
	
}
