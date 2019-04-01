package expressivo;

 public class Addition implements Expression {
	private Expression left;
	private Expression right;
	
	public Addition(Expression right,Expression left) {
		this.right=right;
		this.left=left;
		
	}
	
	 // Abstraction Function
    //   represents an addition expression made with two expressions when given as input
    //
    // Representation Invariant
    //   The left and right should be not null expressions
    //
    // Safety From Exposure
    //   - All fields are private and final
    //   - left and right are immutable
   
	public void checkRep() {
		assert right!=null;
		assert left!=null;
	}
	
	public boolean equals(Object thatObject) {
		if(thatObject==this)
			return true;
		if(!(thatObject instanceof Addition))
			return false;
		Addition thatAdd=  (Addition)thatObject;
		checkRep();
		return this.toString().equals(thatAdd.toString());
		
	}

	@Override
    public int hashCode() {
		int number=3;
		int number2=2;
		
		number2=number2*number+this.left.hashCode();
		number2=number2*number+this.right.hashCode();
		checkRep();
		return number2;
	}
	
	@Override
    public String toString() {
		checkRep();
		return this.left.toString()+" + "+this.right.toString();
	}
}