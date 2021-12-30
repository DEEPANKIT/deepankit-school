Step 1 - class mergesort
Step 2 - void mergeSort(int[] a, int n) 
Step 3 - if n < 2
Step 4 - return
Step 5 - endif
Step 6 - mid = n / 2;
Step 7 - l = new int[mid]
Step 8 - r = new int[n - mid]
Step 9 - for i = 0 to mid-1 inc 1 
Step 10 - l[i] = a[i]
Step 11 - endfor
Step 12 - for i = mid to n-1 inc 1
Step 13 - r[i - mid] = a[i]
Step 14 - endfor
Step 15 - mergeSort(l, mid)
Step 16 -mergeSort(r, n - mid)
Step 17 - merge(a, l, r, mid, n - mid)
Step 18 - endmergeSort(int[] a, int n)
Step 19 - void merge(int[] a, int[] l, int[] r, int left, int right) 
Step 20 - i = 0, j = 0, k = 0
Step 21 - while i < left && j < right
Step 22 - if l[i] <= r[j] goto step 23 else goto step 24
Step 23 - a[k++] = l[i++]
Step 24 - a[k++] = r[j++]
Step 25 - endif
Step 26 - endwhile
Step 27 - while i < left
Step 28 - a[k++] = l[i++]
Step 29 - endwhile
Step 30 - while j < right
Step 31 - a[k++] = r[j++]
Step 32 - endwhile(step )
Step 33 - endwhile(step )
Step 34 - endmerge(int[] a, int[] l, int[] r, int left, int right)
Step 35 - void main(String hj[])
Step 36 - Scanner s=new Scanner(System.in);
Step 37 - println "Enter value of n"
Step 38 - input n
Step 39 - println "Enter values..."
Step 40 - inputArray[]=new int[n]
Step 41 - for i=0 to n-1 inc 1
Step 42 - input inputArray[i]
Step 43 - endfor
Step 44 - mergeSort(inputArray,n)
Step 45 - for i=0 to n-1 inc 1
Step 46 - print inputArray[i]+","
Step 47 - endfor
Step 48 - endclassmergesort
Step 49 - end