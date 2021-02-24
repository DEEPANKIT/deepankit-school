import java.util.*;

public class number_system {
    public static void main(String ab[])
	{
		Scanner sc=new Scanner(System.in);
		int ch,b,d=1,m,s=0,a=0,u=1,z=1,k,s1=0,n,e,l,j,len,x,bno,r,cal=0,octalno,inter=0,no=0,t,lp,oc,hx,dn,l1,carry=0,qt,inter1,ex,n1,n2,i,lb,lb1,lc,lan,w,w2,ws,si,lss,ld,lsd,y,lcar,sd=0,d1=1,lrs,lrsp,lps,lcs,lpf;
		double dno=0.0;
		char ch1,g,q,c,c1,ch2,ci1,ci2,ch3,ch4, bg,bg2,sch;
		String s2="",s3="",hexno,bsno,bsno1,intr="",add="",octalnos,octalnos1,b1,b2,ans="",an="",bns="",anss="",ss="",ansf="",carrys="",car="",ansd="",anf="",asn="",rp1="1",rp="",rsf="",rpss="",rspf="",rfp="",rf="",pp="",pf="",aps="",rss="",rcf="",rc1="1",rc="";
		do
		{
			System.out.println("CHOICES");
            System.out.println("1- CONVERSIONS");
            System.out.println("2- ADDITION");
            System.out.println("3- SUBTRACTION");
            System.out.println("4- MULTIPLICATION");
            System.out.println("5- EXIT");
            ch=sc.nextInt();
            switch(ch)
            {
            	case 1:
                System.out.println("ENTER CHOICE OF CONVERSION");
                System.out.println("A- DECIMAL TO BINARY");
                System.out.println("B- DECIMAL TO OCTAL");
                System.out.println("C- DECIMAL TO HEXADECIMAL");
                System.out.println("D- BINARY TO DECIMAL");
                System.out.println("E- OCTAL TO DECIMAL");
                System.out.println("F- HEXADECIMAL TO DECIMAL");
                System.out.println("G- OCTAL TO HEXADECIMAL");
                System.out.println("H- HEXADECIMAL TO OCTAL");
                ch1=sc.next().charAt(0);
                switch(ch1)
                {
                	case 'A':
                	System.out.println("ENTER A DECIMAL NO.");
					n=sc.nextInt();
                    b=n;
                    while(b!=0)
                    {
                        m=b%2;
                        b=b/2;
                        s=s+(d*m);
                        d=d*10;
                    }
                    System.out.println("BINARY NO.="+s);
                    break;
                    case 'B':
                    System.out.println("ENTER A DECIMAL NO.");
					n=sc.nextInt();
                    a=n;
                    while(a!=0)
                    {
                        k=a%8;
                        a=a/8;
                        s1=s1+(z*k);
                        z=z*10;
                    }
                    System.out.println("OCTAL NO.="+s1);
                    break;
                    case 'C':
                    System.out.println("ENTER A DECIMAL NO.");
					n=sc.nextInt();
                    e=n;
                    while(e!=0)
                    {
                        l=e%16;
                        e=e/16;
                        if(l==10||l==11||l==12||l==13||l==14||l==15)
                        {
                            j=l+55;
                            g=(char)j;
                            s2=s2+g;
                        }
                        else
                        {
                            String h=Integer.toString(l);
                            s2=s2+h;
                        }
                    }
                    len=s2.length();
                    for(x=len-1;x>=0;x--)
                    {
                        q=s2.charAt(x);
                        s3=s3+q;
                    }
                    System.out.println("HEXADECIMAL NO.="+s3);
                    break;
                    case'D':
                    cal=0;
                    System.out.println("ENTER A BINARY NO.");
                    bno=sc.nextInt();
                    dno=0.0;
                    while(bno!=0)
                    {
                        r=bno%10;
                        dno=dno+(r*(Math.pow(2,cal)));
                        bno=bno/10;   
                        cal=cal+1;
                    }
                    dn=(int)dno;
                    System.out.println("DECIMAL EQUIVALENT="+dn);
                    break;
                    case 'E':
                    cal=0;
                    dno=0.0;
                    System.out.println("ENTER OCTAL NO.");
                    octalno=sc.nextInt();
                    while(octalno!=0)
                    {
                        r=octalno%10;
                        dno=dno+(r*(Math.pow(8,cal)));
                        octalno=octalno/10;   
                        cal=cal+1;
                    }
                    dn=(int)dno;
                    System.out.println("DECIMAL EQUIVALENT="+dn);
                    break;
                    case 'F':
                    l=0;
                    x=0;
                    inter=0;
                    no=0;
                    cal=0;
                    dno=0.0;
                    c='\u0000';
                    System.out.println("ENTER A HEXADECIMAL NO.");
                    hexno=sc.next();
                    l=hexno.length();
                    for(x=l-1;x>=0;x=x-1)
                    {
                        c=hexno.charAt(x);
                        inter=c;
                        if(inter>=48 && inter <=57)
                        {
                            no=inter-48;
                            dno=dno+(no*(Math.pow(16,cal)));
                        }
                        else if(inter>=65 && inter<=70)
                        {
                            no=inter-55;
                            dno=dno+(no*(Math.pow(16,cal)));
                        }
                        cal=cal+1;
                    }
                    dn=(int)dno;
                    System.out.println("DECIMAL EQUIVALENT="+dn);
                    break;
                    case 'G':
                      System.out.println("ENTER AN OCTAL NO.");
                    int er=Integer.parseInt(sc.next());
                     int rem1=0,kl=0,ans2=0;
                     String ans2d="";
          			ans="";
          			String ans3="",blah="";
            		while(er!=0)
            		{ 
            			int mj=er%10;
            			er=er/10;
             			while(mj!=0)
            			{ 
                			rem1=mj%2;
                     		mj=mj/2;
                     		ans=rem1+ans;
              			}
            		}
            		int ans1=Integer.parseInt(ans);
            		while(ans1!=0)
            		{
             			int h=ans1%10000;
             			ans1=ans1/10000;
              			while(h!=0)
              			{
                     		int rem2=(h%10)*(int)Math.pow(2,kl);
                             ans2=ans2+rem2;
                     		h=h/10;
                     		kl++;
                         }
                         blah=ans2+"";
                         if(ans2==10||ans2==11||ans2==12||ans2==13||ans2==14||ans2==15)
                        {
                            blah=(char)(ans2+55)+"";
                        }

             			ans3=blah+ans3;
             			ans2=0;
             			kl=0;
            		}
		   			System.out.println("HEXADECIMAL NO.="+ans3);
		    		ans3="";
                    break;
                    case'H':
                    System.out.println("ENTER A HEXADECIMAL NO.");
                    int rem2,an1;
                    String hex1;
					hex1=sc.next();
					for(x=(hex1.length()-1);x>=0;x--)
					{
						c=hex1.charAt(x);
						if(c>64)
							y=(c-64)+9;
						else
							y=c-48;
						while(y!=0)
						{

                            a++;

                            rem1=y%2;

                            y=y/2;

                            ans=rem1+ans;

                        }

                        a=0;

                    }

                    rem1=0;

                    an1=0;

                    rem2=Integer.parseInt(ans);

                    ans="";

                    while(rem2!=0)

                    {

                        y=rem2%1000;

                        rem2=rem2/1000;

                        while(y!=0)

                        {

                            rem1=(y%10)*(int)Math.pow(2,a);

                            an1=an1+rem1;

                            y=y/10;

                            a++;

                        }

                        ans=an1+ans;

                        an1=0;

                        a=0;

                    }

                    System.out.println("RESULT="+ans);
                    break;
				}
				break;
				case 2:
				System.out.println("ENTER CHOICE");
				System.out.println("A- BINARY ADDITION");
				System.out.println("B- OCTAL ADDITION");
				System.out.println("C- HEXADECIMAL ADDITION");
				ch2=sc.next().charAt(0);
				switch(ch2)
				{
					case 'A':
					i=0; 
					carry=0;   
                  	int sum[]=new int[15];
                    System.out.println("ENTER 2 BINARY NOS.");
                    n1=sc.nextInt();
                    n2=sc.nextInt();       
                	while(n1!=0 || n2!=0)
            		{
            			sum[i++]=((n1%10)+(n2%10)+carry)%2;
            			carry=((n1%10)+(n2%10)+carry)/2;
            			n1=n1/10;
            			n2=n2/10;
             		}
                    if(carry !=0)
           				sum[i++]=carry;
            		i=i-1;
              		System.out.print("RESULT=");
                    while(i>=0)
                        System.out.print(sum[i--]);
                    System.out.println();             
                    break;
                    case 'B':
                    i=0;
                    carry=0;    
                    int sum2[]=new int[15];
                    System.out.println("ENTER 2 OCTAL NOS.");
                    n1=sc.nextInt();
                    n2=sc.nextInt();       
                    while(n1!=0 || n2!=0)
                    {
                        sum2[i++]=((n1%10)+(n2%10)+carry)%8;
                        carry=((n1%10)+(n2%10)+carry)/8;
                        n1=n1/10;
                        n2=n2/10;
                    }
                    if(carry !=0)
                    sum2[i++]=carry;
                    i=i-1;
                    System.out.print("RESULT=");
                    while(i>=0)
                    System.out.print(sum2[i--]);
                    System.out.println();           
                    break;
                    case 'C':
                    System.out.println("ENTER 2 HEXADECIMAL NOS.");
                   	b1=sc.next();
                	b2=sc.next();
                	int lb2;
                	String bc1="",bc2="",as="";
                	char le;
	                lb1=b1.length();
	                lb2=b2.length();
	                carry=0;
	                if(lb1<lb2)
	                {
	                	lb=lb2-lb1;
	                	for(x=0;x<lb;x++)
	                		bc1="0"+b1;
	                }
	                else
	                	bc1=b1;
	                if(lb2<lb1)
	                {
	                	lb=lb1-lb2;
	                	for(x=0;x<lb;x++)
	                		bc2="0"+b2;
	                }
	                else
	                	bc2=b2;
	                lc=bc1.length();
	                for(y=0;y<lc;y++)
	                {
	                	bg=bc1.charAt(y);
	                	bg2=bc2.charAt(y);
	                	w=bg-'0';
	                	w2=bg2-'0';
	                	ws=w+w2+carry;
	                	if(ws>15)
	                	{
	                		e=ws;
                    		while(e!=0)
                    		{
                        		l=e%16;
                        		e=e/16;
                        		if(l==10||l==11||l==12||l==13||l==14||l==15)
                        		{
                            		j=l+55;
                            		g=(char)j;
                            		s2=s2+g;
                        		}
                        		else
                        		{
                            		String h=Integer.toString(l);
                            		s2=s2+h;
                        		}
                    		}
                    		len=s2.length();
                    		for(x=len-1;x>=0;x--)
                    		{
                        		q=s2.charAt(x);
                        		s3=s3+q;
                    		}
                    		as=as+(s3.charAt(s3.length()-1));
                    		carry=Integer.parseInt(s3.substring(0,s3.length()-1));
                    		s2="";
                    		s3="";
	                	}
	                	le='A';
	                	if(ws<=15 && ws>9)
	                	{
	                		for(y=10;y<=15;y++)
	                		{
	                			if(ws==y)
	                				as=as+le;
	                			else
	                				le++;
	                		}
	                	}
	                	if(ws<=9)
	                		as=as+ws;
					}
					System.out.println("RESULT="+as);
					as="";
                    break;
				}
				break;
				case 3:
				System.out.println("ENTER CHOICE");
				System.out.println("A- BINARY SUBTRACTION");
				System.out.println("B- OCTAL SUBTRACTION");
				System.out.println("C- HEXADECIMAL SUBTRACTION");
				System.out.println("D- BINARY SUBTRACTION WITH 1'S COMPLEMENT");
				System.out.println("E- BINARY SUBTRACTION WITH 2'S COMPLEMENT");
				ch4=sc.next().charAt(0);
				switch(ch4)
				{
					case 'A':
					System.out.println("ENTER NOS.");
            		int numi=Integer.parseInt(sc.next());
            		int nume=Integer.parseInt(sc.next());
            		String answ="";                
            		int aa=0;
            		int max1,min1,max,min;
            		max1=Math.max(numi,nume);
            		min1=Math.min(numi,nume);
            		max=max1;
            		min=min1;
            		while(max1!=0)
            		{
                		max1=max1/10;
                		aa++;
            		}
            		int sub1[]=new int[aa];
            		int sub2[]=new int[aa];
            		for(int xl=sub1.length-1;xl>=0;xl--)
            		{
                		sub1[xl]=max%10;
                		max=max/10;
            		}
            		for(int xd=sub2.length-1;xd>=0;xd--)
            		{
                		sub2[xd]=min%10;
                		min=min/10;
            		}
            		int ys=1;
            		int ans1[]=new int[sub1.length];
            		for(int xx=0;xx<sub1.length;xx++)
            		{
                		if(sub1[sub1.length-ys]<sub2[sub2.length-ys])
                		{
                    		for(int ii=sub1.length-ys-1;ii>=0;ii--)
                    		{
                        		if(sub1[ii]!=0)
                        		{
                            		sub1[ii]=sub1[ii]-1;
                            		for(int ja=sub1.length-ys-1;ja>ii;ja--)
                            			sub1[ja]=sub1[ja]+1;
                            		sub1[sub1.length-ys]=sub1[sub1.length-ys]+2;
                            		break;
                        		}
                    		}
                		}
                		ans1[sub1.length-ys]=sub1[sub1.length-ys]-sub2[sub2.length-ys];
                		ys++;
            		}
            		for(int xs=ans1.length-1;xs>=0;xs--)
            		{
            			answ=ans1[xs]+answ;
            		}
            		if(numi<nume)
            		{
            			answ="-"+answ;
        			}
            		System.out.println("RESULT="+answ);
					break;
					case 'B':
					System.out.println("ENTER NOS.");
                    int numi1=Integer.parseInt(sc.next());
            		int nume1=Integer.parseInt(sc.next());           
            		String ansp="";      
            		int al1=0;
            		int max2,min2,max11,min11;
            		max2=Math.max(numi1,nume1);
            		min2=Math.min(numi1,nume1);
            		max11=max2;
            		min11=min2;
            		while(max2!=0)
            		{
                		max2=max2/10;
                		al1++;
            		}
            		int subx1[]=new int[al1];
            		int suby2[]=new int[al1];
            		for(int xy=subx1.length-1;xy>=0;xy--)
            		{
                		subx1[xy]=max11%10;
                		max11=max11/10;
            		}
            		for(int xt=suby2.length-1;xt>=0;xt--)
            		{
                		suby2[xt]=min11%10;
                		min11=min11/10;
            		}
            		int yq=1;
            		int anss1[]=new int[subx1.length];
            		for(int xv=0;xv<subx1.length;xv++)
            		{
						if(subx1[subx1.length-yq]<suby2[suby2.length-yq])
                		{
                    		for(int im=subx1.length-yq-1;im>=0;im--)
                    		{
                        		if(subx1[im]!=0)
                        		{
                            		subx1[im]=subx1[im]-1;
                            		for(int ji=subx1.length-yq-1;ji>im;ji--)
                            			subx1[ji]=subx1[ji]+1;
                            		subx1[subx1.length-yq]=subx1[subx1.length-yq]+2;
                            		break;
                        		}
                    		}
                		}
                		anss1[subx1.length-yq]=subx1[subx1.length-yq]-suby2[suby2.length-yq];
                		yq++;
            		}
            		for(int xj=anss1.length-1;xj>=0;xj--)
            		{
            			ansp=anss1[xj]+ansp;
            		}
            		if(numi1<nume1)
            			ansp="-"+ansp;
            		System.out.println("RESULT="+ansp);
					break;
					case 'C':
					System.out.println("ENTER NOS.");
   					int numi2=Integer.parseInt(sc.next());
   					int nume2=Integer.parseInt(sc.next());
       				String answa="";                
            		int ae=0;
            		int max1a,min1a,maxa,mina;
            		max1a=Math.max(numi2,nume2);
            		min1a=Math.min(numi2,nume2);
            		maxa=max1a;
            		mina=min1a;
            		while(max1a!=0)
            		{
                		max1a=max1a/10;
                		ae++;
            		}
            		int sub1a[]=new int[ae];
            		int sub2a[]=new int[ae];
            		for(int xl1=sub1a.length-1;xl1>=0;xl1--)
            		{
                		sub1a[xl1]=maxa%10;
                		maxa=maxa/10;
            		}
            		for(int xd1=sub2a.length-1;xd1>=0;xd1--)
            		{
                		sub2a[xd1]=mina%10;
                		mina=mina/10;
            		}
            		int ysa=1;
            		int anssa[]=new int[sub1a.length];
            		for(int xxa=0;xxa<sub1a.length;xxa++)
            		{
						if(sub1a[sub1a.length-ysa]<sub2a[sub2a.length-ysa])
                		{
                    		for(int ii1=sub1a.length-ysa-1;ii1>=0;ii1--)
                    		{
                        		if(sub1a[ii1]!=0)
                        		{
                            		sub1a[ii1]=sub1a[ii1]-1;
                            		for(int ja1=sub1a.length-ysa-1;ja1>ii1;ja1--)
                            			sub1a[ja1]=sub1a[ja1]+15;
                            		sub1a[sub1a.length-ysa]=sub1a[sub1a.length-ysa]+16;
                            		break;
                        		}
                    		}
                		}
                		anssa[sub1a.length-ysa]=sub1a[sub1a.length-ysa]-sub2a[sub2a.length-ysa];
                		ysa++;
            		}
            		for(int xs1=anssa.length-1;xs1>=0;xs1--)
            		{
            			answa=anssa[xs1]+answa;
            		}
            		if(numi2<nume2)
            			answa="-"+answa;
            		System.out.println("RESULT="+answa);
					break;
					case 'D':
					System.out.println("ENTER NOS.");
					sd=0;
					d1=1;
					s=0;
					d=1;
					carry=0;
					bsno=sc.next();
					bsno1=sc.next();
					lb=bsno1.length();
					lb1=bsno.length();
					 if(lb<lb1)
	                {
	                	lc=lb1-lb;
	                	for(x=0;x<lc;x++)
	                	{
	                		an="0"+bsno1;
	                		bsno1=an;
	                	}
	                }
	                else
	                	an=ans;
	                if(lb1<lb)
	                {
	                	lc=lb-lb1;
	                	for(x=0;x<lb;x++)
	                	{
	                		bns="0"+bsno;
	                		bsno=bns;
	                	}
	                }
	                else
	                	bns=bsno;
	                lan=an.length();
	                for(x=0;x<lan;x++)
					{
						if((bsno1.charAt(x))=='1')
							ans=ans+'0';
						else
							ans=ans+'1';
					}
	                lp=bns.length();
	                for(y=lp-1;y>=0;y--)
	                {
	                	bg=bns.charAt(y);
	                	bg2=ans.charAt(y);
	                	w=bg-'0';
	                	w2=bg2-'0';
	                	ws=w+w2+carry;
	                	if(ws>1)
	                	{
	                		b=ws;
                    		while(b!=0)
                    		{
                        		m=b%2;
                        		b=b/2;
                        		s=s+(d*m);
                        		d=d*10;
                    		}
                    		ss=Integer.toString(s);
                    		sch=ss.charAt(0);
                    		si=sch-'0';
                    		anss=anss+(ss.charAt(ss.length()-1));
                    		carry=si;
	                	}
	                	else
	                	{
	                		carry=0;
	                		anss=anss+ws;
	                	}
	                }
	                lss=anss.length();
	                for(x=lss-1;x>=0;x--)
	                {
	                	ansf=ansf+anss.charAt(x);
	                }
	                carrys=carrys+carry;
	                lcar=carrys.length();
	                if(lss!=lcar)
	                {
	                	ld=lss-lcar;
	                	for(x=0;x<ld;x++)
	                	{
	                		car='0'+carrys;
	                		carrys=car;
	                	}
	                }
	                carry=0;
	                for(y=lss-1;y>=0;y--)
	                {
	                	bg=ansf.charAt(y);
	                	bg2=carrys.charAt(y);
	                	w=bg-'0';
	                	w2=bg2-'0';
	                	ws=w+w2+carry;
	                	if(ws>1)
	                	{
	                		b=ws;
                    		while(b!=0)
                    		{
                        		m=b%2;
                        		b=b/2;
                        		sd=sd+(d1*m);
                        		d1=d1*10;
                    		}
                    		ss=Integer.toString(sd);
                    		sch=ss.charAt(0);
                    		si=sch-'0';
                    		ansd=ansd+(ss.charAt(ss.length()-1));
                    		carry=si;
	                	}
	                	else
	                	{
	                		carry=0;
	                		ansd=ansd+ws;
	                	}
	                }
	                lsd=ansd.length();
	                for(x=lsd-1;x>=0;x--)
	                {
	                	anf=anf+ansd.charAt(x);
	                }
	                if(carry==1)
	                	asn=carry+anf;
	                else
	                	asn=anf;
	                System.out.println("RESULT="+asn);
					break;
					case 'E':
					break;
				}
				break;
				case 4:
				System.out.println("ENTER CHOICE");
				System.out.println("A- BINARY MULTIPLICATION");
				System.out.println("B- OCTAL MULTIPLICATION");
				System.out.println("C- DECIMAL MULTIPLICATION");
				ch3=sc.next().charAt(0);
				switch(ch3)
				{
					case 'A':
					break;
				}
			}
		}while(ch!=5);
	}
}
