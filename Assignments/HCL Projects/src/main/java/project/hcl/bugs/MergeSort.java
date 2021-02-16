package project.hcl.bugs;

import java.util.ArrayList;

public class MergeSort {
	public void merge(ArrayList<Integer> arr, Integer l, Integer m, Integer r)
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
            	arr.set(k, L[i]);
                i++;
            }
            else
            {
            	arr.set(k, R[j]);
                j++;
            }
            k++;
        }
        while (i < n1)
        {
        	arr.set(k,L[i]);
            i++;
            k++;
        }

        
        while (j < n2)
        {
        	arr.set(k, R[j]);
            j++;
            k++;

    }
        
    }
}
