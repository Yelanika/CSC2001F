import java.io.FileNotFoundException;
// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTree
{
	BinaryTreeNode<String> root;
	String[] ls = new String[10];

	public void BinaryTree ()
	{
		root = null;
	}

	public void insert(String d)
   	{

		if (root == null)
		{
			root = new BinaryTreeNode<String> (d, null, null);
		}
		else
		{
			insert(d, root);
		}
   	}

	public void insert (String d, BinaryTreeNode<String> node)
	{
		if (d.compareTo(node.data) <= 0)
		{
			if (node.left == null)
			{
				node.left = new BinaryTreeNode<String> (d, null, null);
			}
			else
			{
				insert(d, node.left);
			}
		}
		else
		{
			if (node.right == null)
			{
				node.right = new BinaryTreeNode<String> (d, null, null);
			}
			else
			{
				insert(d, node.right);
			}
		}
	}

	/*public void printLine(BinaryTreeNode<String> node)
	{
		ls = node.data.split("[_\\D\\s]+");
		
		String temp = "";
		
		for (int i = 0; i < 10; i++)
		{
			if (ls[i] != null)
			{
				temp = temp + ls[i] + " ";
			}
		}

		System.out.println(temp);

	}*/
	public void printAllAreas()
	{
		preOrder(root);
	}

	public String printAreas( String d)
	{
		if (root == null )
		{
			return null;
		}
		else
		{
			find(d,root);
			return "";
		}
	}

	public String find (String d, BinaryTreeNode<String> node)
	{	
	//	String[] test = new String[11];
	//	test = node.data.split("[_\\D\\s]+");
		System.out.println(node);
		ls = node.data.split("\\D");
		
		String s = ls[0];
		String dx = ls[1];
		String t = ls[2];

		String hold = s + " " + dx + " " + t;

		System.out.println(hold + " " + ls[3]);// + " " + ls[4]);
		String temp = "Areas: ";
	
		int cmp = d.compareTo(hold);
		//int cmp2 = day.compareTo(dx);
		//int cmp3 = startTime.compareTo(t);

		if (cmp == 0)
		{	

			if (ls[0] == "1")
				temp = temp + ls[3];
			else if (ls[0] == "2")
				temp = temp + ls[3] + " " + ls[4];
			else if (ls[0] == "3")
				temp = temp + ls[3] + " " + ls[4] + " " + ls[5];
			else if (ls[0]== "4")
				temp = temp + ls[3] + " " + ls[4] + " " + ls[5] + " " + ls[6];
			else if (ls[0]== "5")
				temp = temp + ls[3] + " " + ls[4] + " " + ls[5] + " " + ls[6] + " " + ls[7]; 
			else if (ls[0] == "6")
				temp = temp + ls[3] + " " + ls[4] + " " + ls[5] + " " + ls[6] + " " + ls[7] + " " + ls[8]; 
			else if (ls[0] == "7")
				temp = temp + ls[3] + " " + ls[4] + " " + ls[5] + " " + ls[6] + " " + ls[7] + " " + ls[8] + " " + ls[9]; 
			else if (ls[0] == "8")
				temp = temp + ls[3] + " " + ls[4] + " " + ls[5] + " " + ls[6] + " " + ls[7] + " " + ls[8] + " " + ls[9] + " " + ls[10];

			System.out.println(temp);
			return "";
		}
		else if ((cmp < 0))
		{
			if (node.left == null) 
				return null;
			else
			{
		 		find (d,node.left);
				return "";
			}
		}
		else
		{
			if (node.right == null) 
				return null; 
			else
			{
				find (d,node.right);
				return "";
			}
		}
	}
  	

	


	public void visit (BinaryTreeNode<String> node)
	{
		System.out.println(node.data);
	}

   	public void preOrder ()
   	{
      		preOrder (root);
   	}

   	public void preOrder ( BinaryTreeNode<String> node )
   	{
	      	if (node != null)
	      	{
	        	 visit (node);
	        	 preOrder (node.getLeft ());
	       		 preOrder (node.getRight ());
	     	 }   
	}
}
