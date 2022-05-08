package SortFunction;

import java.util.Iterator;

import javax.swing.LayoutFocusTraversalPolicy;

public class funcSort {
	public static void swap(int a, int b) {
		int temp = a;
		a= b;
		b = temp;
	}
	
	public void interchangeSort(int a[], int n){
		int i,j;
		for(i=0; i<n-1; i++){
			for(j=i+1; j<n; j++){
				if(a[i]>a[j]){
					swap(a[i],a[j]);
				}
			}
		}
	}
	
	public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            swap(min_idx, arr[i]);
        }
    }

	public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = n - 1; j > i; j--)
                if (arr[j] < arr[j - 1]) {
                    swap(arr[j], arr[j-1]);
                }
	}
	
	public static void ShakerSort(int a[], int n) {
	    int Left = 0;
	    int Right = n - 1;
	    int k = 0;
	    int i;
	    while (Left < Right)
	    {
	        for (i = Left; i < Right; i++)
	        {
	            if (a[i] > a[i + 1])
	            {
	                swap(a[i], a[i + 1]);
	                k = i;
	            }
	         }
	        Right = k;
	        for (i = Right; i > Left; i--)
	        {
	            if (a[i] < a[i - 1])
	            {
	                swap(a[i], a[i - 1]);
	                k = i;
	            }
	        }
	        Left = k;
	    }
	}
	
	public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

	private static void binaryInsertionSort(int arr[], int n) {
		int l, r, m;
		int x;
		for (int i = 0; i < n; i++) {
			x = arr[i];
			l = 0;
			r = i - 1;
			while (l <= r) {
				m = (l + r) / 2;
				if (x < arr[m]) {
					r = m - 1;
				} else {
					l = m + 1;
				}
			}
			for (int j = i - 1; j >= 1; j--) {
				arr[j+1] = arr[j];
			}
			arr[l] = x;
		}
	}

	public static void shellSort(int a[], int n){
		int interval, i, j, temp;
		for(interval = n/2; interval > 0; interval /= 2){
			for(i = interval; i < n; i++){
				temp = a[i];
				for(j = i; j >= interval && a[j - interval] > temp; j -= interval){
					a[j] = a[j - interval];				
				}
				a[j] = temp;
			}
	    }
	}
	
	public static void heapifySort(int arr[], int n, int i) {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            swap(arr[i], arr[largest]);
            heapifySort(arr, n, largest);
        }
    }
	
	public void heapSortort(int arr[]) {
        int n = arr.length;
 
        for (int i = n / 2 - 1; i >= 0; i--)
            heapifySort(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            swap(arr[0], arr[i]);
            heapifySort(arr, i, 0);
        }
    }

	static int partition(int[] arr, int low, int high) {
	    int pivot = arr[high];
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (arr[j] < pivot)
	        {
	            i++;
	            swap(arr[i], arr[j]);
	        }
	    }
	    swap(arr[i + 1], arr[high]);
	    return (i + 1);
	}
	
	public static void quickSort(int[] arr, int low, int high) {
	    if (low < high)
	    {
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	
	public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	
	public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m =l+ (r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
	
}
