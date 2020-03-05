import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class LSDataApp
{
	int stage_b = -1;
	int day_b = -1;
	int startTime_b = -1;
	int lsZones_b = -1;

	int getStage()
	{
		return stage_b;
	}

	int getDay()
	{
		return day_b;
	}

	int getStartTime()
	{
		return startTime_b;

	}

	int getLSZones()
	{
		return lsZones_b;
	}
}

class LSBaseApp extends LSDataApp
{
	int counter = 0;
	int counter2 = 0;
	String[] ls = new String[2976];
//	String[] lsZone = new String[2976];
/*	int stage = -1;
	int day = -1;
	int startTime = -1;*/
	String[] lsData = new String[10];
//	int zone = -1;
	int[] stageArr = new int[2976];
	int[] dayArr = new int[2976];
	int[] timeArr = new int[2976];
//	int[] zoneArr = new int[2976];
//	String[] zones = new String[8];

	String ExtractData()
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

/*		for (int i =0;i < 2976; i ++)
		{
			System.out.println(ls[i]);
//			return ls[i];
		}*/
		return "";
	}


	String printAllAreas()
	{

//		String[] lsData = new String[2];
		for (int i=0; i <2976; i++)
		{
			String t ="";

			lsData = ls[i].split("[_\\D\\s]+");    //D-split at every non-digit

			stageArr[i] = Integer.parseInt(lsData[0]);		//lsData[0]
			dayArr[i] = Integer.parseInt(lsData[1]);		//lsData[1]
			timeArr[i] = Integer.parseInt(lsData[2]);		//lsData[2]

			t = "stage: "  +  stageArr[i] + "	day: "	+ dayArr[i] +  "	time: " + lsData[2] + "h00"; 
			t = t + "	areas: " + lsData[3];

			if (stageArr[i] == 2) {
				t= t + "  " + lsData[4];
			}
			if (stageArr[i] == 3) {
				t= t+  "  " + lsData[4] + "  " + lsData[5];
			}
//			if (stageArr[i] == 4) {
//				t=t +  "  " + zones[4 + "  " + zones[5] + "  " + zones[4];
//			}
			if (stageArr[i] == 5) {
				t=t +  "  " + lsData[4] + "  " + lsData[5] + "  " + lsData[6] + "  " + lsData[7];
			}
			if (stageArr[i] == 6) {
				t=t +  "  " + lsData[4] + "  " + lsData[5] + "  " + lsData[6] + "  " + lsData[7] + "  " + lsData[8];
			}
			if (stageArr[i] == 7) {
				t=t +  "  " + lsData[4] + "  " + lsData[5] + "  " + lsData[6] + "  " + lsData[7] + "  " + lsData[8] + "  " + lsData[9];
			}
			if (stageArr[i] == 8) {
				t=t +  "  " + lsData[4] + "  " + lsData[5] + "  " + lsData[6] + "  " + lsData[7] + "  " + lsData[8] + "  " + lsData[9] + "  " + lsData[10];
			}
			System.out.println(t);


//			Search(stageArr[i],dayArr[i],timeArr[i]);
		}
		return "";
	}

	String printAreas(int stage, int day, int startTime)
	{
		String tempString = "";
		int add = 0;

		for (int j =0; j < 2976; j++)
		{
			lsData = ls[j].split("[_\\D\\s]+");

			if ((stage == Integer.parseInt(lsData[0])) && (day == Integer.parseInt(lsData[1])) && (startTime == Integer.parseInt(lsData[2])))
			{
				if (stage == 1)
				{
					tempString = lsData[3];
				}
				else if (stage == 2)
				{
					tempString = lsData[3] + "  &  " + lsData[4];
				}
				else if (stage == 3)
				{
					tempString = lsData[3] + "  &  " + lsData[4] + "  &  " + lsData[5];
				}
				else if (stage == 4)
				{
					tempString = lsData[3] + "  &  " + lsData[4] + "  &  " + lsData[5] + "  &  " + lsData[6];
				}
				else if (stage == 5)
				{
					tempString = lsData[3] + "  &  " + lsData[4] + "  &  " + lsData[5] + "  &  " + lsData[6] + "  &  " + lsData[7];
				}
				else if (stage == 6)
				{
					tempString = lsData[3] + "  &  " + lsData[4] + "  &  " + lsData[5] + "  &  " + lsData[6] + "  &  " + lsData[7] + "  &  " + lsData[8];
				}
				else if (stage == 7)
				{
					tempString = lsData[3] + "  &  " + lsData[4] + "  &  " + lsData[5] + "  &  " + lsData[6] + "  &  " + lsData[7] + "  &  " + lsData[8] + "  &  " + lsData[9];
				}
				else if (stage == 8)
				{
					tempString = lsData[3] + "  &  " + lsData[4] + "  &  " + lsData[5] + "  &  " + lsData[6] + "  &  " + lsData[7] + "  &  " + lsData[8] + "  &  " + lsData[9] + "  &  " + lsData[10];
				}add = add + 1;
			}/*else
			{
				tempString = tempString + " none found";
			}*/
		}
		if (add==0)
		{
			tempString = "none found";
		}

		System.out.println("Areas: " + tempString);
//		return tempString;
		return "";
	}
}

public class LSArrayApp extends LSBaseApp
{

//	String[] ls = new String[2976];

	public static void main(String[] args)
	{

		LSArrayApp lsObj = new LSArrayApp();
		lsObj.ExtractData();

		int tempStage = Integer.parseInt(args[0]);
//		System.out.println(tempStage);

		int tempDay = Integer.parseInt(args[1]);
//		System.out.println(tempDay);

		int tempStartTime = Integer.parseInt(args[2]);
//		System.out.println(tempStartTime);

//		lsObj.printAllAreas();
		lsObj.printAreas(tempStage,tempDay,tempStartTime);

	}
}

