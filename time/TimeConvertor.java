package time;
import java.util.*;
import java.text.DecimalFormat;
class TimeConvertor
{
	double hour,minute,second;
	Scanner sc=new Scanner(System.in);
	DecimalFormat f=new DecimalFormat("##.###");
	public void convertHourToMinute()
	{
		System.out.println("Enter the Hour");
		hour=sc.nextFloat();
		minute=hour*60;
		System.out.print("Minutes:"+f.format(minute));
	}
	public void convertMinuteToHour()
	{
		System.out.println("Enter the Minute");
		minute=sc.nextFloat();
		hour=minute/60;
		System.out.print("Hours:"+f.format(hour));
	}
	public void convertHourToSecond()
	{
		System.out.println("Enter the Hour");
		hour=sc.nextFloat();
		second=hour*3600;
		System.out.print("Second:"+f.format(second));
	}
	public void convertSecondToHour()
	{
		System.out.println("Enter the Second");
		second=sc.nextFloat();
		hour=second/3600;
		System.out.print("Hour:"+f.format(hour));
	}
}