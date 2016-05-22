package decisiontree;

public class Leaf extends Node {

	
    public Leaf()
            {
                
	}

	
    @Override
	public void setAttribute(Attribute bestAttribute) {
		assert (bestAttribute == null);
	}

	
	public void addBranch(int value, Node leaf) {
	}
}