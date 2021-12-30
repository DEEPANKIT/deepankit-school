Step 1 main
Step 2 scanner sc= new  scanner(system.in)
Step 3 input first time
Step 4 input second time
Step 5 k1=a.split
Step 6 k2=b.split
Step 7 sec1=Integer.parseInt(k1[0])*3600+Integer.parseInt(k1[1])*60+Integer.parseInt(k1[2])
Step 7 sec2=Integer.parseInt(k2[0])*3600+Integer.parseInt(k2[1])*60+Integer.parseInt(k2[2])
Step 8  if f sec2>sec1
Step 9 sec=sec2-sec1
Step 10 else
Step 11 sec=3600*24+sec2-sec1
Step 12 hrs=sec/3600
Step 13 min=(sec%3600)/60
Step 14 sec3=sec%60 
Step 15 if (hrs+"").length()!=2
Step 16 print "0"+hrs+":"
Step 17 else
Step 18 print hrs+":"
Step 19 if (min+"").length()!=2
Step 20 print "0"+min+":"
Step 21 else
Step 22 print min+":"
Step 23 if (sec3+"").length()!=2
Step 24 print  "0"+sec3
Step 25 else
Step 26 print sec3
Step 27 end
