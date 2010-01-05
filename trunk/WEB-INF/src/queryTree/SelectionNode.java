package queryTree;

public class SelectionNode extends TreeNode{
	private String condition = null;
	@Override
	public void accept(TreeNodeVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}
	public void setCondition(String con){
		condition = con;
	}
	public String getCondition(){
		return condition;
	}

	@Override
	public String getNodeType() {
		// TODO Auto-generated method stub
		return "Selection";
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		String cnt = new String();
		cnt += "Selection: ";
		
		return cnt;
	}

}
