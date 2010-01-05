package queryTree;

import java.util.ArrayList;

public class ProjectionNode extends TreeNode{
	private ArrayList<String> attributeList = new ArrayList<String>();
	private String tableName = null;
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
	
	public void addAttribute(String attr){
		attributeList.add(attr);
	}
	
	public int getAttributeNum(){
		return attributeList.size();
	}
	
	public ArrayList<String> getAttributeList(){
		return attributeList;
	}
	public void setTableName(String name){
		tableName = name;
	}
	public String getTableName(){
		return tableName;
	}

	@Override
	public String getNodeType() {
		// TODO Auto-generated method stub
		return "Projection";
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		String cnt = new String();
		cnt += "Projection: ";
		for(int i=0;i<attributeList.size();++i){
			cnt += tableName+"."+attributeList.get(i);
			if(i!= attributeList.size()-1)
				cnt+=", ";
		}
		return cnt;
	}

}
