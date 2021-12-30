Step 1 : Ring(N)
Step 2 : this.N = N
Step 3 : Arr = new int[N]
Step 4 : getnum()
Step 5 : take input in str
Step 6 : StringTokenizer(str,",") 
Step 7 : i=0
Step 8 : while(sc.hasMoreTokens())
Step 9 : Arr[i] = Integer.parseInt(sc.nextToken())
Step 10 : i++
Step 11 : print()
Step 12 : checker = true
Step 13 : if(Arr[N/2]==0)
Step 14 : start=0 end=N-1
Step 15 : while(start<=N/2 || end>=N/2)
Step 16 : if(((int)Math.abs(Arr[start])==Arr[end]))
Step 17 : start++ end--
Step 18 : else 
Step 19 : checker = false  break outer
Step 20 : else 
Step 21 : checker = false
Step 22 : if(checker)
Step 23 :print("The input forms a ring")
Step 24 : else
Step 25 : print ("The Input does not form a ring")
Step 26 : main()
Step 27 : obj.getnum()
Step 28 : obj.print()
Step 29 : end main
step 30 : end class
