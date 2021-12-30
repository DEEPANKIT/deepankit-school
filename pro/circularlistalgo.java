Step 1  main
Step 2  link l1=l2=null
Step 3  int pos=1
Step 4  do
Step 5  print ("Enter a number ->")
Step 6  input k
Step 7  if(l1==null) then go to step 7 else go to step 12
Step 8  l1=l2=new link()
Step 9  l1.data=k
Step 10  l1.next=null
Step 11  go to step 16
Step 12  l2.next=new link()
Step 13  l2=l2.next
Step 14  l2.data=k
Step 15  l2.next=null
Step 16  print ("Do you want to continue Y/N ->")
Step 17  store the first letter of user's input in ch
Step 18  convert ch into uppercase
Step 19  end of do while if(ch=='n')
Step 20  l2.next=l1
Step 21  labelled do
Step 22  print ("Enter choice->\n1)Insert\n2)Delete\n3)Search\n4)Print\n5)Exit")
Step 23  input c1
Step 24  switch(c1)
Step 25  case 1
Step 26  labelled do
Step 27  leave a line
Step 28  print ("Enter choice->\n1)Add at a position\n2)Add after a value\n3)Add before a value\n4)Exit")
Step 29  input c
Step 30  switch(c)
Step 31  case 1
Step 32  print ("Enter the number to inserted ->")
Step 33  input k
Step 34  print ("Enter the position at which the number is to be inserted->")
Step 35  input n
Step 36  pos=1
Step 37  l3=new link()
Step 38  l3.data=k
Step 39  l3.next=null
Step 40  for l2=l1 to l2.next!=l1;l2=l2.next
Step 41  pos++
Step 42  if(n<1) then go to step 43 else go to step 45
Step 43  print ("Invalid position")
Step 44  break
Step 45  if(n==1) then go to step 46 else go to step 54
Step 46  l4=l1
Step 47  while(l4.next!=l1)
Step 48  l4=l4.next
Step 49  end while
Step 50  l3.next=l1
Step 51  l1=l3
Step 52  l4.next=l1
Step 53  break
Step 54  if(pos==n) then go to step 55 else go to step 58
Step 55  l3.next=l2.next
Step 56  l2.next=l3
Step 57  break
Step 58  end for(step 40)
Step 59  if(l2.next==l1&&n>pos) then go to step 60 else go to step 62
Step 60  l2.next=l3
Step 61  l3.next=l1
Step 62  break (case 1)
Step 63  case 2
Step 64  print ("Enter number to be inserted ->")
Step 65  input k
Step 66  print ("Enter number after which you want to insert ->")
Step 67  input h
Step 68  l3=l1
Step 69  l4=new link()
Step 70  l4.data=k
Step 71  l4.next=null
Step 72  while(l3.data!=h)
Step 73  l3=l3.next
Step 74  end while
Step 75  if(l3.next==l1) then go to step 76 else go to step 79
Step 76  l3.next=l4
Step 77  l4.next=l1
Step 78  go to step 81
Step 79  l4.next=l3.next
Step 80  l3.next=l4
Step 81  break (case 2)
Step 82  case 3
Step 83  print ("Enter number to be inserted ->")
Step 84  input k
Step 85  print ("Enter number before which you want to insert ->")
Step 86  input h
Step 87  l3=new link()
Step 88  l4=new link()
Step 89  l4.data=k
Step 90  l4.next=null
Step 91  l3=l1
Step 92  if(l1.data!=h) then go to step 93 else go to step 99
Step 93  while(l3.next.data!=h)
Step 94  l3=l3.next
Step 95  end while
Step 96  l4.next=l3.next
Step 97  l3.next=l4
Step 98  go to step 106
Step 99  link l5=l1
Step 100  while(l5.next!=l1)
Step 101  l5=l5.next
Step 102  end while
Step 103  l4.next=l1
Step 104  l1=l4
Step 105  l5.next=l1
Step 106  break (case 3)
Step 107  case 4
Step 108  break the labelled do while (step 21)
Step 109  default
Step 110  print ("Wrong choice")
Step 111  end switch
Step 112  end do while if (c==4)
Step 113  break (case 1)
Step 114  case 2
Step 115  labelled do
Step 116  leave a line
Step 117  print ("Enter choice->\n1)Delete at a position\n2)Delete a value\n3)Exit")
Step 118  input c
Step 119  switch(c)
Step 120  case 1
Step 121  print ("Enter the position at which the number is to be deleted ->")
Step 122  input n
Step 123  pos=1
Step 124  l3=new link()
Step 125  for l2=l1 till l2.next!=l1;l2=l2.next
Step 126  pos++
Step 127  if(n<1) then go to step 128 else go to step 130
Step 128  print ("Invalid position")
Step 129  break
Step 130  if(n==1) then go to step 131 else go to step 137
Step 131  while(l2.next!=l1)
Step 132  l2=l2.next
Step 133  end while
Step 134  l1=l1.next
Step 135  l2.next=l1
Step 136  break
Step 137  if(pos==n) then go to step 138 else go to step 143
Step 138  l3=new link()
Step 139  l3=l2.next
Step 140  l2.next=l3.next
Step 141  l3.next=null
Step 142  break
Step 143  end for 
Step 144  break (case 1)
Step 145  case 2
Step 146  print ("Enter number which you want to delete :")
Step 147  input h
Step 148  l3=l1
Step 149  while(l3.data!=h)
Step 150  if(l3.next==l1) then go to step 151 else go to step 154
Step 151  f=1
Step 152  break
Step 153  go to step 155
Step 154  l3=l3.next
Step 155  end of while
Step 156  if(l3.data==h&&f!=1) then go to step 157 else go to step 177
Step 157  l3=l1
Step 158  l4=new link()
Step 159  if(l1.data!=h) then go to step 160 else go to step 170
Step 160  while(l3.next.data!=h)
Step 161  if(l3.next==l1) then go to step 162 else go to step 164
Step 162  g=1
Step 163  break
Step 164  l3=l3.next
Step 165  end of while
Step 166  l4=l3.next
Step 167  l3.next=l4.next
Step 168  l4.next=null
Step 169  go to step 178
Step 170  l3=l1
Step 171  while(l3.next!=l1)
Step 172  l3=l3.next
Step 173  end while
Step 174  l1=l1.next
Step 175  l3.next=l1
Step 176  go to step 178
Step 177  print ("Not found")
Step 178  break (case 2)
Step 179  case 3
Step 180  break labelled do while(step 115)
Step 181  default
Step 182  print ("Wrong choice")
Step 183  end of switch
Step 184  end do while if(c==3)
Step 185  break (case 2)
Step 186  case 3
Step 187  print ("Enter the number to searched ->")
Step 188  input k
Step 189  l3=l1
Step 190  while(l3.data!=k)
Step 191  if(l3.next==l1) then go to step 192 else go to step 193
Step 192  break
Step 193  l3=l3.next
Step 194  end of while
Step 195  if(l3.data==k) then go to step 196 else go to step 198
Step 196  print ("Found")
Step 197  go to step 199
Step 198  print ("Not found")
Step 199  break (case 3)
Step 200  case 4
Step 201  l2=l1
Step 202  do
Step 203  print (l2.data+" ")
Step 204  l2=l2.next
Step 205  end do while if(l2==l1)
Step 206  leave a line
Step 207  break (case 4)
Step 208  case 5
Step 209  break labelled do while (step 21)
Step 210  default 
Step 211  print ("Wrong choice")
Step 212  end do while if(c1==5)
Step 213  end main  

 