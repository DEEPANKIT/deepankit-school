import java.util.*;
class timehours
{
public static void main(String at[])
{
Scanner sc=new Scanner(System.in);
String tt1,tt2,hh1,hh2,mm1,mm2,ss1,ss2;
int h1,h2,m1,m2,s1,s2,c1,c2,cc1,cc2,h=0,m=0,s=0,hours=0,min=0,sec=0;
System.out.println("enter login time in 24 hrs format");
tt1=sc.nextLine();
c1=tt1.indexOf(":");
hh1=tt1.substring(0,c1);
h1=Integer.parseInt(hh1);
c2=tt1.lastIndexOf(":");
mm1=tt1.substring((c1+1),c2);
m1=Integer.parseInt(mm1);
ss1=tt1.substring((c2+1),(tt1.length()));
s1=Integer.parseInt(ss1);

System.out.println("enter logout time in 24 hrs format");
tt2=sc.nextLine();
cc1=tt2.indexOf(":");
hh2=tt2.substring(0,cc1);
h2=Integer.parseInt(hh2);
cc2=tt2.lastIndexOf(":");
mm2=tt2.substring((cc1+1),cc2);
m2=Integer.parseInt(mm2);
ss2=tt2.substring((cc2+1),(tt2.length()));
s2=Integer.parseInt(ss2);
if(h1>h2)
{
h=23-h1;
m=59-m1;
s=60-s1;
hours=h+h2;
min=m+m2;
sec=s+s2;
System.out.println("work time-"+hours+":"+min+":"+sec);
}
else
{
if(s1>s2)
{
m2=m2-1;
s2=s2+60;
s=s2-s1;
}
else
{
s=s2-s1;
}
if(m1>m2)
{
h2=h2-1;
m2=m2+60;
m=m2-m1;
}
else
{
m=m2-m1;
}
h=h2-h1;
System.out.println("work time-"+h+":"+m+":"+s);
}


}
}