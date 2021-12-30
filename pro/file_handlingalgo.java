Step 1 start of class filehandling
Step 2 start of main()
Step 3 while(true)
Step 4 f1=new FileWriter("temp.txt")
Step 5 p1=new PrintWriter(f1)
Step 6 f2=new FileReader("xyz.txt")
Step 7 b1=new BufferedReader(f2)
Step 8 print enter choice
Step 9 start of main switch
Step 10 case 1
Step 11 print Enter Roll no. & New name
Step 12 input r
Step 13 input n
Step 14 while((m=b1.readLine())!=null)
Step 15 k=m.split("@")
Step 16 if(Integer.parseInt(k[0])==r) then print k[0]+"@"+n+"@"+k[2]+"@"+k[3] on text file
Step 17 else print value of m on text file
Step 18 end of while
Step 19 close the streams b1,f2,p1 and f1
Step 20 f=new File("xyz.txt")
Step 21 f.delete()
Step 22 create a temporary file
Step 23 rename the file
Step 24 end of case 1
Step 25 case 2
Step 26 ask for user's choice
Step 27 start of nested switch
Step 28 case 1
Step 29 input r
Step 30 input m1
Step 31 while((m=b1.readLine())!=null) 
Step 32 k=m.split("@")
Step 33 if(Integer.parseInt(k[0])==r) then print k[0]+"@"+k[1]+"@"+m1+"@"+k[3] on text file
Step 34 else print value of m on text file
Step 35 end of while
Step 36 close the streams b1,f2,p1,f1
Step 37 f=new File("xyz.txt")
Step 38 f.delete()
Step 39 create a temporary file
Step 40 rename the file
Step 41 case 2
Step 42 print "Enter new marks in Computer"
Step 43 while((m=b1.readLine())!=null)
Step 44 input m1
Step 45 k=m.split("@")
Step 46 print k[0]+"@"+k[1]+"@"+m1+"@"+k[3] on text file
Step 47 end of while
Step 48 close the streams b1,f2,p1,f1
Step 49 f=new File("xyz.txt")
Step 50 f.delete()
Step 51 create a temporary file
Step 52 rename the file
Step 53 default case
Step 54 end of nested switch
Step 55 end of case 2
Step 56 case 3
Step 57 start of nested switch
Step 58 case 1
Step 59 input r
Step 60 input m1
Step 61 while((m=b1.readLine())!=null)
Step 62 k=m.split("@")
Step 63 if(Integer.parseInt(k[0])==r) then print k[0]+"@"+k[1]+"@"+k[2]+"@"+m1 on the file
Step 64 else print value of m on text file
Step 65 end of while
Step 66 close the streams b1,f2,p1,f1
Step 67 f=new File("xyz.txt")
Step 68 f.delete()
Step 69 create a temporary file
Step 70 rename the file
Step 71 case 2
Step 72 print Enter new marks in English
Step 73 while((m=b1.readLine())!=null)
Step 74 input m1
Step 75 k=m.split("@")
Step 76 print k[0]+"@"+k[1]+"@"+k[2]+"@"+m1 on the file
Step 77 end of while
Step 78 close the streams b1,f2,p1,f1
Step 79 f=new File("xyz.txt")
Step 80 f.delete()
Step 81 create a temporary file
Step 82 rename the file
Step 83 default case
Step 84 print wrong option
Step 85 end of nested switch
Step 86 end of case 3
Step 87 case 4
Step 88 break labelled while loop
Step 89 default case
Step 90 print wrong option
Step 91 end of main switch
Step 92 end of while
Step 93 end of main()
Step 94 end of class filehandling
