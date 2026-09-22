package distance;
import java.util.*;
import java.text.DecimalFormat;
class DistanceConvertor
{
	Double meter,km,miles;
	Scnner sc=new Scanner(System.in);
	DecimalFormat f=new DecimalFormat("##.###");
	public void convertMeterToKm()
	{
		System.out.println("Enter the meter");
		meter=sc.nextFloat();
		km=meter*0.001;
		Sytem.out.println("Kilometer:"+f.format(km));
	}
	public void convertKmToMeter()
	{
		System.out.println("Enter the Kilometer");
		km=sc.nextFloat();
		meter=km/0.001;
		Sytem.out.println("Meter:"+f.format(meter));
	}
	public void convertMilesToKm()
	{
		System.out.println("Enter the miles");
	    miles=sc.nextFloat();
		km=miles*1.6093;
		Sytem.out.println("kilometer:"+f.format(km));
	}
	public void convertKmToMiles()
	{
		System.out.println("Enter the kilometer");
	    km=sc.nextFloat();
		miles=km/1.6093;
		Sytem.out.println("Miles:"+f.format(miles));
	}
}