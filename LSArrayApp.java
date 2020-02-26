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
	String[] zones = new String[8];

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
	}

	String printAllAreas()
	{

//		String[] lsData = new String[2];
		for (int i=0; i <2976; i++)
		{
			int k = 0;
			String t ="";
			lsData = ls[i].split("_");

			stageArr[i] = Integer.parseInt(lsData[0]);
			dayArr[i] = Integer.parseInt(lsData[1]);
//			int temp1 = Integer.parseInt(lsData[2]);

			zones = lsData[2].split("[\\D\\s]+");    //D-split at every non-digit
			timeArr[i] = Integer.parseInt(zones[0]);

			t = "stage: "  +  stageArr[i] + "	day: "	+ dayArr[i] +  "	time: " + zones[0] + "h00"; 
			t = t + "	areas: " + zones[1];

			if (stageArr[i] == 2) {
				t= t + "  " + zones[2];
			}
			if (stageArr[i] == 3) {
				t= t+  "  " + zones[2] + "  " + zones[3];
			}
//			if (stageArr[i] == 4) {
//				t=t +  "  " + zones[2] + "  " + zones[3] + "  " + zones[4];
//			}
			if (stageArr[i] == 5) {
				t=t +  "  " + zones[2] + "  " + zones[3] + "  " + zones[4] + "  " + zones[5];
			}
			if (stageArr[i] == 6) {
				t=t +  "  " + zones[2] + "  " + zones[3] + "  " + zones[4] + "  " + zones[5] + "  " + zones[6];
			}
			if (stageArr[i] == 7) {
				t=t +  "  " + zones[2] + "  " + zones[3] + "  " + zones[4] + "  " + zones[5] + "  " + zones[6] + "  " + zones[7];
			}
			if (stageArr[i] == 8) {
				t=t +  " " + zones[2] + "  " + zones[3] + "  " + zones[4] + "  " + zones[5] + "  " + zones[6] + "  " + zones[7] + "  " + zones[8];
			}
			System.out.println(t);


//			Search(stageArr[i],dayArr[i],timeArr[i]);
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

		lsObj.printAllAreas();

	}
}

