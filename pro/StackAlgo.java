Step-1    Stack(int size)
Step-2    a=new int[size]
Step-3    tos=-1
Step-4    end Stack(int size)
Step-5    push(int p)
Step-6    if tos==a.length-1 then goto Step-7 else goto Step-9
Step-7    print "Overflow"
Step-8    goto Step-10
Step-9    a[++tos]=p
Step-10   end if
Step-11   end push(int p)
Step-12   pop()
Step-13   if tos==-1 then goto Step-14 else goto Step-16
Step-14   return -9999
Step-15   goto Step-17
Step-16   return a[tos--]
Step-17   end if
Step-18   end pop()
Step-19   peek()
Step-20   if tos==-1 then goto Step-21 else goto Step-23
Step-21   return -9999
Step-22   goto Step-24
Step-23   return a[tos]
Step-24   end if
Step-25   end peek()
Step-26   end
Step-27   main(String at[])
Step-28   print "Enter length of Stack array
Step-29   input l
Step-30   s1=new Stack(l)
Step-31   do
Step-32   print "1-Push\n2-Pop\n3-Peek\n4-exit"
Step-33   input ch
Step-34   switch(ch)
Step-35   case 1:
Step-36   print "Enter element to be pushed"
Step-37   input p
Step-38   s1.push(p)
Step-39   break
Step-40   case 2:
Step-41   p=s1.pop()
Step-42   if p==-9999 then goto Step-43 else goto Step-45
Step-43   print "Underflow"
Step-44   goto Step-46
Step-45   print ("Popped value="+p)
Step-46   end if
Step-47   break
Step-48   case 3:
Step-49   p=s1.peek()
Step-50   if p==-9999 then goto Step-51 else goto Step-53
Step-51   print "Underflow"
Step-52   goto Step-54
Step-53   print("Peeked value="+p)
Step-54   end if
Step-55   break
Step-56   case 4:
Step-57   break
Step-58   default:
Step-59   print "Wrong Option");
Step-60   break
Step-61   end switch(ch)
Step-62   while(ch!=4)
Step-63   end do while
Step-64   end main(String at[])
Step-65   end
