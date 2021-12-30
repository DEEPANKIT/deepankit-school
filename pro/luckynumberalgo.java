Step-1    main(String at[])
Step-2    i=0
Step-3    b=0
Step-4    p=0
Step-5    print "Enter length of an array"
Step-6    input n
Step-7    a=new int[n]
Step-8    print "Enter the position to start checking"
Step-9    input i
Step-10   for x=0 to x<n inc=+1
Step-11   print "Enter an integer"
Step-12   input a[x]
Step-13   end for
Step-14   for x=0 to x<n-1 inc=+1
Step-15   b=a[i]
Step-16   a[i]=0
Step-17   if b>0 then goto Step-18 else goto Step-28
Step-18   for y=1 to y<=b inc=+1
Step-19   p=i+y
Step-20   p=p%n
Step-21   if a[p]==0 then goto Step-22 else goto Step-24
Step-22   b++
Step-23   end if
Step-24   end for
Step-25   i=i+b
Step-26   i=i%n
Step-27   goto Step-44
Step-28   for y=-1 to y>=b inc=-1
Step-29   p=i+y
Step-30   if p<0 then goto Step-31 else goto Step-35
Step-31   while p<0
Step-32   p=n+p
Step-33   end while
Step-34   end if
Step-35   if a[p]==0 then goto Step-36 else goto Step-38
Step-36   b--
Step-37   end if
Step-38   end for
Step-39   i=i+b
Step-40   while i<0
Step-41   i=i+n
Step-42   end while
Step-43   end if
STep-44   end for
Step=45   for x=0 to x<n inc=+1
Step-46   if a[x]!=0 then goto Step-47 else goto Step-50
Step-47   print("Lucky number="+a[x])
Step-48   break
Step-49   end if
Step-50   end for
Step-51   end main(String at[])
Step-52   end