import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class LSArrayApp
{
	public static void main(String[] args)
	{
		String[] ls = new String[500];
		int counter = 0;

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

		int count2 = 0;
		while (count2 <= counter)
		{
			System.out.println(ls[count2]);
			count2 = count2 + 1;
		}
	}
}
