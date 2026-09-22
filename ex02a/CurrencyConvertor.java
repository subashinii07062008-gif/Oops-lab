package currency; 
import java.util.*;
import java.text.DecimalFormat; 
public class CurrencyConvertor
{
double rupee,dollar,euro,yen;
Scanner sc = new Scanner(System.in); 
DecimalFormat f = new DecimalFormat("##.###"); 
public void convertInrToEuro()
{
System.out.println("Enter amount in rupees"); 
rupee = sc.nextFloat();
euro = rupee / 80;
System.out.println("Euro : "+f.format(euro));
}
public void convertEuroToInr()
{
System.out.println("Enter amount in Euro"); 
euro = sc.nextFloat();
rupee = euro * 80;
System.out.println("Rupees : "+f.format(rupee));
}
public void convertInrToDollar()
{
System.out.println("Enter amount in rupees"); 
rupee = sc.nextFloat();
dollar = rupee / 66;
System.out.println("Dollar : "+f.format(dollar));
}
public void convertDollarToInr()
{
System.out.println("Enter amount in Dollar"); 
dollar = sc.nextFloat();
rupee = dollar * 66;
System.out.println("Rupees : "+f.format(rupee));
}
public void convertInrToYen()
{
System.out.println("Enter amount in rupees"); 
rupee = sc.nextFloat();
yen = rupee / 0.61; 
System.out.println("Yen : "+f.format(yen));
}
public void convertYenToInr()
{
System.out.println("Enter amount in Yen"); 
euro = sc.nextFloat();
rupee = yen * 0.61;
System.out.println("Rupees : "+f.format(rupee));
}
}