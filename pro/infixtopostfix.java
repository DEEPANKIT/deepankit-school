Step 1 start of class postfix
Step 2 main()
Step 3 s1=""
Step 4 z=0
Step 5 print enter infix expression
Step 6 input s
Step 7 arr[]=new char[s.length()]
Step 8 for(x=0;x<s.length();x++)
Step 9 c=s.charAt(x)
Step 10 if(('a'<=c && c<='z') || ('A'<=c && c<='Z'))
Step 11 s1=s1+c 
Step 12 else
Step 13 if(c=='-' || c=='+')
Step 14 for(y=arr.length-1;y>=0;y--)
Step 15 if(arr[y]=='[' || arr[y]=='{' || arr[y]=='(') then break the loop
Step 16 if(arr[y]!='\u0000') then s1=s1+arr[y] and arr[y]='\u0000'
Step 17 end of inner for loop
Step 18 end of if block
Step 19 else
Step 20 if(c=='*' || c=='/')
Step 21 for(y=arr.length-1;y>=0;y--)
Step 22 if(arr[y]=='[' || arr[y]=='{' || arr[y]=='(') the break the loop
Step 23 if((arr[y]!='\u0000') && (arr[y]!='+' && arr[y]!='-')) then s1=s1+arr[y] and arr[y]='\u0000'
Step 24 end of inner for loop
Step 25 end of if block
Step 26 else
Step 27 if(c=='^')
Step 28 for(y=arr.length-1;y>=0;y--)
Step 29 if(arr[y]=='[' || arr[y]=='{' || arr[y]=='(') then break
Step 30 if((arr[y]!='\u0000') && (arr[y]!='+' && arr[y]!='-' && arr[y]!='*' && arr[y]!='/'))
Step 31 s1=s1+arr[y] and arr[y]='\u0000'
Step 32 end of inner for loop
Step 33 end of if block
Step 34 else
Step 35 if(c==']' || c=='}' || c==')')
Step 36 for(y=arr.length-1;y>=0;y--)
Step 37 if(arr[y]=='[' || arr[y]=='{' || arr[y]=='(') then arr[y]='\u0000' and break
Step 38 if(arr[y]!='\u0000') then s1=s1+arr[y];
Step 39 arr[y]='\u0000'
Step 40 end of inner for
Step 41 end of if block
Step 42 for(y=0;y<arr.length-1;y++)
Step 43 if(arr[y]=='\u0000')
Step 44 for(z=y+1;z<arr.length-1;z++)
Step 45 if(arr[z]!='\u0000') then arr[y]=arr[z] and arr[z]='\u0000' and the break
Step 46 end of inner for loop
Step 47 if(c!=']' && c!='}' && c!=')')
Step 48 for(y=0;y<arr.length;y++)
Step 49 if(arr[y]=='\u0000') then arr[y]=c and break
Step 50 end of if
Step 51 if(x==s.length()-1)
Step 52 for(y=arr.length-1;y>=0;y--)
Step 53 if(arr[y]!='\u0000') then s1=s1+arr[y]
Step 54 end of outer for
Step 55 print postfix expression
Step 56 end of main()
Step 57 end of class postfix











