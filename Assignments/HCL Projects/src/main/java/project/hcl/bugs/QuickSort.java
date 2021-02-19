package project.hcl.bugs;

import java.util.ArrayList;

public class QuickSort {
	
	//begin Quicksort
    public void sort(ArrayList<Integer> arr, int low, int high)
    {
        if (low < high)
        {
            int piv = partition(arr, low, high);

            sort(arr, low, piv-1);
            sort(arr, piv+1, high);
        }
    }

    public int partition(ArrayList<Integer> arr, int low, int high)
    {
        int pivot = arr.get(high);
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        { 
            if (arr.get(j) <= pivot)
            {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr.get(i+1);
        arr.set(i+1, arr.get(high));
        arr.set(high, temp);

        return i+1;
    }
}
