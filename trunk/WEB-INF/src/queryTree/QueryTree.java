package queryTree;

import java.util.ArrayList;
import java.util.List;

public class QueryTree {
	public class FormattedTreeNode{
		public String content;
		public int nodeID;
		public int parentNodeID;
		public int siteID;
		public FormattedTreeNode(){
			content = new String();
			nodeID = -1;
			parentNodeID = -1;
			siteID = -1;
		}
	}
	
	private TreeNode root = null;
	private List<FormattedTreeNode> nodeList = null;
	public static int nodeID = 0;
	public QueryTree(){
		nodeID = 0;
	}
	public TreeNode getRoot(){
		return root;
	}
	public void setRoot(TreeNode r){
		root = r;
	}
	public boolean isValidTree(){
		return !(root == null);
	}
	public void displayTree(){
		recDisplayTree(root,0,0);
	}
	private void recDisplayTree(TreeNode thisNode, int level, int childNumber){
		System.out.print("level="+level+" child="+childNumber+": ");
		thisNode.displayNode();
		int childNum = thisNode.getChildCount();
		for(int i=0; i<childNum; ++i){
			TreeNode nextNode = thisNode.getChildList().get(i);
			if(nextNode != null){
				recDisplayTree(nextNode,level+1,i);
			}
			else
				return;
		}
	}
	public void setNodeList(List<FormattedTreeNode> nodeList) {
		this.nodeList = nodeList;
	}
	public List<FormattedTreeNode> getNodeList() {
		return nodeList;
	}
	public void genTreeList(){
		if (root == null) return;
		nodeList = new ArrayList<FormattedTreeNode>();
		genTreeListByNode(root);
	}
	private void genTreeListByNode(TreeNode node){
		FormattedTreeNode n = new FormattedTreeNode();
		n.content = node.getContent();
		n.nodeID = node.getNodeID();
		n.parentNodeID = ((node.getParent() == null)?-1:node.getParent().getNodeID());
		n.siteID = node.getSiteID();
		nodeList.add(n);
		if (node.isLeaf())
			return;
		for(int i=0;i<node.getChildCount();++i){
			genTreeListByNode(node.getChild(i));
		}
	}
}
