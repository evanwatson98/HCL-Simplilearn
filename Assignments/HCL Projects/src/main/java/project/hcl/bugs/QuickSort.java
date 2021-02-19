package project.hcl.bugs;

import java.util.ArrayList;

public class QuickSort {

//	ArrayList<Integer> arr;
//	
//	public QuickSort(ArrayList<Integer> nArr) {
//		this.arr = nArr;
//	}

    int partition(ArrayList<Integer> arr, int low, int high)
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
//                arr[i] = arr[j];
                arr.set(i, arr.get(j));
//                arr[j] = temp;
                arr.set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr.get(i+1);
//        arr[i+1] = arr[high];
        arr.set(i+1, arr.get(high));
        arr.set(high, temp);
//        arr[high] = temp;

        return i+1;
    }



    void sort(ArrayList<Integer> arr, int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);

            
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}
