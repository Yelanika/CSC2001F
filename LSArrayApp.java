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
	String[] lsData = new String[2];
//	int zone = -1;
	int[] stageArr = new int[2976];
	int[] dayArr = new int[2976];
	int[] timeArr = new int[2976];
	int[] zoneArr = new int[2976];
	String[] zones = {"0","0","0","0","0","0","0","0","0"};

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

/*		for (int i =0;i < 2976; i ++)
		{
			System.out.println(ls[i]);
//			return ls[i];
		}*/
		return "";
0	}

/*	String ExtractAndPrintZoneData()
	{

		try {
			Scanner sc2 = new Scanner(new File("Load_Shedding_All_Areas_Schedule_and_Map.clean.txt"));
			while (sc2.hasNext())
			{
				lsZone[counter2] = sc2.nextLine();
				counter2 = counter2 + 1;
			}
			sc2.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		int count = 0;

		while (count <= counter2)
		{
			System.out.println(lsZone[count]);
			count = count + 1;
		}
		return "";
	}*/

	String printAreas(int stage,int day, int startTime)
	{

//		String[] lsData = new String[2];
		for (int i=0; i <2976; i++)
		{
			int k = 0;
			lsData = ls[i].split("_");

			stageArr[i] = Integer.parseInt(lsData[0]);
			dayArr[i] = Integer.parseInt(lsData[1]);
//			int temp1 = Integer.parseInt(lsData[2]);

			zones = lsData[2].split("\\D");    //D-split at every non-digit
			timeArr[i] = Integer.parseInt(zones[0]);
			System.out.println(zones[0]);
//			zoneArr[i] = Integer.parseInt(zones[1]);
			System.out.println(zones[1]);

/*			//zones = {zones[0],zones[1],"0","0","0","0","0","0","0"};
			zones[2] = "0";
			zones[3] = "0";
			zones[4] = "0";
			zones[5] = "0";
			zones[6] = "0";
			zones[7] = "0";
			zones[8] = "0";*/

			if (k <=192)
			{
				for (int h=0; h <8;h++)
				{
					if (zones[h].equals("")   //checks if how many zones you have
					{
						zones[h]="0";   //equate no zone with 0
					}
				}
			}
			} else if (k <= 384)
//			{
//				int p=0;
//				zones = {zones[0],zones[1],zones[2],"0","0","0","0","0","0"}
//			}
			k = k+1;
//		 	for (int k =0; k<192; k++)
//			{
//				zone[2] = "0";
//			}
			System.out.println(zones[2]);

//			int tempcount = 2;

/*			while (tempcount < 8)
			{
				for (int k =0; k <192; k++)
				{
					zones = {zone[1],0,0,0,0,0,0,0}
				}
				tempcount = tempcount +1;
			}


			if (zones[2] != "")
			{
				zoneArr[i] = Integer.parseInt(zones[2]);
				System.out.println(zones[2]);
			}

			if (zones[3] != "")
			{
				zoneArr[i] = Integer.parseInt(zones[3]);
				System.out.println(zones[3]);
			}*/

			Search(stageArr[i],dayArr[i],timeArr[i]);
		}

		for (int k= 0; k < 192; k++)
		{

		}
		return "";
	}

	String Search(int stage, int day, int startTime)
	{
		String tempString = "";

		for (int j =0; j < 2976; j++)
		{
			if ((lsData[0] == String.valueOf(stage)) && (lsData[1] == String.valueOf(day)) && (lsData[2] == String.valueOf(startTime)))
			{
				tempString = "3456789012";
			}
		}
		System.out.println(tempString);
		return "";
	}
}

public class LSArrayApp extends LSBaseApp
{

//	String[] ls = new String[2976];

	public static void main(String[] args)
	{

		LSArrayApp lsObj = new LSArrayApp();
		lsObj.ExtractAndPrintData();

		int tempStage = Integer.parseInt(args[0]);
		System.out.println(tempStage);

		int tempDay = Integer.parseInt(args[1]);
		System.out.println(tempDay);

		int tempStartTime = Integer.parseInt(args[2]);
		System.out.println(tempStartTime);

		lsObj.printAreas(tempStage, tempDay, tempStartTime);

	}
}

