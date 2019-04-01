package expressivo;



public class Variable implements Expression {
	private final String id;
	
	//Abstraction function 
	// represents a variable as an expression
	
	
	/* Rep Invariant
	 * -id.length > 0
	 * - id must be a character
	 */
	
	/*Safety from exposure
	 * 
	 * id is private and final 
	 * id is immutable
	 * 
	 */
	private void checkRep() {
		assert id != null && id != "";
		assert id.length() > 0;
		assert id.matches("[a-zA-Z]+");
	}
	
	public Variable(String id) {
		this.id = id;
		checkRep();
	}
	
	
	public boolean equals(Object o) {
		if(o instanceof Variable) {
			return true;
		}
		
		if(!(o instanceof Variable)) {
			return false;
		}
		
		Variable v = (Variable)o;
		String id = v.toString();
	
	return this.id.equals(id);
}
	
	public int hashCode() {
		return this.id.hashCode();
	}
	
	public String toString() {
		return this.id;
	}
	
}

