Step-1    input()
Step-2    print "Enter Message"
Step-3    input Message 
Step-4    end input()
Step-5    encode(String s)
Step-6    s=s.toLowerCase()
Step-7    w=""
Step-8    for i=0 to i=s.length()-1 inc=+1
Step-9    c=s.charAt(i)
Step-10   if c==' ' then goto Step-11 else goto Step-13
Step-11   w=w+c
Step-12   goto Step-19
Step-13   ascii=(int)c
Step-14   ascii=ascii+13
Step-15   if ascii>122 then goto Step-16 else goto Step-18
Step-16   ascii=(ascii-122)+96
Step-17   end if
Step-18   w=w+(char)ascii
Step-19   end if
Step-20   end for
Step-21   return w
Step-22   end encode(String)
Step-23   display()
Step-24   print("The Actual Message is :"+Message)
Step-25   print("The Encoded Message is :"+Enc_Msg)
Step-26   end display()
Step-27   main(String ar[])
Step-28   Encrypt z=new Encrypt(Message)
Step-29   z.input()
Step-30   Enc_Msg=z.encode(Message)
Step-31   z.display()
Step-32   end main(String ar[])
Step-33   end