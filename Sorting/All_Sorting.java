Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves, calls itself for the
two halves and then merges the two sorted halves. The merge() function is used for merging two halves. 
The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two 
sorted sub-arrays into one. See following C implementation for details.
MergeSort(arr[], l,  r)
If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = (l+r)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
The following diagram from wikipedia shows the complete merge sort process for an example array {38, 27, 43, 3, 9, 82, 10}.
If we take a closer look at the diagram, we can see that the array is recursively divided in two halves till the size becomes 1
Once the size becomes 1, the merge processes comes into action and starts merging arrays back till the complete array is
merged.
Merge-Sort


http://quiz.geeksforgeeks.org/merge-sort/            MERGE SORT



http://quiz.geeksforgeeks.org/quick-sort/         	QUICK SORT




http://www.geeksforgeeks.org/radix-sort/           RADIX SORT



Algorithm
---------
https://www.youtube.com/watch?v=sSrmFnNm5lc   : Merge Sort
https://www.youtube.com/watch?v=j8N6J9awGMM   : Quick Sort

