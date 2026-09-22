import currency.*;
import distance.*;
import time.*;
import java.util.Scanner;
public class Convertor
{
	public static void main(String[]args)
	{
		int code,currency_distance_code,time_code;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code 1:Currency\n2:Distance\n3Time");
		code=sc.nextInt();
		if(code==1)
		 {
			System.out.println("Enter the Currency code 1:Euro\n2:Dollar\3:Yen");
			currency_code=sc.nextInt();
			if(currency_code==1)
			 {
				convertInrToEuro();
				convertEUroToInr();
			 }
			 else if(currency_code==2)
			 {
				convertInrTODollar();
				convertDollarToInr();
			 }
			 else if(currency_code==3)
			 {
				convertInrToYen();
				convertYenToInr();
			 }
			else
			 {
				System.out.println("Invalid Code");
			 }
		 }
		 else if(code==2)
		 {
			System.out.println("Enter the Distance code 1:Meter\n2:Miles");
			distance_code=sc.nextInr();
			if(distance_code==2)
			{
				convertMeterToKm();
				convertKmToMeter();
			}
			else if(distance_code==2)
			{
				convertMilesToKm();
				convertKmToMiles();
			}
			else
			{
				System.out.print("Invaild Code");
			}
		 }
		 else if(code==3)
		 {
			System.out.println("Enter the Time code 1:Minutes\n2:Second");
			time_code=sc.nextInt();
			if(time_code==1)
			{
				convertHourToMinute();
				convertMinuteToHours();
			}
			else if(time_code==2)
			{
				convertHourToSecond();
				convertSecondsToHour();
			}
			else
			{
				System.out.println("Invalid Code");
			}
		 }
		 else
		 {
			system.out.println("Invail Code");
		 }
	}
}
		    
		 
			
		
			
		 
			 

			    
			 
		 
	





	

	

	 