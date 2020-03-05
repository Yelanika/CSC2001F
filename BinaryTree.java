import java.io.FileNotFoundException;
// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTree
{
	BinaryTreeNode<String> root = null;
	String[] ls = new String[11];
	//int[] tempStringd = new int[2];
	//int[] tempStringNode = new int[2];
   
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
			//	System.out.println("insert left works     d: " + d + " node.data:  " + node.data );				
				node.left = new BinaryTreeNode<String> (d, null, null);
				
			}
			else
			{
			//	System.out.println("insert left works 2     d: " + d + " node.data:  " + node.data );
				insert(d, node.left);
				
			}
		}
		else
		{
			if (node.right == null)
			{
				node.right = new BinaryTreeNode<String> (d, null, null);
			//	System.out.println("insert works right    d: " + d + " node.data:  " + node.data );
			}
			else
			{
				insert(d, node.right);
			//	System.out.println("insert works right 2    d: " + d + " node.data:  " + node.data );
			}
		}
	}

	public void printLine(BinaryTreeNode<String> node)
	{
		ls = node.data.split("[_\\D\\s");
		
		//String[] Areas = new String[null,null,null,null,null,null,null,null,null]
		String temp = "";
		//Areas = ls.split("//D");
		for (int i = 0; i < 11; i++)
		{
			if (ls[i] != null)
			{
				temp = temp + ls[i] + " ";
			}
		}

		System.out.println(temp);
		return "";

//		ls = node.data.split("//D");

/*		for (int j = 0; j < 11; j++)
		{
			
		}
		System.out.println("Stage: " + ls[0] + "Day: " + ls[1] + ls[2] + ls[3] + ls[4] + ls[5] + ls[6] + ls [7] + ls[8] + ls[9] + ls[10] + ls[11]);*/
	}
	public void printAllAreas()
	{
		preOrder(root);
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


}import java.io.FileNotFoundException;
// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTree
{
	BinaryTreeNode<String> root = null;
	[] String ls = new String[11];
	//int[] tempStringd = new int[2];
	//int[] tempStringNode = new int[2];
   
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
			//	System.out.println("insert left works     d: " + d + " node.data:  " + node.data );				
				node.left = new BinaryTreeNode<String> (d, null, null);
				
			}
			else
			{
			//	System.out.println("insert left works 2     d: " + d + " node.data:  " + node.data );
				insert(d, node.left);
				
			}
		}
		else
		{
			if (node.right == null)
			{
				node.right = new BinaryTreeNode<String> (d, null, null);
			//	System.out.println("insert works right    d: " + d + " node.data:  " + node.data );
			}
			else
			{
				insert(d, node.right);
			//	System.out.println("insert works right 2    d: " + d + " node.data:  " + node.data );
			}
		}
	}

	public void printLine(BinaryTreeNode<String> node)
	{
		ls = node.data.split("[_\\D\\s");
		
		//String[] Areas = new String[null,null,null,null,null,null,null,null,null]
		String temp = "";
		//Areas = ls.split("//D");
		for (int i = 0; i < 11; i++)
		{
			if (ls[i] != null)
			{
				temp = temp + ls[i] + " ";
			}
		}

		System.out.println(temp);
		return "";

//		ls = node.data.split("//D");

/*		for (int j = 0; j < 11; j++)
		{
			
		}
		System.out.println("Stage: " + ls[0] + "Day: " + ls[1] + ls[2] + ls[3] + ls[4] + ls[5] + ls[6] + ls [7] + ls[8] + ls[9] + ls[10] + ls[11]);*/
	}
	public void printAllAreas()
	{
		preOrder(root);
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
