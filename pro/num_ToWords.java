//program to convert a number to sentence
import java.util.*;
class numberToSentence
{
	private static String units[][]={{"one","two","three","four","five","six","seven","eight","nine"},{"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"},{"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"},{"hundred","thousand","lakh","crore","arab"}};
	private static String outputString="";
	public static void twoDigits(int number) 
	{  //to convert two digits of the number to sentence
		if(number==0);
		else if(number<10)
			outputString+=units[0][number-1]+" ";
		else if(number>10 && number<20)
			outputString+=units[2][number-11]+" ";
		else
		{
			outputString+=units[1][number/10-1]+" ";
			twoDigits(number%10);
		}
	}
	public static void main(String h[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to converted to sentence- \n");
		int inputNumber=s.nextInt();
		String number=String.valueOf(inputNumber);
		if(inputNumber==0)
			outputString="Zero";
		else
		{
			int i,j=0,partsLength;
			partsLength=(number.length()-3)/2+1;
			if(number.length()%2==0)
				partsLength++;
			int parts[]=new int[partsLength];
			parts[j++]=inputNumber%1000;
			inputNumber/=1000;
			while(inputNumber!=0)
			{
				parts[j++]=inputNumber%100;
				inputNumber/=100;
			}
			for(i=parts.length-1;i>=0;i--) //send two digits at a time to above function
				if(i==0)
				{
					twoDigits(parts[i]/100);
					outputString+=units[3][i]+" ";
					twoDigits(parts[i]%100);
				}
				else if(parts[i]!=0)
				{
					twoDigits(parts[i]);
					outputString+=units[3][i]+" ";
				}
		}
		System.out.println(outputString);
	}//end of main
}//end of class