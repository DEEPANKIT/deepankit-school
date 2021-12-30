Step 1 - class insertsort
Step 2 - l1=l2=null
Step 3 - val=0
Step 4 - Scanner s=new Scanner(System.in)
Step 5 - println "Enter number of values"
Step 6 - input n
Step 7 - for i=0 to N-1 inc 1
Step 8 - input k
Step 9 - if l1==null goto step 10 else goto step 14
Step 10 - l1=l2=new link()
Step 11 - l1.data=k
Step 12 - l1.next=null
Step 13 - l1.previous=null
Step 14 - l2.next=new link()
Step 15 - l2.next.previous=l2
Step 16 - l2=l2.next
Step 17 - l2.data=k
Step 18 - l2.next=null
Step 19 - endif
Step 20 - endfor
Step 21 - l3=l1
Step 22 - m=0,n=0
Step 23 - for i=0 to N-1 inc 1
Step 24 - l3=l1
Step 25 - for j=0 to i-1 inc 1
Step 26 - l3=l3.next
Step 27 - val=l3.data
Step 28 - while l3.previous!=null && l3.previous.data>val
Step 29 - l3.data=l3.previous.data
Step 30 - l3=l3.previous
Step 31 - endwhile
Step 32 - if l3==null goto step 33 else goto step 35
Step 33 - l3=l1
Step 34 - l3.data=val
Step 35 - l3.data=val
Step 36 - endif
Step 37 - l3=l1
Step 38 - while l3.next!=null
Step 39 - print l3.data+" "
Step 40 - l3=l3.next
Step 41 - endwhile
Step 42 - println l3.data
Step 43 - endfor
Step 44 - endfor
Step 45 - end