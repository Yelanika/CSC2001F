import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class LSBaseApp
{
	int counter = 0;
	String[] ls = new String[2976];
	int stage = -1;
	int day = -1;
	int startTime = -1;
	String[] lsData = new String[2];

	String ExtractAndPrintData()
	{
		try {
			Scanner sc = new Scanner(new File("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"));
			while (sc.hasNext())
			{
				ls[counter] = sc.nextLine();
			//	System.out.println(sc.nextLine());
				counter = counter +1;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int i =0;i < 2976; i ++)
		{
			System.out.println(ls[i]);
//			return ls[i];
		}
		return "";
	}

	String printAreas(int stage,int day, int startTime)
	{

//		String[] lsData = new String[2];
		lsData = ls[1].split("_");

		stage = lsData[0];
		day = lsData[1];
		startTime = lsData[2];
		return printAreas(stage,day,startTime);
	}

	int Search()
	{

		String tempString = "";
/*		int last = 2976;
		int first = 0;*/

		for (int i = 0; i < 2977; i++)
		{
			if ((lsData[0] == stage) && (lsData[1] == day) && (lsData[2] == startTime))
			{
				tempString = ls[i];
			}
		}

/*		int mid = (first+last)/2;
		while (first <= last)
		{
			if (ls[mid] < key)
			{
				first = mid +1;
			}
			else if (ls[mid] ==key)
			{
			 	System.out.println("Element is found at index:" + mid);
				break;
			}
			else
			{
				last = mid -1;
			}
			mid = (first + last) /2;
		}
		if (first > last)
		{
			System.out.println("Element not found");
		}
		return -1;
		if (r >= l)
		{
			int mid = (/2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarysearch(arr,l,mid-1,x);
			return binarySearch(arr,mid+1,r,x);
		}
		return -1*/
	}
}

public class LSArrayApp extends LSBaseApp
{

//	String[] ls = new String[2976];

	public static void main(String[] args)
	{

		LSArrayApp lsObj = new LSArrayApp();
		lsObj.ExtractAndPrintData();

		int tempStage = Integer.parseint(args[0]);
		String tempDay = args[1];
		String tempStartTime = args[2];

//		lsObj.

	}

/*	public void printAreas(int stage, int day, int startTime)
	{
		String[] lsData = ls.split("_");

		stage = lsData[0];
		day = lsData[1];
		startTime = lsData[2];
	}*/
}

