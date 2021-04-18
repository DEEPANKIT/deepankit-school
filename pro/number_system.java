import java.util.*;
class number_system 
{    
    public static void main(String nh[])
    {
        int ch2=0,ch1=0;
        int i=0;
        String input_number="",output_number="",nitm="",input_number2="";
        Scanner s=new Scanner(System.in);
        do
        {
            System.out.println("Enter task to be performed\n1:Conversion,\n2:Addition,\n3:Multiplication,\n4:Subtraction,\n5:Exit");
            ch1=s.nextInt();
            switch(ch1)
            {
                case 1:
                    do
                    {
                        System.out.println("Enter conversion type:\n1:Decimal to binary,\n2:Decimal to octal,\n3:Decimal to hexadecimal,\n4:Binary to decimal,\n5:Hexadecimal to decimal,\n6:Octal to decimal,\n7:Octal to hexadecimal,\n8:Hexadecimal to octal,\n9:Return to previous menu.");
                        ch2=s.nextInt();
                        switch(ch2)
                        {
                            case 1:
                                input_number=input(s);
								System.out.println(input_number+" = "+decimal_to(input_number,2));
								break;
							case 2:
								input_number=input(s);
								System.out.println(input_number+" = "+decimal_to(input_number,8));
								break;                        
							case 3:
								input_number=input(s);
								System.out.println(input_number+" = "+decimal_to(input_number,16));
								break;
							case 4:
								input_number=input(s);
								System.out.println(input_number+" = "+to_decimal(input_number,2));
								break;
							case 5:
								input_number=input(s);
								System.out.println(input_number+" = "+to_decimal(input_number,16));
								break;
							case 6:
								input_number=input(s);
								System.out.println(input_number+" = "+to_decimal(input_number,8));
								break;
							case 7:
								input_number=input(s);
								System.out.println(input_number+" = "+oct_hex_to_hex_oct(input_number,3));
								break;                 
							case 8:
								input_number=input(s);
								System.out.println(input_number+" = "+Integer.valueOf(oct_hex_to_hex_oct(input_number,4)));
						}     //Integer.value of is done to remove any preceding zeroes                                   
					}
					while(ch2!=9);
					break;
                case 2:
                    do
                    {
						System.out.println("Enter addition type:\n1:Binary addition,\n2:Octal addition,\n3:Hexadecimal addition,\n4:Return to previous menu.");
						ch2=s.nextInt();
						switch(ch2)
						{
							case 1:
								input_number=input(s);
								input_number2=input(s);
								System.out.println(input_number+" + "+input_number2+" = "+addition(input_number,input_number2,2));
								break;
							case 2:
								input_number=input(s);
								input_number2=input(s);
								System.out.println(input_number+" + "+input_number2+" = "+addition(input_number,input_number2,8));
								break;
							case 3:
								input_number=input(s);
								input_number2=input(s);
								System.out.println(input_number+" + "+input_number2+" = "+addition(input_number,input_number2,16));
						}
                    }
					while(ch2!=4);
					break;
                case 3:
                    do
                    {
                        System.out.println("Enter multiplication type:\n1:Binary multiplication,\n2:Octal multiplication,\n3:Hexadecimal multiplication,\n4:Return to previous menu.");
                        ch2=s.nextInt();
                        switch(ch2)
                        {
                            case 1:
                                input_number=input(s);
                                input_number2=input(s);
                                System.out.println(input_number+" * "+input_number2+" = "+multiplication(input_number,input_number2,2));
                                break;
                            case 2:
                                input_number=input(s);
                                input_number2=input(s);
                                System.out.println(input_number+" * "+input_number2+" = "+multiplication(input_number,input_number2,8));
                                break;
                            case 3:
                                input_number=input(s);
                                input_number2=input(s);
                                System.out.println(input_number+" * "+input_number2+" = "+multiplication(input_number,input_number2,16));
                                break;
                        }
                    }
                    while(ch2!=4);
					break;
			    case 4:
				    do
					{
						System.out.println("Enter subtraction type:\n1:Binary subtraction,\n2:Octal subtraction,\n3:Hexadecimal subtraction,\n4:Return to previous menu.");
						ch2=s.nextInt();
						switch(ch2)
						{
							case 1:
							    input_number=input(s);
								input_number2=input(s);
								System.out.println(input_number+" - "+input_number2+" = "+subtraction(input_number,input_number2,2));
								break;
							case 2:
							    input_number=input(s);
								input_number2=input(s);
								System.out.println(input_number+" - "+input_number2+" = "+subtraction(input_number,input_number2,8));
								break;
							case 3:
							    input_number=input(s);
								input_number2=input(s);
								System.out.println(input_number+" - "+input_number2+" = "+subtraction(input_number,input_number2,16));
						}
					}
				while(ch2!=4);
			}
		}
	while(ch1!=5);
    }
     //Function to input numbers
    public static String input(Scanner s)                       
    {
        System.out.println("Enter number");
        String input_number=s.next();
        return input_number;
    } 
    //Function to convert decimal numbers to binary/octal/hex.
    public static String decimal_to(String input_number,int b)   
    {
        String nitm="",output_number="";
        int input_number2=Integer.valueOf(input_number);
        if(input_number2!=0)   
        //If input is zero then without this if condition no output will be there.                                  
        {
        while(input_number2!=0)
        {
            if(input_number2%b>9)
                nitm=nitm+(char)(input_number2%b+55);
            else
                nitm+=String.valueOf(input_number2%b);
            input_number2/=b;
        }
        for(int i=nitm.length()-1;i>=0;i=i-1)
            output_number+=String.valueOf(nitm.charAt(i));
        return output_number;
        }
        else
            return input_number;
        
    }
     //Function to convert binary/octal/hex to decimal.
    public static int to_decimal(String input_number,int b)    
    {
        int a=0,output_number1=0;
        for(int i=input_number.length()-1;i>=0;i=i-1)
        {
            //For hexadecimal digits
            if(Character.isDigit(input_number.charAt(i))==false) 
                output_number1+=(input_number.charAt(i)-'0'-7)*(int)(Math.pow(b,a));
            else
                output_number1+=(input_number.charAt(i)-'0')*(int)(Math.pow(b,a));
            a=a+1;
        }
        return output_number1;
    }
    //Function to convert oct/hex to hex/oct.
    public static String oct_hex_to_hex_oct(String input_number,int b)
    {
        String o="",nitm="",output_number="",o1="";
        int nitm1=0,i,c;
        for(i=0;i<input_number.length();i=i+1)
        {
            //First number is converted to binary
            if(Character.isLetter(input_number.charAt(i))==true)
                nitm=decimal_to(String.valueOf(input_number.charAt(i)-'0'-7),2);
            else
                nitm=decimal_to(String.valueOf(input_number.charAt(i)),2);
            c=b-nitm.length();
            for(int j=1;j<=c;j=j+1)
                nitm="0"+nitm;
            output_number+=nitm;
        }
        output_number+=" ";
        if(b==3)
            b=4;
        else
            b=3;
            //Then binary number is converted to required format.
        for(i=output_number.length()-1;i>0;i=i-b)              
        {
            if(i-b<0)
                nitm1=to_decimal(output_number.substring(0,i),2);
            else
                nitm1=to_decimal(output_number.substring(i-b,i),2);
            if(nitm1>9)
                o=o+String.valueOf((char)(nitm1+'0'+7));
            else
                o=o+String.valueOf(nitm1);
        }
        for(i=o.length()-1;i>=0;i=i-1)
            o1=o1+o.charAt(i);
        return o1;
    }
    //Function to add two numbers of same format
    public static String addition(String input_number,String input_number2,int b)
    {
        int i,a,e,c=0,j;
        String d,nitm="",output_number="",f="";
        if(input_number.length()>input_number2.length())
        {   j=input_number.length()-input_number2.length();
            for(i=1;i<=j;i=i+1)
                input_number2="0"+input_number2;
        }
        else
        {   j=input_number2.length()-input_number.length();
            for(i=1;i<=j;i=i+1)
                input_number="0"+input_number;
        }
        for(i=input_number.length()-1;i>=0;i=i-1)
        {
            a=input_number.charAt(i)-'0';
            //For conversion of hexadecimal letters to decimal digits
            if(a>=('A'-'0'))                                 
                a=a-7;
            e=input_number2.charAt(i)-'0';
            if(e>=('A'-'0'))
                e=e-7;
            d=decimal_to(String.valueOf(a+e+c),b);
            nitm=nitm+d.charAt(d.length()-1);
            if(d.length()==1)
                d="0";
            c=d.charAt(0)-'0';
        }
        for(i=nitm.length()-1;i>=0;i=i-1)
            output_number+=nitm.charAt(i);
             //Inserting the carry at the end
        if(c!=0)
        f=String.valueOf(c)+output_number;                  
        else
        f=output_number;
        return f;
    }
    //Multiplication of two numbers
    public static String multiplication(String input_number,String input_number2,int b) 
    {
        int i,j,a,b1=0,c=0,d;
        //Array to store the product of 1st digit of first no. and the 2nd no.
        String d2[]=new String[input_number.length()];  
         //Array to add the X while multiplying     
        String d3[]=new String[input_number.length()];      
        String d1;
        for(i=input_number.length()-1;i>=0;i=i-1)
        {//Digit of first number
            a=Integer.valueOf(input_number.charAt(i))-'0';   
            if(a>9)
                a=a-7;
            d2[i]="";
            c=0;
            for(j=input_number2.length()-1;j>=0;j=j-1)
            {//Digit of second number.
                b1=Integer.valueOf(input_number2.charAt(j))-'0'; 
                if(b1>9)
                    b1=b1-7;
                     //Multiplying the numbers and adding the carry 
                d=(a*b1)+c;                                   
                c=0;
                d1=decimal_to(String.valueOf(d),b);
                d2[i]=d2[i]+d1.charAt(d1.length()-1);
                   //Determining the carry
                if(d1.length()!=1)
                    if(d1.charAt(0)-'0'>9)
                        c=d1.charAt(0)-'0'-7;             
                    else
                        c=d1.charAt(0)-'0';
            }
            d3[i]="";
              //Adding the carry at the end
            for(j=d2[i].length()-1;j>=0;j=j-1)
                d3[i]=d3[i]+d2[i].charAt(j);
            if(c!=0)
                d3[i]=String.valueOf(c)+d3[i];            
        }
           //Concatenating 0 to represent x in a multiplication
        for(i=0;i<input_number.length();i=i+1)
            for(j=0;j<input_number.length()-1-i;j=j+1)   
                d3[i]=d3[i]+"0";
         //Adding the numbers two at a time using the addition function
        for(i=0;i<input_number.length()-1;i=i+1)           
        d3[i+1]=addition(d3[i],d3[i+1],b);
        return d3[input_number.length()-1];
    }
    //to find 1's complement
    public static String complement(String input_number,int b)  
    {
        int i,a,nitm;
        String output_number="";
            for(i=0;i<input_number.length();i=i+1)
			{
				a=input_number.charAt(i)-'0';
                  //converting haxadecimal letters to thier digit equivalent
				if(a>=('A'-'0'))                          
					a=a-7;
				nitm=(b-1)-a;
                 //converting digits to their hexadecmal letter equivalent
				if(nitm>=10)
					output_number=output_number+(char)('A'+nitm-10); 
				else
					output_number=output_number+nitm;
			}
			return output_number;
	}
	public static String subtraction(String input_number1,String input_number2,int b)
	{
		int i,c;
		String output_number="",complement_2,nitm;
		c=Math.max(input_number1.length(),input_number2.length());
        //making length of both numbers same by concatenating 0
		for(i=1;i<=c-input_number2.length();i++)        
			input_number2="0"+input_number2;
		for(i=1;i<c-input_number1.length();i++)
			input_number1="0"+input_number1;
		complement_2=complement(input_number2,b);
		nitm=addition(input_number1,complement_2,b);
         //checking for carry after addition in step1
		if(nitm.length()>c)                           
			output_number=addition(String.valueOf(nitm.charAt(0)),nitm.substring(1),b);
		else
			output_number="-"+complement(nitm,b);
		return output_number;
	}
}