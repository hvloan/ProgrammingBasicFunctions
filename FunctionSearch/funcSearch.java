package FunctionSearch;

import java.util.Arrays;
import java.util.Iterator;

public class funcSearch {
	public static int linearSearch(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l,  mid - 1, x);
            } 
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

	public static int interpolationSearch(int[] data, int item) {

	    int highEnd = (data.length - 1);
	    int lowEnd = 0;
	    while (item >= data[lowEnd] && item <= data[highEnd] && lowEnd <= highEnd) {
	        int probe = lowEnd + (highEnd - lowEnd) * (item - data[lowEnd]) / (data[highEnd] - data[lowEnd]);
	        if (highEnd == lowEnd) {
	            if (data[lowEnd] == item) {
	                return lowEnd;
	            } else {
	                return -1;
	            }
	        }
	        if (data[probe] == item) {
	            return probe;
	        }
	        if (data[probe] < item) {
	            lowEnd = probe + 1;
	        } else {
	            highEnd = probe - 1;
	        }
	    }
	    return -1;
	}
	
	public static int ternarySearch(int l, int r, int key, int ar[]) {
		if (r >= l) {
			int mid1 = l + (r - l) / 3;
			int mid2 = r - (r - l) / 3;
			if (ar[mid1] == key) {
				return mid1;
			}
	        if (ar[mid2] == key) {
	        	return mid2;
	        }
	        if (key < ar[mid1]) {
	            return ternarySearch(l, mid1 - 1, key, ar);
	        }
	        else if (key > ar[mid2]) {
	        	return ternarySearch(mid2 + 1, r, key, ar);
	        }
	        else {
	        	return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
	        }
	    }
	    return -1;
	}
	
	public static int jumpSearch(int[] arr, int x) {
		int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while (arr[Math.min(step, n)-1] < x)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        while (arr[prev] < x)
        {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }
        if (arr[prev] == x)
            return prev;
 
        return -1;
    }

	public static int exponentialSearch(int arr[], int n, int x) {
		if (arr[0] == x)
		return 0;
		int i = 1;
		while (i < n && arr[i] <= x)
		i = i*2;
		return Arrays.binarySearch(arr, i/2,
		         Math.min(i, n-1), x);
		}
}
