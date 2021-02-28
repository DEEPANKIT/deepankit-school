import java.util.*;
import java.io.*;
class file_handling
{
	public static void main(String at[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		DataInputStream z=new DataInputStream(System.in);
		int ch,ch1;
		do
		{
		System.out.println("Enter choice - ");
		System.out.println("1 - Add");
		System.out.println("2 - Edit");
		System.out.println("3 - Delete");
		System.out.println("4 - Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			FileWriter f5=new FileWriter("student.dat",true);
			PrintWriter p5=new PrintWriter(f5);
			System.out.println("Enter roll no.");
			int r=sc.nextInt();
			System.out.println("Enter name");
			String n=z.readLine();
			System.out.println("Enter class");
			String c=z.readLine();
			System.out.println("Enter marks in three subjects");
			int m1=sc.nextInt(),m2=sc.nextInt(),m3=sc.nextInt();
			p5.println(r+" "+n+" "+c+" "+m1+" "+m2+" "+m3);
			p5.close();
			f5.close();
			break;
			case 2:
			do
			{
				System.out.println("1 - Edit name");
				System.out.println("2 - Edit marks");
				System.out.println("3 - Exit");
				ch1=sc.nextInt();
				switch(ch1)
				{
				case 1:
				FileReader f1=new FileReader("student.dat");
		        BufferedReader br=new BufferedReader(f1);
		        FileWriter fw=new FileWriter("temp");
		        PrintWriter pw=new PrintWriter(fw);
			    System.out.println("Enter roll no. of student whose record is to be edited");
			    int rn=sc.nextInt();
			    System.out.println("Enter name");
			    n=z.readLine();
			    int ro;
			    String n1,k[];
			    while((n1=br.readLine())!=null)
			  {
				k=n1.split(" ");
				ro=Integer.parseInt(k[0]);
				if(ro==rn)
				pw.println(rn+" "+n+" "+k[2]+" "+k[3]+" "+k[4]+" "+k[5]);
				else
				pw.println(n1);
			   }
			br.close();
			f1.close();
			pw.close();
			fw.close();
			File f2=new File("student.dat");
			f2.delete();
			f2=new File("temp");
			f2.renameTo(new  File("student.dat"));
		    break;
			case 2:
			FileReader ff1=new FileReader("student.dat");
		    BufferedReader br1=new BufferedReader(ff1);
		    FileWriter fw1=new FileWriter("temp");
		    PrintWriter pw1=new PrintWriter(fw1);
			System.out.println("Enter roll no. of student whose record is to be edited");
			rn=sc.nextInt();
			System.out.println("Enter marks in three subjects");
			m1=sc.nextInt();
			m2=sc.nextInt();
			m3=sc.nextInt();
			String n2,k2[];
			while((n2=br1.readLine())!=null)
			{
				k2=n2.split(" ");
				ro=Integer.parseInt(k2[0]);
				if(ro==rn)
				pw1.println(rn+" "+k2[1]+" "+k2[2]+" "+m1+" "+m2+" "+m3);
				else
				pw1.println(n2);
			}
			br1.close();
			ff1.close();
			pw1.close();
			fw1.close();
			File f3=new File("student.dat");
			f3.delete();
			f3=new File("temp");
			f3.renameTo(new File("student.dat"));
			break;
			case 3:
			break;
			default:
			System.out.println("Wrong choice");
				}
			}
			while(ch1!=3);
			break;
			case 3:
			FileReader f3=new FileReader("student.dat");
		    BufferedReader br2=new BufferedReader(f3);
		    FileWriter fw2=new FileWriter("temp");
		    PrintWriter pw2=new PrintWriter(fw2);
			System.out.println("Enter roll no. of the student whose record is to be deleted");
			r=sc.nextInt();	
			String n3,k3[];
			int ro;
			String n1,k[];
			while((n1=br2.readLine())!=null)
			{
				k=n1.split(" ");
				ro=Integer.parseInt(k[0]);
				if(ro!=r)
				pw2.println(n1);
			}
			br2.close();
			f3.close();
			pw2.close();
			fw2.close();
			File f4=new File("student.dat");
			f4.delete();
			f4=new File("temp");
			f4.renameTo(new File("student.dat"));
			break;
			case 4:
			break;
			default:
			System.out.println("Wrong choice");
		}
		}
		while(ch!=4);
	}
}
	
			
		    
		
			
				