class peakElement
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array arr[]
    public int peakElements(int[] arr, int n)
    {
        if (n == 1) {
            return 0; // Single element is the peak element
        }
        
        // Check for the first element
        if (arr[0] >= arr[1]) {
            return 0;
        }
        
        // Check for the last element
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }
        
        // Check for peak element in the middle
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        
        return -1; // Default return value, though this line may never be reached
    }
}
