import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class BinaryTreeNode<String>
{
	String data;
	BinaryTreeNode<String> left;
	BinaryTreeNode<String> right;

/*	public void BinaryTreeNodeC ( String d, BinaryTreeNode<String> l, BinaryTreeNode<String> r)
	{
		data = d;
		left = l;
		right = r;
	}*/

	BinaryTreeNode<String> getLeft() { return left; }
	BinaryTreeNode<String> getRight() { return right; }
}

class BinaryTree extends BinaryTreeNode
{
	BinaryTreeNode<String> root = null;
//	BinaryTree treeObj = new BinaryTree();
	String[] tempString = new String[2976];
	int counter = 0;
	String temp[];

	public void BinaryTree()
	{
		root = null;
	}

	public void insert ( String d)
	{
		if (root == null)
		{
			left = null;
			right = null;
			data = d;
		}
		else
			insert(d, root);
	}

	public void insert ( String d, BinaryTreeNode<String> node)
	{
		if (d.compareTo(temp[1]) <= 0)
		{
			if (node.left == null)
			{
				left = null;
				right = null;
				data = d;
			}
			else
				insert(d, node.left);
		}
		else
		{
			if (node.right == null)
			{
				right = null;
				left = null;
				data = d;
			}
			else
				insert(d, node.right);
		}
	}

	String ExtractData()
	{
//		lsObj.BinaryTree();
//		String temp[];
		try {
			Scanner sc = new Scanner(new File("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"));
			while (sc.hasNext())
			{
//				sc.useDelimiter("[_\\D\\s]+");
				tempString[counter] = sc.nextLine();
				temp = tempString[counter].split("[_\\D\\s]+");

/*				if (counter ==0)
				{
					root = temp[0] + " " + temp[1] + " " + temp[2];
				}
				else*/
				insert(temp[0] + " " + temp[1] + " " + temp[2]);
//				printAllAreas();
//				System.out.println(tempString[counter]);
//				counter = counter + 1;
			} sc.close();
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		 	}
		return "";
	}

	public void preOrder(BinaryTreeNode<String> node)
	{
		if (node != null)
		{
			System.out.println(node.data);
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	String printAllAreas()
	{
		preOrder(root);
		return"";
	}
}

public class LSBSTApp extends BinaryTree
{

	public static void main (String [] args)
	{
		LSBSTApp lsObj = new LSBSTApp();
		lsObj.ExtractData();
		lsObj.printAllAreas();
	}
}



