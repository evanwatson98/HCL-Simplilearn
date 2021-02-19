package project.hcl.bugs;

import java.util.ArrayList;

public class MergeSort {
	
	ArrayList<Integer> arr;

	public void merge(int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
        
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr.get(l + i);
        for (int j=0; j<n2; ++j)
            R[j] = arr.get(m + 1+ j);



        int i = 0, j = 0;

                int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
            	this.arr.set(k, L[i]);
                i++;
            }
            else
            {
            	this.arr.set(k, R[j]);
                j++;
            }
            k++;
        }
        while (i < n1)
        {
        	this.arr.set(k,L[i]);
            i++;
            k++;
        }

        
        while (j < n2)
        {
        	this.arr.set(k, R[j]);
            j++;
            k++;

    }
        
    }
	
	
	void sort(ArrayList<Integer> arr, Integer l, Integer r)
    {
		this.arr = arr;
		System.out.println("Sort");
        if (l < r)
        {
            int m = (l+r)/2;
            
            sort(arr, l, m);
            sort(arr , m+1, r);
            
            merge(l, m, r);
        }
        
        System.out.println("Merge" + arr.toString());
    }

        static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
