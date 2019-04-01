package expressivo;

public class Multiplication implements Expression {
	private final Expression left;
    private final Expression right;
    
    // Abstraction Function
    //   Represents a tree for multiplication
    //
    // Representation Invariant
    //   The left and the right node contain a non empty expression. 
    //
    // Safety From Exposure
    // 	   We have kept the left and the right expresssion private and final. 
    //     The feilds are immutable. 
    //     other implementations use this code but cannot modify it. 
    
    private void checkRep() {
        assert right != null;
        assert left != null;
    }
    
    public Multiplication( Expression left, Expression right) {
        this.right = right;
        this.left = left;
        checkRep();
    }
    
    @Override public String toString() {
        checkRep();
        return this.left.toString() + " * " + this.right.toString();
    }  
    
    @Override public boolean equals(Object x) {
    	checkRep();
        return this.toString().equals(x.toString());
    }
    
    @Override public int hashCode() {
    	checkRep();
        return this.toString().hashCode();
    }
}
