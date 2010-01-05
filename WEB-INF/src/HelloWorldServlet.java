import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import communication.ClientBase;

import queryTree.*;
import queryTree.QueryTree.FormattedTreeNode;
import java.io.*;

public class HelloWorldServlet extends HttpServlet{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private QueryTree myTree;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String sql = request.getParameter("sql");
		 System.out.println(request.getHeader("Referer"));
		 if(request.getHeader("Referer").endsWith("querytreedisplay.jsp")){
			 queryTreeDisplay(request,response);
		 }
	 }
	private void queryTreeDisplay(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* int defaultPort = 8000;
		 String addr = "localhost";
		 ClientBase client = new ClientBase(addr, defaultPort);
		 Object obj = client.sendContext("executecmd", "select * from Publisher");
		 
		 System.out.println("tomcat:" + obj.toString());
		 */
		 PrintWriter writer = response.getWriter();
		 response.setContentType("text/xml;charset=UTF-8");
		 response.setHeader("Cache-Control", "no-cache");
		 genTree();
		 StringBuffer results = new StringBuffer("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		 results.append("<nodes>");
		 ArrayList<QueryTree.FormattedTreeNode> nodeList = (ArrayList<FormattedTreeNode>) myTree.getNodeList();
		 for(int i=0;i<nodeList.size();++i){
				QueryTree.FormattedTreeNode node = (QueryTree.FormattedTreeNode) nodeList.get(i);
				//results += node.content+node.nodeID+node.parentNodeID+node.siteID;
				results.append("<node>");
				results.append("<content>");
				results.append(node.content);
				results.append("</content>");
				results.append("<nodeid>");
				results.append(node.nodeID);
				results.append("</nodeid>");
				results.append("<parentnodeid>");
				results.append(node.parentNodeID);
				results.append("</parentnodeid>");
				results.append("<siteid>");
				results.append(node.siteID);
				results.append("</siteid>");
				results.append("</node>");
		 }
		 results.append("</nodes>");
		 //System.out.println(results);
		 
		 String tmp = new String();
		 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\treeInfo.xml")));
		 tmp = br.readLine();
		 System.out.println(tmp);
		 br.close();
		 writer.println(tmp);
		 writer.close();
	}
	private void genTree(){
		myTree = new QueryTree();
		ProjectionNode root = new ProjectionNode();
		root.setNodeName("Projection:Product.name");
		root.setRoot();
		root.setParent(null);	
		root.setNodeID(QueryTree.nodeID);
		root.setTableName("Product");
		root.addAttribute("name");
		QueryTree.nodeID++;
		myTree.setRoot(root);
		
		JoinNode node1 = new JoinNode();
		node1.setNodeName("JOIN:Product.id = Product.id");
		node1.setParent(root);
		node1.setNodeID(QueryTree.nodeID);
		node1.setLeftTableName("Product");
		node1.setRightTableName("Product");
		node1.addAttribute("id", "id");
		QueryTree.nodeID++;
		
		LeafNode node2 = new LeafNode();
		node2.setNodeName("Product.1");
		node2.setParent(node1);
		node2.setTableName("Prodcut.1");
		node2.setNodeID(QueryTree.nodeID);
		QueryTree.nodeID++;
		
		ProjectionNode node3 = new ProjectionNode();
		node3.setNodeName("Projection:Product.id");
		node3.setParent(node1);
		node3.setNodeID(QueryTree.nodeID);
		node3.setTableName("Product");
		node3.addAttribute("id");
		QueryTree.nodeID++;
		
		SelectionNode node4 = new SelectionNode();
		node4.setNodeName("Selection:Product.stocks<4000");
		node4.setParent(node3);
		node4.setNodeID(QueryTree.nodeID);
		QueryTree.nodeID++;
		
		LeafNode node5 = new LeafNode();
		node5.setNodeName("Product.2");
		node5.setParent(node4);
		node5.setTableName("Product.2");
		node5.setNodeID(QueryTree.nodeID);
		QueryTree.nodeID++;
		
		//myTree.displayTree();
		myTree.genTreeList();
	}
}
