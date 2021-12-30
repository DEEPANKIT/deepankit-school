Step 1 Main() 
Step 2 Scanner sc= new  Scanner( System.in);
Step 3 l=Input length of array
Step 4 arr=new  int(l)
Step 5 for(x=0;x<l;x++)
Step 6 input array elements
Step 7 end of for loop
Step 8 input number to be searched
Step 9 BinarySearchRecursion q=new BinarySearchRecursion()
Step 10 if q.bsearch(arr,num,0,l-1)
Step 11 print found
Step 12 else
Step 13 print not found
Step 14 bsearch(int arr[],int num,int l,int h)
Step 15 if l>h
Step 16 return false
Step 17 else
Step 18 mid=(l+h)/2
Step 19 if arr[m]=num
Step 20 return true
Step 21 else
Step 22 if num>arr[mid]
Step 23 return bsearch(arr,num,mid+1,h)
Step 24 else
Step 25 return bsearch(arr,num,l,mid-1)
Step 26 end of else
Step 27 end 
