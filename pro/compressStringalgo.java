Step - 1   main(String h[])
Step - 2   input inputString
Step - 3   String wordArray[]=inputString.split(" ")
Step - 4   for i=1 to i<=wordArray.length inc=+1
Step - 5   if wordArray[i-1]!=null then goto Step - 6 else goto Step - 7
Step - 6   print(wordArray[i-1]+" "+i+",")
Step - 7   end if
Step - 8   for j=i j<wordArray.length inc=+1
Step - 9   if wordArray[i-1]!=null&&wordArray[j]!=null then goto Step - 10 else goto Step - 14
Step - 10  if wordArray[i-1].equalsIgnoreCase(wordArray[j] then goto Step - 11 else goto Step - 13 
Step - 11  wordArray[j]=null
Step - 12  print(j+1+",")
Step - 13  end inner if
Step - 14  end outer if
Step - 15  end inner for
Step - 16  println()
Step - 17  wordArray[i-1]=null
Step - 18  end outer for
Step - 19  end main()