Step-1   queue(int size)
Step-2   a=new int[size]
Step-3   front=-1
Step-4   rear=-1
Step-5   end Stack(int size)
Step-6   push(int p)
Step-7   if rear==a.length-1 then goto Step-8 else goto Step-10
Step-8   print "Overflow"
Step-9   goto Step-14
Step-10  if front==-1 then goto Step-11 else goto Step-12
Step-11  front=0
Step-12  rear++
Step-13  a[rear]=p
Step-14  end if
Step-15  end push(int p)
Step-16  pop()
Step-17  if front==-1||front>rear then goto Step-18 else goto Step-20
Step-18  return -9999
Step-19  goto Step-23
Step-20  t=a[front]
Step-21  front++
Step-22  return t
Step-23  end if
Step-24  end pop()
Step-25  peek()
Step-26  if front==-1||front>rear then goto Step-27 else goto Step-30
Step-27  front=rear=-1
Step-28  return -9999
Step-29  goto step-31
Step-30  return a[front]
Step-31  end if
Step-32  end peek()
Step-33  end
Step-34  main(String args[])
Step-35  print "Enter length of queue array"
Step-36  input l
Step-37  q=new queue(l)
Step-38  do
Step-39  print "1-PUSH\t2-POP\t3-PEEK\t4-EXIT"
Step-40  input ch
Step-41  switch(ch)
Step-42  case 1:
Step-43  print "Element to be pushed"
Step-44  input w
Step-45  q.push(w)
Step-46  break;
Step-47  case 2:
Step-48  w=q.pop()
Step-49  if w==-9999 then goto Step-50 else goto Step-52
Step-50  print "Underflow"
Step-51  goto Step-53
Step-52  print ("Element popped"+w)
Step-53  end if
Step-54  break
Step-55  case 3:
Step-56  w=q.peek()
Step-57  if w=-9999 then goto Step-58 else goto Step-60
Step-58  print "Underflow"
Step-59  goto Step-61
Step-60  print ("Element peeked"+w)
Step-61  end if
Step-62  break
Step-63  case 4:
Step-64  break
Step-65  default:
Step-66  print "Invalid choice"
Step-67  end switch(ch)
Step-68  while ch!=4
Step-69  end do while
Step-70  end

 
